package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.DTO.PaisDTO;
import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.models.Pais;
import com.example.demo.models.Usuario;

public interface PaisService {
	
	List<Pais> listar();
	Optional<Pais> listarPorId(Integer id);
	Pais registrar(PaisDTO paisDTO);
	Pais modificar(PaisDTO paisDTO);
	void eliminar(Integer id);

}
