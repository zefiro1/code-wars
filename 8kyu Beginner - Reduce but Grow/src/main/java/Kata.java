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
 * Tiempo: 16
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Kata {

    /**
     *
     * Dada una matriz no vacía de enteros,
     * devuelva el resultado de multiplicar los valores juntos en orden.
     * @param x
     * @return
     */
    public static int grow(int[] x) {
        int resultado = 1;
        for (int j : x) {
            resultado *= j;
        }


        return resultado;

    }

}