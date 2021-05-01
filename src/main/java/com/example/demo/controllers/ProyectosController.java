package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.ProyectosDTO;
import com.example.demo.models.Proyectos;
import com.example.demo.services.ProyectosService;

@RestController
@RequestMapping("/api/v1")
public class ProyectosController {
	
	@Autowired
	ProyectosService proyectosService;
	
	@GetMapping("/listarProyectos/{id}")
	public Optional<Proyectos> listarPorId(@PathVariable Integer id){ 
		return proyectosService.listarPorId(id);
	}
	
	@GetMapping("/listarProyectos")
	public List<Proyectos> listar() {
	    return proyectosService.listar();
	}
	
	@PostMapping("/registrarProyectos")
	public Proyectos registrar(@RequestBody ProyectosDTO proyectosDTO) {
		return proyectosService.registrar(proyectosDTO);
	}
	
	@PutMapping("/modificarProyectos")
	public Proyectos modificar(@RequestBody ProyectosDTO proyectosDTO) {
		return proyectosService.modificar(proyectosDTO);
	}
	
	@DeleteMapping("/eliminarProyectos/{id}")
	public void eliminar(@PathVariable Integer id) {
		proyectosService.eliminar(id);
	}


}
