package com.proyectoperfildeprorgramador.model.service;

import java.util.List;

import com.proyectoperfildeprorgramador.model.dao.Pais;
import reactor.core.publisher.Mono;

public interface PaisService {
	
//	Mono<List<>> listar();
//	Mono<> modificar();
//	Mono<> listarPorId(Integer id);
//	void eliminar(Integer id);
	
	
	List<Pais> listar();

}
