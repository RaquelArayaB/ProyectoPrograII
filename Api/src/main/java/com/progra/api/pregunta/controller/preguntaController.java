package com.progra.api.pregunta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra.api.usuario.businesslogic.usuarioBL;
import com.progra.api.usuario.dataAccess.usuarioRepository;
import com.progra.api.usuario.dataTransferObject.usuarioDto;

@RestController
@CrossOrigin
@RequestMapping("api/pregunta")
public class preguntaController {

    @Autowired
    private usuarioRepository userRep;

    /**
     * metodo que se encarga de retornar la lista de todos los usuarios
     * 
     * @return
     */
    @GetMapping
    public List<usuarioDto> userList() {
        usuarioBL _usuarioBl = new usuarioBL(userRep);
        return _usuarioBl.list();
    }
    
}
