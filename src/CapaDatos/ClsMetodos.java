/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import CapaNegocio.ClsDocente;
import java.util.ArrayList;

/**
 *
 * @author Adhisson Cedeño adhisson.cedeno@epn.edu.ec
 */
public class ClsMetodos {
    
    public static ClsDocente buscarPersonaPorCI(ArrayList<ClsDocente> lista, String cedulaBuscar) {
        ClsDocente docenteEncontrado = null;
        for (ClsDocente p : lista) {
            if (p.getCedula().equals(cedulaBuscar)) {
                docenteEncontrado = p;
                break;
            }
        }
        return docenteEncontrado;
    }
    
}
