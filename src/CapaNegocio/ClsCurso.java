package CapaNegocio;

public class ClsCurso {
    private String nombre;
    private String descripcion;
    private int duracion;
    private String requisitosEspecificos;
    
    private ClsNivel nivel; // por la relacion de agregacion

    public ClsCurso(String nombre, String descripcion, int duracion, String requisitosEspecificos, ClsNivel nivel) {
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

    public ClsNivel getNivel() {
        return nivel;
    }

    public void setNivel(ClsNivel nivel) {
        this.nivel = nivel;
    }
    
    
    
}
