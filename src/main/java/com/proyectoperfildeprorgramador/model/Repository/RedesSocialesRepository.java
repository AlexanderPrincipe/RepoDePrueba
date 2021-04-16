package com.proyectoperfildeprorgramador.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoperfildeprorgramador.model.dao.RedesSociales;

@Repository
public interface RedesSocialesRepository extends JpaRepository<RedesSociales, Integer>{
	
}
