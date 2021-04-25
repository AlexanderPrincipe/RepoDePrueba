package com.example.demo.controllers;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.models.Usuario;
import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioServicee;


import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class UsuariooController {
	
	@Autowired
	UsuarioServicee usuarioService;
	
	@GetMapping("/listarUsuarios/{id}")
	public Optional<Usuario> listarPorId(@PathVariable Integer id){ 
		return usuarioService.listarPorId(id);
	}
	
	@GetMapping("/listarUsuarios")
	public List<Usuario> listar() {
	    return usuarioService.listar();
	}
	
	@PostMapping("/registrarUsuario")
	public Usuario registrar(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.registrar(usuarioDTO);
	}
	
	@PutMapping("/modificarUsuario")
	public Usuario modificar(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.modificar(usuarioDTO);
	}
	
	@DeleteMapping("/eliminarUsuario/{id}")
	public void eliminar(@PathVariable Integer id) {
		usuarioService.eliminar(id);
	}

}
