package com.progra.api.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra.api.curso.bl.cursoBL;
import com.progra.api.curso.da.cursoRepository;
import com.progra.api.curso.dto.cursoDto;

@RestController
@RequestMapping("api/curso")
@CrossOrigin

public class cursoController {

    @Autowired
    private cursoRepository cursoRep;

    /*
     * Metodo que se encarga de retornar la lista de todos los cursos
     * 
     */
    @GetMapping
    public List<cursoDto> temaList() {
        cursoBL cursoBl = new cursoBL(cursoRep);
        return cursoBl.list();
    }

    /* Metodo que se encarga de retornar un course en especifico */
    @GetMapping("/{curso_id}")
    public cursoDto cursoGet(@PathVariable Long curso_id) {
        cursoBL cursoBl = new cursoBL(cursoRep);
        return cursoBl.get(curso_id);
    }

    /* Metodo que se encarga de insertar un course */
    @PostMapping("/add")
    public cursoDto add(@RequestBody cursoDto curso) {
        cursoBL cursoBl = new cursoBL(cursoRep);
        return cursoBl.add(curso);

    }
}
