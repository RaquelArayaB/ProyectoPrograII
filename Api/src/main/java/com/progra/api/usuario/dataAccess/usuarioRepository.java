package com.progra.api.usuario.dataAccess;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progra.api.usuario.dataTransferObject.usuarioDto;

public interface usuarioRepository extends JpaRepository<usuarioDto, Long> {

Optional<usuarioDto> findByEmail(String email);
Optional<usuarioDto> findByEmailAndContraseña(String email, String contraseña);
}
