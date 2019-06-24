package com.uca.capas.dto;

import java.sql.Time;


import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.uca.capas.domain.Empleado;

public class SucursalDTO {
	
	private Integer idSucursal;
	
	@NotEmpty(message="Este campo es requerido")
	private String sucNombre;

	@NotEmpty(message="Este campo es requerido")
	private String hEntrada;
	
	@NotEmpty(message="Este campo es requerido")
	private String hSalida;
	
	@NotEmpty(message="Este campo es requerido")
	private String sucUbicacion;
	
	@NotNull(message="Este campo es requerido")
	private Integer nMesas;
	
	@NotEmpty(message="Este campo es requerido")
	private String sucGerente;

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}
	
	public Time getEntrada() {
		if(this.hEntrada == null) {
			return null;
		}else {
			int hora = Integer.parseInt(hEntrada.substring(0,2));
			int min = Integer.parseInt(hEntrada.substring(3,5));
			Time t = new Time(hora,min,00);
			return t;
		}
	}
	
	public Time getSalida() {
		if(this.hSalida == null) {
			return null;
		}else {
			int hora2 = Integer.parseInt(hSalida.substring(0,2));
			int min2 = Integer.parseInt(hSalida.substring(3,5));
			Time t2 = new Time(hora2,min2,00);
			return t2;
		}
	}

	public String getSucNombre() {
		return sucNombre;
	}

	public void setSucNombre(String sucNombre) {
		this.sucNombre = sucNombre;
	}

	public String gethEntrada() {
		
			return hEntrada;
		
	}

	public void sethEntrada(String hEntrada) {
		this.hEntrada = hEntrada;
	}

	public String gethSalida() {
		return hSalida;
	}

	public void sethSalida(String hSalida) {
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
}
