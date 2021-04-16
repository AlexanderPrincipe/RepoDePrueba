package com.proyectoperfildeprorgramador.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoperfildeprorgramador.model.dao.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer>{
	
	

}
