package com.uca.capas.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUsuarioDTO {
	
	@NotEmpty(message="Este campo es requerido")
	@Email
	@Size(message="Limite de 30 de caracteres excedido",max=30)
	private String uCorreo;
	
	@NotEmpty(message="Este campo es requerido")
	@Size(message="Limite de 30 de caracteres excedido",max=30)
	private String uPassword;
	public String getuCorreo() {
		return uCorreo;
	}
	public void setuCorreo(String uCorreo) {
		this.uCorreo = uCorreo;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	
	

}
