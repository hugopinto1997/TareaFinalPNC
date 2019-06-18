package com.uca.capas.service;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Usuario;

@Service
public interface UsuarioService {
	 public Usuario loginValidation(String correo, String pass) throws DataAccessException;
}
