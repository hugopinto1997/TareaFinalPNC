package com.uca.capas.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uca.capas.domain.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query(nativeQuery= true,value="select * "
			+"from usuario "
			+ "where ucorreo = ?1 and upassword = ?2")
    public Usuario validarCredenciales(String correo, String pass);
}
