package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.domain.Empleado;
import com.uca.capas.dto.*;
import com.uca.capas.repositories.SucursalRepository;
import com.uca.capas.service.EmpleadoService;
import com.uca.capas.service.SucursalService;
import com.uca.capas.service.UsuarioService;

@Controller
public class SucursalController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	SucursalService sucursalService;
	
	@Autowired
	EmpleadoService empleadoService;
	
	@RequestMapping("/home")
	public ModelAndView home(@ModelAttribute LoginUsuarioDTO usuario) {
		ModelAndView mav = new ModelAndView();
		Usuario u = new Usuario();
		Sucursal s1 = new Sucursal();
		u = usuarioService.loginValidation(usuario.getuCorreo(), usuario.getuPassword());
		List<Sucursal> sucursales = null;
		sucursales = sucursalService.listaSucursales();
		if(u != null) {
			mav.addObject("s", sucursales);
			mav.addObject("s1", s1);
			mav.setViewName("home");
		}else {
			mav.addObject("usuario", new LoginUsuarioDTO());
			mav.setViewName("login");
		}
		return mav;
	}
	
	@RequestMapping("/verperfil")
	public ModelAndView home(@RequestParam(value ="identi")int idSuc) {
		ModelAndView mav = new ModelAndView();
		Sucursal sucu = null;
		List<Empleado> el = null;
		el = empleadoService.empxsuc(idSuc);
		sucu = sucursalService.findSucursal(idSuc);
		
			mav.addObject("s", sucu);
			mav.addObject("e", el);
			mav.setViewName("perfilsuc");
		return mav;
	}
	
	@RequestMapping("/backhome")
	public ModelAndView homeb(@RequestParam(value ="flag")int idSuc) {
		ModelAndView mav = new ModelAndView();
		if(idSuc != 0) {
			
			List<Sucursal> sl = null;
			sl = sucursalService.listaSucursales();
			Sucursal sx = new Sucursal();
			
				mav.addObject("s", sl);
				mav.addObject("s1", sx);
				mav.setViewName("home");
		}
		return mav;
	}
	
	@RequestMapping("/editperfil")
	public ModelAndView home2(@RequestParam(value ="ide")int idSuc) {
		ModelAndView mav = new ModelAndView();
			Sucursal nSuc = new Sucursal();
			nSuc = sucursalService.findSucursal(idSuc);
			
			SucursalDTO nSuc1 = new SucursalDTO();
			
			mav.addObject("nsuc", nSuc);
			mav.addObject("nsuc1", nSuc1);

			mav.setViewName("editsuc");
		return mav;
	}
	
	@RequestMapping("/guardareditsuc")
	public ModelAndView home3(@ModelAttribute SucursalDTO nsuc1) {
		ModelAndView mav = new ModelAndView();
		SucursalDTO sucu2 = nsuc1;
		
		List<Empleado> el2 = null;
		el2 = empleadoService.empxsuc(nsuc1.getIdSucursal());
		
		sucursalService.Update(sucu2);

		
			mav.addObject("s", nsuc1);
			mav.addObject("e", el2);
			mav.setViewName("perfilsuc");
		return mav;
	}
}
