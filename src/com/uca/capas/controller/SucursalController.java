package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ModelAndView home(@Valid @ModelAttribute("usuario") LoginUsuarioDTO usuario, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		Usuario u = new Usuario();
		Sucursal s1 = new Sucursal();
		if(result.hasErrors()) {
			mav.addObject("usuario", usuario);
			mav.setViewName("login");
		}else {
			u = usuarioService.loginValidation(usuario.getuCorreo(), usuario.getuPassword());
			List<Sucursal> sucursales = null;
			sucursales = sucursalService.listaSucursales();
				mav.addObject("s", sucursales);
				mav.addObject("s1", s1);
				mav.setViewName("home");
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
		SucursalDTO sd= sucursalService.SucToDTO(sucu.getIdSucursal());
			mav.addObject("s", sd);
			mav.addObject("e", el);
			mav.setViewName("perfilsuc");
		return mav;
	}
	
	@RequestMapping("/backhome")
	public ModelAndView homeb(@RequestParam(value ="flag")int idSuc) {
		ModelAndView mav = new ModelAndView();
			
			List<Sucursal> sl = null;
			sl = sucursalService.listaSucursales();
			Sucursal sx = new Sucursal();
			
				mav.addObject("s", sl);
				mav.addObject("s1", sx);
				mav.setViewName("home");
		
		return mav;
	}
	
	@RequestMapping("/editperfil")
	public ModelAndView home2(@RequestParam(value ="ide")int idSuc) {
		ModelAndView mav = new ModelAndView();
		
		Sucursal nSuc = new Sucursal();	
		nSuc = sucursalService.findSucursal(idSuc);
		SucursalDTO nSuc1 = new SucursalDTO();
		nSuc1.setIdSucursal(idSuc);

		mav.addObject("nsuc", nSuc);
		mav.addObject("nsuc1", nSuc1);
		mav.setViewName("editsuc");
		
		return mav;
	}
	@RequestMapping("/editperfil2")
	public ModelAndView home4(@RequestParam(value ="ide")int idSuc) {
		ModelAndView mav = new ModelAndView();
		Sucursal nSuc = new Sucursal();	
			nSuc = sucursalService.findSucursal(idSuc);
			SucursalDTO nSuc1 = new SucursalDTO();
			nSuc1.setIdSucursal(idSuc);

			mav.addObject("nsuc", nSuc);
			mav.addObject("nsuc1", nSuc1);
			mav.setViewName("agregarsuc");
		return mav;
	}
	
	@RequestMapping(value="/guardareditsuc",method= RequestMethod.POST)
	public ModelAndView home4(@Valid @ModelAttribute("nsuc1") SucursalDTO nsuc1, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		SucursalDTO sucu2 = nsuc1;
			
		if(result.hasErrors()) {
			Sucursal nSuc = new Sucursal();	
			nSuc.setIdSucursal(nsuc1.getIdSucursal());
			mav.addObject("nsuc",nSuc);
			mav.addObject("nsuc1",nsuc1);
			mav.setViewName("editsuc");
		}else {
			sucursalService.Update(sucu2);
			List<Empleado> el2 = null;
			
				
				el2 = empleadoService.empxsuc(nsuc1.getIdSucursal());
				mav.addObject("s", sucu2);
				mav.addObject("e", el2);
				mav.setViewName("perfilsuc");
		}
		
			
		return mav;
	}
	
	@RequestMapping(value="/savesuc",method= RequestMethod.POST)
	public ModelAndView homefd3(@Valid @ModelAttribute("nsuc1") SucursalDTO nsuc1, BindingResult result) {
		ModelAndView mav = new ModelAndView();

		if(result.hasErrors()) {
			//SucursalDTO nSuc1 = new SucursalDTO();

			mav.addObject("nsuc1", nsuc1);
			mav.setViewName("agregarsuc");
		}else {
			SucursalDTO sucu2 = nsuc1;
			SucursalDTO sucu3 = null;
			List<Sucursal> el2 = null;
			
			sucursalService.Agregar(sucu2);
			
			el2 = sucursalService.listaSucursales();
			mav.addObject("s", el2);
			mav.addObject("s1", sucu3);
			mav.setViewName("home");
		}
		return mav;
	}
	
	@RequestMapping(value="/delete",method= RequestMethod.POST)
	public ModelAndView addsufffc(@RequestParam(value ="i")int idSuc) {
		ModelAndView mav = new ModelAndView();
		sucursalService.Delete(idSuc);
		List<Sucursal> sl = null;
		sl = sucursalService.listaSucursales();
		Sucursal sx = new Sucursal();
		
			mav.addObject("s", sl);
			mav.addObject("s1", sx);
			mav.setViewName("home");
		
		return mav;
	}
	
	
	
}
