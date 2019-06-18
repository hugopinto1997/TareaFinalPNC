package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;

@Service
public interface SucursalService {
	 public List<Sucursal> listaSucursales() throws DataAccessException;
	 public Sucursal findSucursal(Integer id) throws DataAccessException;

}
