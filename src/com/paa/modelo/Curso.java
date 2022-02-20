package com.paa.modelo;

public class Curso {
    private String nombre;
    private String descripcion;
    private int duracion;
    private String requisitosEspecificos;
    
    private Nivel nivel; // por la relacion de agregacion

    public Curso(String nombre, String descripcion, int duracion, String requisitosEspecificos, Nivel nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.requisitosEspecificos = requisitosEspecificos;
        this.nivel = nivel;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRequisitosEspecificos() {
        return requisitosEspecificos;
    }

    public void setRequisitosEspecificos(String requisitosEspecificos) {
        this.requisitosEspecificos = requisitosEspecificos;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    
    
    
}
