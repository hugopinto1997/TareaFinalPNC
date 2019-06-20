package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.*;

@Service
public interface SucursalService {
	 public List<Sucursal> listaSucursales() throws DataAccessException;
	 public Sucursal findSucursal(Integer id) throws DataAccessException;
	 public int Update(SucursalDTO suc1) throws DataAccessException;
	 public int Agregar(SucursalDTO suc12) throws DataAccessException;
	 public int Delete(Integer idSuc) throws DataAccessException;

}
