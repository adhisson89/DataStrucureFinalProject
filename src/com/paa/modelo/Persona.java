package com.paa.modelo;

import java.util.ArrayList;


public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String correoElectronico;

    public Persona(String nombre, String apellido, String cedula, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
    }
    
    public Persona(){}
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public static Persona buscarPersonaPorCI(ArrayList<Persona> lista, String cedulaBuscar){
        Persona personaEncontrada = null;
        for(Persona p: lista){
            if(p.getCedula().equals(cedulaBuscar)){
                personaEncontrada = p;
                break;
            }
        }
        return personaEncontrada; 
    }
    
}
