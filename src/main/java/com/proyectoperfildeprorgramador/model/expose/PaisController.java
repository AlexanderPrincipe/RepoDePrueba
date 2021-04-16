package com.proyectoperfildeprorgramador.model.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoperfildeprorgramador.model.dao.Pais;
import com.proyectoperfildeprorgramador.model.service.PaisService;



@RestController
@RequestMapping("/api/v1")
public class PaisController {
	
	@Autowired
	PaisService paisService;
	
	
	@GetMapping("/listarPais")
	public List<Pais> listar() {
		return paisService.listar();
	}

}
