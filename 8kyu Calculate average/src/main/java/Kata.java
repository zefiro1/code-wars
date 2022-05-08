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
 * Tiempo: 13
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Kata {

    /**
     * Calcula el promedio de los numeros de una array
     * @param array
     * @return
     */
    public static double find_average(int[] array){
        double resultado = 0;
        for (int a:array) {
            resultado+=a;
        }

        return resultado/array.length;
    }
    /*
    Mejores practicas
     return Arrays.stream(array).average().orElse(0);
     */

}