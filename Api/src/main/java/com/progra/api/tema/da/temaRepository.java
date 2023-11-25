package com.progra.api.tema.da;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.progra.api.tema.dto.temaDto;

public interface temaRepository extends JpaRepository<temaDto, Long> {

    @Query("SELECT m FROM temaDto m WHERE m.curso_id = :courseId")
    List<temaDto> findByColumnName(@Param("courseId") long courseId);
}
