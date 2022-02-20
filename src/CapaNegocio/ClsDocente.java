package CapaNegocio;

import java.util.ArrayList;


public class ClsDocente extends ClsPersona {
    private String presentacion;
    private String celular;
    
    private ArrayList<ClsCurso> cursos;

    public ClsDocente(String presentacion, String celular, String nombre, String apellido, String cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
        this.presentacion = presentacion;
        this.celular = celular;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(ClsCurso c){
        this.cursos.add(c);
    }
    
    
    
}
