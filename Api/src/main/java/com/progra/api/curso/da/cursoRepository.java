package com.progra.api.curso.da;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progra.api.curso.dto.cursoDto;

public interface cursoRepository extends JpaRepository<cursoDto, Long> {
}
