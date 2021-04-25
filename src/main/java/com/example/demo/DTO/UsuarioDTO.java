package com.example.demo.DTO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.models.Pais;
import com.example.demo.models.Proyectos;
import com.example.demo.models.RedesSociales;

public class UsuarioDTO {
	
	private Integer id;
	
	private String nombre;
	
	private String apellido_paterno;
	
	private String apellido_materno;
	
	private String fecha_nacimiento;
	
	private String foto;
	
	private String bio;
	
	private Integer id_pais;
	
	private Integer listProyectos;
	
	private Integer listRedesSociales;
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido_paterno() {
		return apellido_paterno;
	}



	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}



	public String getApellido_materno() {
		return apellido_materno;
	}



	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}



	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}



	public String getBio() {
		return bio;
	}



	public void setBio(String bio) {
		this.bio = bio;
	}



	public Integer getId_pais() {
		return id_pais;
	}



	public void setId_pais(Integer id_pais) {
		this.id_pais = id_pais;
	}



	public Integer getListProyectos() {
		return listProyectos;
	}



	public void setListProyectos(Integer listProyectos) {
		this.listProyectos = listProyectos;
	}



	public Integer getListRedesSociales() {
		return listRedesSociales;
	}



	public void setListRedesSociales(Integer listRedesSociales) {
		this.listRedesSociales = listRedesSociales;
	}



	public UsuarioDTO(Integer id, String nombre, String apellido_paterno, String apellido_materno,
			String fecha_nacimiento, String foto, String bio, Integer id_pais, Integer listProyectos,
			Integer listRedesSociales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.foto = foto;
		this.bio = bio;
		this.id_pais = id_pais;
		this.listProyectos = listProyectos;
		this.listRedesSociales = listRedesSociales;
	}
	
	

}
