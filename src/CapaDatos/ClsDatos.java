/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import CapaNegocio.*;
import java.util.ArrayList;
import java.util.Vector;

public class ClsDatos {
    
    public static ArrayList <ClsNivel> niveles;
    public static ArrayList <ClsCategoria> categorias;
    public static ArrayList <ClsCurso> cursos;
    public static ArrayList <ClsDocente> docentes;
    public static Vector <ClsEstudiante> estudiantes;
    
    public static void inicializarListas(){
        niveles = new ArrayList<>();
        categorias = new ArrayList<>();
        cursos = new ArrayList<>();
        docentes = new ArrayList<>();
        estudiantes = new Vector<>();
    }
}
