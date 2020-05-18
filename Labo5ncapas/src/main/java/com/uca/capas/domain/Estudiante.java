package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cUsuario;
	
	@Column(name="nombre")
	@Size(max=50, message="El nombre debe tener 50 digitos como maximo")
	@NotEmpty(message="*Campo obligatorio")
	private String nameUsuario;
	
	@Column(name="apellido")
	@Size(max=50, message="El nombre debe tener 50 digitos como maximo")
	@NotEmpty(message="*Campo obligatorio")
	private String lastnameUsuario;
	

	@Column(name="carne")
	@Size(min=10,max=10, message="El carne debe tener 10 digitos como maximo")
	@NotEmpty(message="*Campo obligatorio")
	private String carneUsuario;
	
	
	@Column(name="carrera")
	@Size(min=10,max=10, message="La carrera debe tener 10 digitos como maximo")
	@NotEmpty(message="*Campo obligatorio")
	private String carreraUsuario;

	

	public Estudiante(Integer cUsuario, String nameUsuario, String lastnameUsuario, String carneUsuario,
			String carreraUsuario) {
		super();
		this.cUsuario = cUsuario;
		this.nameUsuario = nameUsuario;
		this.lastnameUsuario = lastnameUsuario;
		this.carneUsuario = carneUsuario;
		this.carreraUsuario = carreraUsuario;
	}


	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getcUsuario() {
		return cUsuario;
	}


	public void setcUsuario(Integer cUsuario) {
		this.cUsuario = cUsuario;
	}


	public String getNameUsuario() {
		return nameUsuario;
	}


	public void setNameUsuario(String nameUsuario) {
		this.nameUsuario = nameUsuario;
	}


	public String getCarneUsuario() {
		return carneUsuario;
	}


	public void setCarneUsuario(String carneUsuario) {
		this.carneUsuario = carneUsuario;
	}


	public String getCarreraUsuario() {
		return carreraUsuario;
	}


	public void setCarreraUsuario(String carreraUsuario) {
		this.carreraUsuario = carreraUsuario;
	}
	
	
	public String getLastnameUsuario() {
		return lastnameUsuario;
	}

	public void setLastnameUsuario(String lastnameUsuario) {
		this.lastnameUsuario = lastnameUsuario;
	}
	
}
