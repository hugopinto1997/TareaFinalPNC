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
		s.sethEntrada(suc1.getEntrada());
		s.sethSalida(suc1.getSalida());
		s.setnMesas(suc1.getnMesas());
		s.setSucUbicacion(suc1.getSucUbicacion());
		s.setSucGerente(suc1.getSucGerente());
		entityManager.merge(s);
		entityManager.flush();
		return 1;
	}
	
	@Override
	@Transactional
	public int Agregar(SucursalDTO suc12) throws DataAccessException{
		Sucursal s3 = new Sucursal();
		s3.setSucNombre(suc12.getSucNombre());
		s3.sethEntrada(suc12.getEntrada());
		s3.sethSalida(suc12.getSalida());
		s3.setnMesas(suc12.getnMesas());
		s3.setSucUbicacion(suc12.getSucUbicacion());
		s3.setSucGerente(suc12.getSucGerente());
		entityManager.persist(s3);
		entityManager.flush();
		return 1;
	}
	
	public SucursalDTO SucToDTO(Integer id) throws DataAccessException{
		Sucursal s = sR.findOne(id);
		SucursalDTO sdto = new SucursalDTO();
		sdto.sethEntrada(s.getHoraEString());
		sdto.sethSalida(s.getHoraSString());
		sdto.setIdSucursal(id);
		sdto.setSucGerente(s.getSucGerente());
		sdto.setSucNombre(s.getSucNombre());
		sdto.setSucUbicacion(s.getSucUbicacion());
		sdto.setnMesas(s.getnMesas());
		return sdto;
	}
	
	@Override
	@Transactional
	public int Delete(Integer id) throws DataAccessException{
		Sucursal sd = null;
		sd = sR.findOne(id);
		entityManager.remove(sd);
		entityManager.flush();
		return 1;
	}
}
