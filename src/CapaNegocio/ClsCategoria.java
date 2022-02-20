package CapaNegocio;

import java.util.ArrayList;

public class ClsCategoria {

    private String nombre;
    private String descripcion;
    
    // referencia a un array list de tipo curso
    private ArrayList <ClsCurso> cursos;

    public ClsCategoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        //se crea una lista de tamaño 0 y le pertenece a esa categoria
        cursos = new ArrayList<>();
    }
    // recibe como argumento un obj de tipo curso y lo agrega al final de la lista de cursos
    public void agregarCurso (ClsCurso c){
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

    public ArrayList<ClsCurso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<ClsCurso> cursos) {
        this.cursos = cursos;
    }
    
    
    
    
}
