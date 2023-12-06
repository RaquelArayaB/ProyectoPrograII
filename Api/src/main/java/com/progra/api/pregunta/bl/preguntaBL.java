package com.progra.api.pregunta.bl;

import java.util.List;

import com.progra.api.pregunta.da.preguntaRepository;
import com.progra.api.pregunta.dto.preguntaDTO;

public class preguntaBL {
    /** Intancia de la clase repository */
    private preguntaRepository preguntaRep;

    public preguntaBL(preguntaRepository preguntaRep) {
        this.preguntaRep = preguntaRep;
    }

    /**
     * @apiNote Se encarga de obtener todos los registros de la tabla Question.
     * @return
     */
    public List<preguntaDTO> list() {
        return preguntaRep.findAll();
    }
}
