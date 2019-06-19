package com.uca.capas.dto;

import java.sql.Time;
import java.util.List;

import com.uca.capas.domain.Empleado;

public class SucursalDTO {
	
	private Integer idSucursal;
	
	private String sucNombre;
	
	private Time hEntrada;
	
	private Time hSalida;
	
	private String sucUbicacion;
	
	private Integer nMesas;
	
	private String sucGerente;

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


}
