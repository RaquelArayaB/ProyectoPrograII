package com.progra.api.pregunta.da;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progra.api.pregunta.dto.preguntaDTO;
import com.progra.api.usuario.dataTransferObject.usuarioDto;

public interface preguntaRepository extends JpaRepository<preguntaDTO, Long> {
    /**
     * @return
     */
    Optional<usuarioDto> findByTema(int tema_id);
}