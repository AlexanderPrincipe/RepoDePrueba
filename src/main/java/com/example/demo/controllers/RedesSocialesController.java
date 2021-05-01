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

import com.example.demo.DTO.RedesSocialesDTO;
import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.models.RedesSociales;
import com.example.demo.models.Usuario;
import com.example.demo.services.RedesSocialesService;
import com.example.demo.services.UsuarioServicee;

@RestController
@RequestMapping("/api/v1")
public class RedesSocialesController {
	
	@Autowired
	RedesSocialesService redesSocialesService;
	
	@GetMapping("/listarRedesSociales/{id}")
	public Optional<RedesSociales> listarPorId(@PathVariable Integer id){ 
		return redesSocialesService.listarPorId(id);
	}
	
	@GetMapping("/listarRedesSociales")
	public List<RedesSociales> listar() {
	    return redesSocialesService.listar();
	}
	
	@PostMapping("/registrarRedesSociales")
	public RedesSociales registrar(@RequestBody RedesSocialesDTO redesSocialesDTO) {
		return redesSocialesService.registrar(redesSocialesDTO);
	}
	
	@PutMapping("/modificarRedesSociales")
	public RedesSociales modificar(@RequestBody RedesSocialesDTO redesSocialesDTO) {
		return redesSocialesService.modificar(redesSocialesDTO);
	}
	
	@DeleteMapping("/eliminarRedesSociales/{id}")
	public void eliminar(@PathVariable Integer id) {
		redesSocialesService.eliminar(id);
	}


}
