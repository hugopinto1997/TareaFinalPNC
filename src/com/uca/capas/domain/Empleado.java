package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uca.capas.domain.Sucursal;

@Entity
@Table(schema = "public", name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(generator="empleado_id_empleado_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_id_empleado_seq", sequenceName = "public.empleado_id_empleado_seq")
	@Column(name = "id_empleado")
	private Integer idSucursal;
	
	@Column(name = "enombre")
	private String eNombre;
	
	@Column(name = "eedad")
	private Integer eEdad;
	
	@Column(name = "egenero")
	private boolean eGenero;
	
	@Column(name = "eestado")
	private boolean eEstado;
	
	@ManyToOne(fetch= FetchType.LAZY)
	 @JoinColumn(name="id_sucursal")
	 private Sucursal sucursal;
	
	//Metodos Delegate
	public String getEstadoString() {
		if(this.eEstado) {
			return "Activo";
		}else {
			return "Inactivo";
		}
	}
	
	public String getGeneroString() {
		if(this.eGenero) {
			return "Masculino";
		}else {
			return "Femenino";
		}
	}

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String geteNombre() {
		return eNombre;
	}

	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}

	public Integer geteEdad() {
		return eEdad;
	}

	public void seteEdad(Integer eEdad) {
		this.eEdad = eEdad;
	}

	public boolean iseGenero() {
		return eGenero;
	}

	public void seteGenero(boolean eGenero) {
		this.eGenero = eGenero;
	}

	public boolean iseEstado() {
		return eEstado;
	}

	public void seteEstado(boolean eEstado) {
		this.eEstado = eEstado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	
	

}
