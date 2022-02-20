package com.paa.modelo;

import java.util.ArrayList;
import java.util.List;


public class Estudiante extends Persona {
    private ArrayList <Curso> cursos;

    
    public Estudiante(String nombre, String apellido, String cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
    }
    
    public void agregarCurso(Curso c){
        this.cursos.add(c);
    }
    
    public static Estudiante buscarEstudiantePorCI(List<Estudiante> lista, String cedulaBuscar) {
        // recorrer la lista y comparar la cédula de cada estudiante en la lista con la clave
        // a la primera ocurrencia se retorna el estudiante
        // null si no encuentra al estudiante en la lista
        Estudiante estudianteEncontrado = null;
        for(Estudiante e: lista){
            if(e.getCedula().equals(cedulaBuscar)){
                estudianteEncontrado = e;
                break; // return estudianteEncontrado
            }
        }
        
        return estudianteEncontrado;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
}
