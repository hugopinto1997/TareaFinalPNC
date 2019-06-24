package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.uca.capas.dto.LoginUsuarioDTO;
import com.uca.capas.dto.SucursalDTO;
import com.uca.capas.service.UsuarioService;

@Controller
public class MainController {
	
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usuario", new LoginUsuarioDTO());
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping(value="/")
	public ModelAndView login2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usuario", new LoginUsuarioDTO());
		mav.setViewName("login");
		return mav;
	}
	
	
}
