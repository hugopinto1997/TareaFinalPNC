package com.uca.capas.service;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.SucursalDTO;
import com.uca.capas.dto.EmpleadoDTO;

import java.util.List;

@Service
public interface EmpleadoService {
	public List<Empleado> empxsuc(Integer id) throws DataAccessException;
	public Empleado findEmpleado(Integer id) throws DataAccessException;
	public int Agregar(EmpleadoDTO emp) throws DataAccessException;
	public int Update(EmpleadoDTO emp) throws DataAccessException;
	 public int Delete(Integer idEmp) throws DataAccessException;

}
