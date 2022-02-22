package CapaNegocio;

import java.util.ArrayList;
import java.util.List;


public class ClsEstudiante extends ClsPersona {
    private ArrayList <ClsCurso> cursos;
    
    private double calificaciones[];
    
    public ClsEstudiante(String nombre, String apellido, String cedula, String correoElectronico) {
        super(nombre, apellido, cedula, correoElectronico);
        this.calificaciones = new double[10];
        for(int i=0; i< calificaciones.length; i++){
            calificaciones[i]=0;
        }
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    
    public void agregarCurso(ClsCurso c){
        this.cursos.add(c);
    }
    
    public static ClsEstudiante buscarEstudiantePorCI(List<ClsEstudiante> lista, String cedulaBuscar) {
        // recorrer la lista y comparar la cédula de cada estudiante en la lista con la clave
        // a la primera ocurrencia se retorna el estudiante
        // null si no encuentra al estudiante en la lista
        ClsEstudiante estudianteEncontrado = null;
        for(ClsEstudiante e: lista){
            if(e.getCedula().equals(cedulaBuscar)){
                estudianteEncontrado = e;
                break; // return estudianteEncontrado
            }
        }
        
        return estudianteEncontrado;
    }

    public ArrayList<ClsCurso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<ClsCurso> cursos) {
        this.cursos = cursos;
    }
    
    
}
