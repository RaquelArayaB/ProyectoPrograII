package com.progra.api.pregunta.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabla_pregunta") // El nombre de la tabla exacto
public class preguntaDTO {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int pregunta_id;
    private int tema_id;
    private String label;
    private String option;

    public int getPregunta_id() {
        return pregunta_id;
    }
    public void setPregunta_id(int pregunta_id) {
        this.pregunta_id = pregunta_id;
    }
    public int getTema_id() {
        return tema_id;
    }
    public void setTema_id(int curso_id) {
        this.tema_id = curso_id;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getOption() {
        return option;
    }
    public void setOption(String option) {
        this.option = option;
    }

    
}
