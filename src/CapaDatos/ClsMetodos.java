/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import CapaNegocio.ClsDocente;
import CapaNegocio.ClsEstudiante;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Adhisson Cedeño adhisson.cedeno@epn.edu.ec
 */
public class ClsMetodos {
    
    public static ClsDocente buscarPersonaPorCIDocente(ArrayList<ClsDocente> lista, String cedulaBuscar) {
        ClsDocente docenteEncontrado = null;
        for (ClsDocente p : lista) {
            if (p.getCedula().equals(cedulaBuscar)) {
                docenteEncontrado = p;
                break;
            }
        }
        return docenteEncontrado;
    }
    
    public static ClsEstudiante buscarPersonaPorCIEstudiante(Vector<ClsEstudiante> lista, String cedulaBuscar) {
        ClsEstudiante estudianteEncontrado = null;
        for (ClsEstudiante e : lista) {
            if (e.getCedula().equals(cedulaBuscar)) {
                estudianteEncontrado = e;
                break;
            }
        }
        return estudianteEncontrado;
    }
    
}
