package com.progra.api.pregunta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra.api.pregunta.bl.preguntaBL;
import com.progra.api.pregunta.da.preguntaRepository;
import com.progra.api.pregunta.dto.preguntaDTO;

@RestController
@CrossOrigin
@RequestMapping("api/pregunta")
public class preguntaController {

    @Autowired
    private preguntaRepository preguntaRep;

    /**
     * metodo que se encarga de retornar la lista de todas las preguntas
     * 
     * @return
     */
    @GetMapping
    public List<preguntaDTO> preguntaList() {
        preguntaBL _preguntaBl = new preguntaBL(preguntaRep);
        return _preguntaBl.list();
    }
    
}
