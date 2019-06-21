package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.service.EmpleadoService;
import com.uca.capas.service.SucursalService;
import com.uca.capas.dto.*;

@Controller
public class EmpleadoController {
	@Autowired
	SucursalService sucursalService;
	
	@Autowired
	EmpleadoService empleadoService;
	
	@RequestMapping("/agregaremp")
	public ModelAndView agregaremp(@RequestParam(value ="idemp")int idSuc) {
		ModelAndView mav = new ModelAndView();
		EmpleadoDTO e = new EmpleadoDTO();
		e.setIdSucursal(idSuc);
		
		mav.addObject("e", e);	
		mav.setViewName("agregaremp");
		return mav;
	}
	
	@RequestMapping(value="/saveemp",method= RequestMethod.POST)
	public ModelAndView home3(@ModelAttribute EmpleadoDTO e) {
		ModelAndView mav = new ModelAndView();
		EmpleadoDTO e2 = e;
		SucursalDTO sucu = sucursalService.SucToDTO(e2.getIdSucursal());

		List<Empleado> el2 = null;
		
			empleadoService.Agregar(e2);
			
			el2 = empleadoService.empxsuc(e2.getIdSucursal());
			mav.addObject("s", sucu);
			mav.addObject("e", el2);
			mav.setViewName("perfilsuc");	
		return mav;
	}
	
	@RequestMapping("/editemp")
	public ModelAndView editaremp(@RequestParam(value ="idemp")int idEmp) {
		ModelAndView mav = new ModelAndView();
		Empleado e = empleadoService.findEmpleado(idEmp);
		EmpleadoDTO e2 = new EmpleadoDTO();
		e2.setIdEmpleado(idEmp);
		e2.setIdSucursal(empleadoService.findEmpleado(idEmp).getSucursal().getIdSucursal());
		
		mav.addObject("e", e);
		mav.addObject("e1", e2);
		mav.setViewName("editaremp");
		return mav;
	}
	
	@RequestMapping(value="/updateemp",method= RequestMethod.POST)
	public ModelAndView home23(@ModelAttribute EmpleadoDTO e) {
		ModelAndView mav = new ModelAndView();
		EmpleadoDTO e2 = e;
		SucursalDTO sucu = sucursalService.SucToDTO(e2.getIdSucursal());

		List<Empleado> el2 = null;
		
			empleadoService.Update(e2);
			
			el2 = empleadoService.empxsuc(e2.getIdSucursal());
			mav.addObject("s", sucu);
			mav.addObject("e", el2);
			mav.setViewName("perfilsuc");	
		return mav;
	}
	
	@RequestMapping("/delemp")
	public ModelAndView delemp(@RequestParam(value ="id")int idEmp) {
		ModelAndView mav = new ModelAndView();
		int idSucursal = empleadoService.findEmpleado(idEmp).getSucursal().getIdSucursal();
		empleadoService.Delete(idEmp);
		SucursalDTO sucu = sucursalService.SucToDTO(idSucursal);

		List<Empleado> el2 = null;
					
			el2 = empleadoService.empxsuc(idSucursal);
			mav.addObject("s", sucu);
			mav.addObject("e", el2);
			mav.setViewName("perfilsuc");
	
		return mav;
	}
}
