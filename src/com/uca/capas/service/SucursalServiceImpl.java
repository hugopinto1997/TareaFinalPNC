package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {
	
	@Autowired
	SucursalRepository sR;
	
	
	public List<Sucursal> listaSucursales(){
		return sR.findAll();
	}
	
	public Sucursal findSucursal(Integer id){
		return sR.findOne(id);
	}
}
