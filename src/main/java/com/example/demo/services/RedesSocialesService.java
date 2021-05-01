package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.DTO.RedesSocialesDTO;
import com.example.demo.models.RedesSociales;

public interface RedesSocialesService {
	
	List<RedesSociales> listar();
	Optional<RedesSociales> listarPorId(Integer id);
	RedesSociales registrar(RedesSocialesDTO redesSocialesDTO);
	RedesSociales modificar(RedesSocialesDTO redesSocialesDTO);
	void eliminar(Integer id);

}
