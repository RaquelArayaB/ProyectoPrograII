package com.progra.api.curso.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class cursoDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int curso_id;
    private String nombre;
    private double puntos;
    private String descripcion;

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double points) {
        this.puntos = points;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
