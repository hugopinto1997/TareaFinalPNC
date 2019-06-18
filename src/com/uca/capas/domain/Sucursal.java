package com.uca.capas.domain;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(schema = "public", name = "sucursal")
public class Sucursal {
	
	@Id
	@GeneratedValue(generator="sucursal_id_sucursal_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_id_sucursal_seq", sequenceName = "public.sucursal_id_sucursal_seq")
	@Column(name = "id_sucursal")
	private Integer idSucursal;
	
	@Column(name = "sucnombre")
	private String sucNombre;
	
	@Column(name = "suchoraentrada")
	private Time hEntrada;
	
	@Column(name = "suchorasalida")
	private Time hSalida;
	
	@Column(name = "sucubicacion")
	private String sucUbicacion;
	
	@Column(name = "sucnmesas")
	private Integer nMesas;
	
	@Column(name = "sucgerente")
	private String sucGerente;
	
	@OneToMany(mappedBy="sucursal",fetch= FetchType.LAZY,orphanRemoval=true,cascade=CascadeType.PERSIST)
	private List<Empleado> empleados;
	
	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getSucNombre() {
		return sucNombre;
	}

	public void setSucNombre(String sucNombre) {
		this.sucNombre = sucNombre;
	}

	public Time gethEntrada() {
		return hEntrada;
	}

	public void sethEntrada(Time hEntrada) {
		this.hEntrada = hEntrada;
	}

	public Time gethSalida() {
		return hSalida;
	}

	public void sethSalida(Time hSalida) {
		this.hSalida = hSalida;
	}

	public String getSucUbicacion() {
		return sucUbicacion;
	}

	public void setSucUbicacion(String sucUbicacion) {
		this.sucUbicacion = sucUbicacion;
	}

	public Integer getnMesas() {
		return nMesas;
	}

	public void setnMesas(Integer nMesas) {
		this.nMesas = nMesas;
	}

	public String getSucGerente() {
		return sucGerente;
	}

	public void setSucGerente(String sucGerente) {
		this.sucGerente = sucGerente;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
}
