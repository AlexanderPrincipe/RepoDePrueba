package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Proyectos;

@Repository
public interface IProyectosRepository extends JpaRepository<Proyectos, Integer>{

}
