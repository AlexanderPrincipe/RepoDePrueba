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

import com.example.demo.DTO.PaisDTO;
import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.models.Pais;
import com.example.demo.models.Usuario;
import com.example.demo.services.PaisService;
import com.example.demo.services.UsuarioServicee;

@RestController
@RequestMapping("/api/v1")
public class PaisController {
	
	@Autowired
	PaisService paisService;
	
	@GetMapping("/listarPais/{id}")
	public Optional<Pais> listarPorId(@PathVariable Integer id){ 
		return paisService.listarPorId(id);
	}
	
	@GetMapping("/listarPais")
	public List<Pais> listar() {
	    return paisService.listar();
	}
	
	@PostMapping("/registrarPais")
	public Pais registrar(@RequestBody PaisDTO paisDTO) {
		return paisService.registrar(paisDTO);
	}
	
	@PutMapping("/modificarPais")
	public Pais modificar(@RequestBody PaisDTO paisDTO) {
		return paisService.modificar(paisDTO);
	}
	
	@DeleteMapping("/eliminarPais/{id}")
	public void eliminar(@PathVariable Integer id) {
		paisService.eliminar(id);
	}

}
