package com.progra.api.tema.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tema")
public class temaDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int tema_id;
    private String nombre;
    private String descripcion;
    private int curso_id;

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public int getTema_id() {
        return tema_id;
    }

    public void setTema_id(int tema_id) {
        this.tema_id = tema_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
