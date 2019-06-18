package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
	public List<Sucursal> findAll();
	
	/*@Query(nativeQuery= true,value="select * "
			+"from sucursal "
			+ "where id_sucursal = ?1")*/
	public Sucursal findOne(Integer id);

}
