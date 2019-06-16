package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.dto.*;
import com.uca.capas.service.UsuarioService;

@Controller
public class SucursalController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/home")
	public ModelAndView home(@ModelAttribute LoginUsuarioDTO usuario) {
		ModelAndView mav = new ModelAndView();
		Usuario u = new Usuario();
		u = usuarioService.loginValidation(usuario.getuCorreo(), usuario.getuPassword());
		if(u != null) {
			mav.setViewName("home");
		}else {
			mav.addObject("usuario", new LoginUsuarioDTO());
			mav.setViewName("login");
		}
		return mav;
	}
}
