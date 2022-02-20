package com.paa.modelo;

import java.util.ArrayList;

public class Categoria {

    private String nombre;
    private String descripcion;
    
    // referencia a un array list de tipo curso
    private ArrayList <Curso> cursos;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        //se crea una lista de tamaño 0 y le pertenece a esa categoria
        cursos = new ArrayList<>();
    }
    // recibe como argumento un obj de tipo curso y lo agrega al final de la lista de cursos
    public void agregarCurso (Curso c){
        this.cursos.add(c);
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

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    
    
}
