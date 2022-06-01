package com.felypeganzert.controlelivroapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felypeganzert.controlelivroapi.entidades.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    
}
