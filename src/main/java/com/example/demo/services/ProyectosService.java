package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.DTO.ProyectosDTO;
import com.example.demo.models.Proyectos;

public interface ProyectosService {
	
	List<Proyectos> listar();
	Optional<Proyectos> listarPorId(Integer id);
	Proyectos registrar(ProyectosDTO proyectosDTO);
	Proyectos modificar(ProyectosDTO proyectosDTO);
	void eliminar(Integer id);


}
