import java.util.Arrays;

/**
 * <li>
 * Proyecto: Programación
 * </li>
 * <li>
 * Paquete: PACKAGE_NAME; *</li>
 * <p>
 * <li>
 * Autor: José
 * </li>
 * <li>
 * Día: 02/04/2022
 * </li>
 * <li>
 * Tiempo: 14
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Sequence {

    /**
     * Recibe un numero y devuelve un array con ese numero decrementado
     * @param n = 5
     * @return 5-4-3-2-1
     */
    public static int[] reverse(int n){
        //your code
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = n-i;
        }

        return resultado;
    }

    /*
    Mejores practica = la que hice
    Otras practica
       int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = n-i;
        }

        return resultado;
     */

}