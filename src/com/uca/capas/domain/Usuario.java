package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(generator="usuario_id_usuario_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "usuario_id_usuario_seq", sequenceName = "public.usuario_id_usuario_seq")
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "ucorreo")
	private String uCorreo;
	
	@Column(name = "unombre")
	private String uNombre;
	
	@Column(name = "upassword")
	private String uPassword;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getuCorreo() {
		return uCorreo;
	}

	public void setuCorreo(String uCorreo) {
		this.uCorreo = uCorreo;
	}

	public String getuNombre() {
		return uNombre;
	}

	public void setuNombre(String uNombre) {
		this.uNombre = uNombre;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	
	

}
