package com.proyectoperfildeprorgramador.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoperfildeprorgramador.model.Repository.PaisRepository;
import com.proyectoperfildeprorgramador.model.dao.Pais;
import com.proyectoperfildeprorgramador.model.service.PaisService;

@Service
public class PaisServiceImpl implements PaisService{
	
	@Autowired
	PaisRepository paisRepository;

	@Override
	public List<Pais> listar() {
		return paisRepository.findAll();
	}

}
