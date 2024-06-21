package com.example.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova.entities.Prova;

public interface ProvaRepository extends JpaRepository<Prova,Integer> {
    
}
