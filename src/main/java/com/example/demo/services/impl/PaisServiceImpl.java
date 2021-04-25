package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.PaisDTO;
import com.example.demo.models.Pais;
import com.example.demo.repositories.IPaisRepository;
import com.example.demo.services.PaisService;

@Service
public class PaisServiceImpl implements PaisService{
	
	@Autowired
	IPaisRepository paisRepository;

	@Override
	public List<Pais> listar() {
		return paisRepository.findAll();
	}

	@Override
	public Optional<Pais> listarPorId(Integer id) {
		return paisRepository.findById(id);
	}

	@Override
	public Pais registrar(PaisDTO paisDTO) {
		return null;
	}

	@Override
	public Pais modificar(PaisDTO paisDTO) {
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		paisRepository.deleteById(id);
		
	}
	
	

}
