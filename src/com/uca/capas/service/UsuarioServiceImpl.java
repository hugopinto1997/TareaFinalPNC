package com.uca.capas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.repositories.UsuarioRepository;
import com.uca.capas.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	
	 public Usuario loginValidation(String correo, String pass) {
		 return usuarioRepo.validarCredenciales(correo, pass);
	 }

}
