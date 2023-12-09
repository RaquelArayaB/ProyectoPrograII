package com.progra.api.pregunta.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pregunta") // El nombre de la tabla exacto
public class preguntaDTO {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int pregunta_id;
    private int temaId;
    private String label;
    private String selection;

    public int getPregunta_id() {
        return pregunta_id;
    }
    public void setPregunta_id(int pregunta_id) {
        this.pregunta_id = pregunta_id;
    }
    public int getTemaId() {
        return temaId;
    }
    public void setTemaId(int curso_id) {
        this.temaId = curso_id;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getSelection() {
        return selection;
    }
    public void setSelection(String selection) {
        this.selection = selection;
    }
}
