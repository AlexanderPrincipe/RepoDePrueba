package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.RedesSocialesDTO;
import com.example.demo.models.RedesSociales;
import com.example.demo.repositories.IRedesSocialesRepository;
import com.example.demo.services.RedesSocialesService;

@Service
public class RedesSocialesSericeImpl implements RedesSocialesService{
	
	@Autowired
	IRedesSocialesRepository redesSocialesRepository;

	@Override
	public List<RedesSociales> listar() {
		return redesSocialesRepository.findAll();
	}

	@Override
	public Optional<RedesSociales> listarPorId(Integer id) {
		return redesSocialesRepository.findById(id);
	}

	@Override
	public RedesSociales registrar(RedesSocialesDTO redesSocialesDTO) {
		
		RedesSociales redesSociales = new RedesSociales();
		redesSociales.setIcono(redesSocialesDTO.getIcono());
		redesSociales.setNombre(redesSocialesDTO.getNombre());
		redesSociales.setUrl(redesSocialesDTO.getUrl());
		
		return redesSocialesRepository.save(redesSociales);
	}

	@Override
	public RedesSociales modificar(RedesSocialesDTO redesSocialesDTO) {
		
		RedesSociales redesSociales = new RedesSociales();
		redesSociales = redesSocialesRepository.findById(redesSocialesDTO.getId()).orElse(null);
		redesSociales.setIcono(redesSocialesDTO.getIcono());
		redesSociales.setNombre(redesSocialesDTO.getNombre());
		redesSociales.setUrl(redesSocialesDTO.getUrl());
		redesSociales.setId(redesSocialesDTO.getId());
		
		return redesSocialesRepository.save(redesSociales);
	}

	@Override
	public void eliminar(Integer id) {
		redesSocialesRepository.deleteById(id);
		
	}

}
