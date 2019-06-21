package com.uca.capas.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.dto.EmpleadoDTO;
import com.uca.capas.dto.SucursalDTO;
import com.uca.capas.repositories.EmpleadoRepository;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	EmpleadoRepository eR;
	
	@Autowired
	SucursalRepository sR;
	
	@Autowired
	EntityManager entityManager;
	
	public List<Empleado> empxsuc(Integer id){
		return eR.listaempxsuc(id);
	}
	
	@Override
	@Transactional
	public int Agregar(EmpleadoDTO emp) throws DataAccessException{
		Empleado empleado = new Empleado();
		empleado.seteNombre(emp.geteNombre());
		empleado.seteEdad(emp.geteEdad());
		empleado.setSucursal(sR.findOne(emp.getIdSucursal()));
		empleado.seteEstado(emp.getState());
		empleado.seteGenero(emp.getGender());
		entityManager.persist(empleado);
		entityManager.flush();
		return 1;
	}
	
	@Override
	@Transactional
	public int Update(EmpleadoDTO emp) throws DataAccessException{
		Empleado empleado = new Empleado();
		empleado.setIdEmpleado(emp.getIdEmpleado());
		empleado.seteNombre(emp.geteNombre());
		empleado.seteEdad(emp.geteEdad());
		empleado.setSucursal(sR.findOne(emp.getIdSucursal()));
		empleado.seteEstado(emp.getState());
		empleado.seteGenero(emp.getGender());
		entityManager.merge(empleado);
		entityManager.flush();
		return 1;
	}
	
	@Override
	@Transactional
	public Empleado findEmpleado(Integer id) throws DataAccessException {
		return eR.findOne(id);
	}
	
	@Override
	@Transactional
	public int Delete(Integer idEmp) throws DataAccessException {
		entityManager.remove(eR.findOne(idEmp));
		entityManager.flush();
		return 1;
	}
}
