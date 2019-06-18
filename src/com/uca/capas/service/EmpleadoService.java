package com.uca.capas.service;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import java.util.List;

@Service
public interface EmpleadoService {
	public List<Empleado> empxsuc(Integer id) throws DataAccessException;
}
