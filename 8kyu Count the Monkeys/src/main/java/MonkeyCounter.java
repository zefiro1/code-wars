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
 * Día: 05/04/2022
 * </li>
 * <li>
 * Tiempo: 11
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class MonkeyCounter {

    /**
     *  Dado el número (n), rellene una matriz
     * con todos los números incluyendo ese número, pero excluyendo cero.
     * @param n
     * @return
     */
    public static int[] monkeyCount(final int n){
        int[] reslut = new int[n];
        for (int i = 0 , j=1; i < reslut.length; i++,j++) {
            reslut[i] = j;
        }
        System.out.println(Arrays.toString(reslut));
        return reslut;
    }
    /**
     * Otras implementaciones
     * return IntStream.rangeClosed(1, n).toArray();
     *
     * int[] num = new int [n];
     *     for (int i = 0; i < n; i++) {
     *       num[i] = i+1;
     *     }
     *     return num;
     */
}