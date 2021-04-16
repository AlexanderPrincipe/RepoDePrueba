package com.proyectoperfildeprorgramador.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoperfildeprorgramador.model.dao.Proyectos;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer>{

}
