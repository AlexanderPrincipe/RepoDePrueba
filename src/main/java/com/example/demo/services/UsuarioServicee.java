package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.models.Usuario;

import reactor.core.publisher.Mono;

public interface UsuarioServicee {
	
	List<Usuario> listar();
	Optional<Usuario> listarPorId(Integer id);
	Usuario registrar(UsuarioDTO usuarioDTO);
	Usuario modificar(UsuarioDTO usuarioDTO);
	void eliminar(Integer id);
	
}
