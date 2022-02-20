/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

public class ClsValidadores {
    
    public static boolean validadorCedulaIdentidad(String cedulaIdentidad) {

        byte suma = 0;

        try {
            if (cedulaIdentidad.length() != 10) {
                //System.out.println("La cédula no es válida");
                return false;
            }
            String[] datos = cedulaIdentidad.split("");
            byte verificador = Byte.parseByte(datos[0] + datos[1]);

            if (verificador < 1 || verificador > 24) {
                //System.out.println("La cédula no es válida");
                return false;
            }
            byte[] digitos = new byte[datos.length];

            for (int i = 0; i < digitos.length; i++) {
                digitos[i] = Byte.parseByte(datos[i]);
            }

            if (digitos[2] > 6) {
                return false;
            }

            for (int i = 0; i < digitos.length - 1; i++) {
                if (i % 2 == 0) {
                    verificador = (byte) (digitos[i] * 2);
                    if (verificador > 9) {
                        verificador = (byte) (verificador - 9);
                    }
                } else {
                    verificador = (byte) (digitos[i] * 1);
                }
                suma = (byte) (suma + verificador);
            }

            if ((suma - (suma % 10) + 10 - suma) == digitos[9]) {
                return true;
            }

        } catch (NumberFormatException e) {
            
        }

        return false;
    }
    
    public static boolean validadorCorreoElectronico(String correo){
        return correo.matches("^[-a-z0-9~!$%^&*_=+}{\\'?]+(\\.[-a-z0-9~!$%^&*_=+}{\\'?]+)*@([a-z0-9_][-a-z0-9_]*(\\.[-a-z0-9_]+)*\\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?$");
    }
    
    public static boolean validadorNombre(String nombre){
        return nombre.matches("^[a-zA-ZñÑ]+$");
    }
    
    public static boolean validadorCelular(String digitos) {
        return digitos.matches("^09+[0-9]{8}$");
    }
    public static boolean validadorDigitos(String digitos) {
        return digitos.matches("^[0-9]*$");
    }
}
