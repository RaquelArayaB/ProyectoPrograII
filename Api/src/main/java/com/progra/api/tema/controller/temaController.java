package com.progra.api.tema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.progra.api.tema.bl.temaBL;
import com.progra.api.tema.da.temaRepository;
import com.progra.api.tema.dto.temaDto;

@RestController
@RequestMapping("api/tema")
@CrossOrigin

public class temaController {

    @Autowired
    private temaRepository temaRep;

    /*
     * Metodo que se encarga de retornar la lista de todos los usuarios
     * 
     */
    @GetMapping
    public List<temaDto> temaList() {
        temaBL temaBL = new temaBL(temaRep);
        return temaBL.list();
    }

    /* Metodo que se encarga de retornar un subject en especifico */
    @GetMapping("/{id}")
    public temaDto temaGet(@PathVariable Long id) {
        temaBL temaBL = new temaBL(temaRep);
        return temaBL.get(id);
    }

      /* Metodo que se encarga de retornar los subjects asociados a un curso */
    @GetMapping("/byCourseId")
    public List<temaDto> temasByCourse(@RequestParam Long courseId) {
        temaBL temaBL = new temaBL(temaRep);
        return temaBL.getByCourseId(courseId);
    }

    /* Metodo que se encarga de insertar un subject */
    @PostMapping("/add")
    public temaDto add(@RequestBody temaDto tema) {
        temaBL temaBL = new temaBL(temaRep);
        return temaBL.add(tema);

    }
}
