
package CapaDatos;

public class ClsRecursividad {

    public static String Ej01_numero1aN(int indice, int num, String acumulador) {
        if (indice == num) {
            return acumulador + " " + indice;
        }
        acumulador+= " " + indice;
        return Ej01_numero1aN(indice + 1, num, acumulador);
    }

    public static String Ej02_tablaMultiplicar(int iTabla, int iNumero, String acumulador) {

        if (iNumero > 1) {
            acumulador += Ej02_tablaMultiplicar(iTabla, iNumero - 1, acumulador);
        }
        return acumulador + "\n"+ (iTabla + "x" + iNumero + "=" + iTabla * iNumero);
    }

    public static int Ej03_sumaDivisores(int indice, int numero) {
        int suma = 0;
        if (numero <= 1) {
            return numero;
        }
        if ((indice % numero) == 0) {
            suma += numero;
        }
        return suma + Ej03_sumaDivisores(indice, numero - 1);
    }

    public static int Ej04_numPerfecto(int divisor, int numero) {//el divisor tiene que ser la mitad del numero
        if (divisor == 1) {
            return 1;
        }
        if (numero % divisor == 0) {
            return (divisor + Ej04_numPerfecto(divisor - 1, numero));
        } else {
            return (Ej04_numPerfecto(divisor - 1, numero));
        }
    }

    public static String Ej05_multiplicar(int iTabla, int iNumero) {
        if (iNumero > 1) {
            Ej05_multiplicar(iTabla, iNumero - 1);
        }
        return iTabla + "x" + iNumero + "=" + iTabla * iNumero;
    }

    public static int Ej06_MinimoComunMultiplo(int n1, int n2) {
        return (n1 / maximoComunDivisor(n1, n2)) * n2;
    }

    public static int maximoComunDivisor(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        return maximoComunDivisor(n2 % n1, n1);
    }

    public static int Ej07_decimalBinario(int decimal) {
        if (decimal == 0) {
            return 0;
        } else {
            return (decimal % 2 + 10 * Ej07_decimalBinario(decimal / 2));
        }
    }

    public static int Ej08_binarioDecimal(String binario, int indice) {
        int aux = binario.length();
        if (indice == aux - 1) {
            return binario.charAt(indice) - '0';
        }
        return ((binario.charAt(indice) - '0') << (aux - indice - 1)) + Ej08_binarioDecimal(binario, indice + 1);
    }

    public static boolean Ej09_palindromo(String palabra, int inicio, int fin) {
        //le paso la palabra, 0 y longitud de la palabra - 1
        if (palabra.length() == 0) {
            return true;
        } else {
            if (inicio == fin) {
                return true;
            }
            if ((palabra.charAt(inicio)) != (palabra.charAt(fin))) {
                return false;
            }
            if (inicio < fin + 1) {
                return Ej09_palindromo(palabra, inicio + 1, fin - 1);
            }
            return true;
        }
    }

    public static int Ej10_fibonacci(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        return Ej10_fibonacci(num - 1) + Ej10_fibonacci(num - 2);
    }

    public static String Ej11_invertirOrden(String acumulador, int num) {
        if (num < 10) {
            acumulador += num;
            return acumulador;
        } else {
            acumulador += (num % 10);
            return Ej11_invertirOrden(acumulador, num/10);
        }
    }

    public static boolean Ej12_esPrimo(int numero, int indice) {// tengo que pasarle mi numero y el indice 2
        if (numero <= 2) {
            //return (numero == 2) ? true : false;
            return (numero == 2);
        }
        if (numero % indice == 0) {
            return false;
        }
        if (indice * indice > numero) {
            return true;
        }
        return Ej12_esPrimo(numero, indice + 1);
    }
}
