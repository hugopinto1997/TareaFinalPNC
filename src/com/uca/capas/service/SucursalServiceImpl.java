package com.uca.capas.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.*;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {
	
	@Autowired
	SucursalRepository sR;
	
	@Autowired
	 private EntityManager entityManager;
	
	public List<Sucursal> listaSucursales(){
		return sR.findAll();
	}
	
	public Sucursal findSucursal(Integer id){
		return sR.findOne(id);
	}
	
	@Override
	@Transactional
	public int Update(SucursalDTO suc1) throws DataAccessException{
		Sucursal s = sR.findOne(suc1.getIdSucursal());
		s.setIdSucursal(suc1.getIdSucursal());
		s.setSucNombre(suc1.getSucNombre());
		s.sethEntrada(suc1.gethEntrada());
		s.sethSalida(suc1.gethSalida());
		s.setnMesas(suc1.getnMesas());
		s.setSucUbicacion(suc1.getSucUbicacion());
		s.setSucGerente(suc1.getSucGerente());
		entityManager.merge(s);
		entityManager.flush();
		return 1;
	}
}
