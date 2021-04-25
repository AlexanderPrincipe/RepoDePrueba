package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer>{

}
