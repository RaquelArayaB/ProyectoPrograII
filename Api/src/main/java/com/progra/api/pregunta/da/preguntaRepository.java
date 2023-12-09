package com.progra.api.pregunta.da;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progra.api.pregunta.dto.preguntaDTO;

public interface preguntaRepository extends JpaRepository<preguntaDTO, Long> {
    /**
     * @return
     */
    Optional<preguntaDTO> findBytemaId(int temaId);
}