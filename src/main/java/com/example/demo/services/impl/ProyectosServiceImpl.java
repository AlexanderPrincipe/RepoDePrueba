package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ProyectosDTO;
import com.example.demo.models.Proyectos;
import com.example.demo.repositories.IProyectosRepository;
import com.example.demo.services.ProyectosService;

@Service
public class ProyectosServiceImpl implements ProyectosService{
	
	@Autowired
	IProyectosRepository proyectosRepository;

	@Override
	public List<Proyectos> listar() {
		return proyectosRepository.findAll();
	}

	@Override
	public Optional<Proyectos> listarPorId(Integer id) {
		return proyectosRepository.findById(id);
	}

	@Override
	public Proyectos registrar(ProyectosDTO proyectosDTO) {
		
		Proyectos proyectos = new Proyectos();
		proyectos.setTitulo(proyectosDTO.getTitulo());
		proyectos.setUrl(proyectosDTO.getUrl());
		
		return proyectosRepository.save(proyectos);
	}

	@Override
	public Proyectos modificar(ProyectosDTO proyectosDTO) {
		Proyectos proyectos = new Proyectos();
		proyectos.setId(proyectosDTO.getId());
		proyectos.setTitulo(proyectosDTO.getTitulo());
		proyectos.setUrl(proyectosDTO.getUrl());
		
		
		return proyectosRepository.save(proyectos);
	}

	@Override
	public void eliminar(Integer id) {
		proyectosRepository.deleteById(id);
	}
	
	

}
