package com.progra.api.curso.bl;

import java.util.List;
import com.progra.api.curso.da.cursoRepository;
import com.progra.api.curso.dto.cursoDto;

public class cursoBL {
    private cursoRepository cursoRep;

    public cursoBL(cursoRepository repo) {
        this.cursoRep = repo;
    }

    /**
     * @return
     */
    public List<cursoDto> list() {
        return cursoRep.findAll();
    }

    // busca el id y lo retorna
    public cursoDto get(Long curso_id) {
        cursoDto tema = cursoRep.findById(curso_id).orElse(null);
        return tema;
    }

    public cursoDto add(cursoDto curso) {

        return cursoRep.save(curso);
    }
}
