package com.progra.api.tema.bl;

import java.util.List;

import com.progra.api.tema.da.temaRepository;
import com.progra.api.tema.dto.temaDto;



public class temaBL {
private temaRepository temaRep;


public temaBL(temaRepository repo) {
        this.temaRep = repo;
    }

    /**
     * @return
     */
    public List<temaDto> list() {
        return temaRep.findAll();
    }

    // busca el id y lo retorna
    public temaDto get(Long tema_id) {
        temaDto tema = temaRep.findById(tema_id).orElse(null);
        return tema;
    }

       public List<temaDto> getByCourseId(Long course_id) {
        List<temaDto> temas = temaRep.findByColumnName(course_id);
        return temas;
    }

    
    public temaDto add(temaDto tema) {

        return temaRep.save(tema);
    }
}
