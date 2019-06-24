package com.uca.capas.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmpleadoDTO {
	
	private Integer idEmpleado;
	
	
	private Integer idSucursal;
	
	@NotEmpty(message="Este campo es requerido")
	private String eNombre;
	
	@NotNull(message="Este campo es requerido")
	private Integer eEdad;
	
	private String eGenero;
	
	private String eEstado;
	
	public Boolean getState() {
		if(this.eEstado == null) {
			return null;
		}else {
			if(this.eEstado.equals("Activo")) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public Boolean getGender() {
		if(this.eGenero == null) {
			return null;
		}else {
			if(this.eGenero.equals("Masculino")) {
				return true;
			}else {
				return false;
			}
		}
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
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

	public String geteGenero() {
		return eGenero;
	}

	public void seteGenero(String eGenero) {
		this.eGenero = eGenero;
	}

	public String geteEstado() {
		return eEstado;
	}

	public void seteEstado(String eEstado) {
		this.eEstado = eEstado;
	}
	
	
	
}
