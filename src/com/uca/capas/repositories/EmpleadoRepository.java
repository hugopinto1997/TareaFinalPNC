package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.uca.capas.domain.Empleado;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
	@Query(nativeQuery= true,value="select * "
			+"from empleado "
			+ "where id_sucursal = ?1")
	public List<Empleado> listaempxsuc(Integer id);
}
