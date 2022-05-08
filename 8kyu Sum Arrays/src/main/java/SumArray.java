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

public class SumArray {

    /**
     * Función que toma una matriz de números y devuelve la suma de los números. Los números pueden ser negativos
     * o no enteros. Si la matriz no contiene ningún número, debe devolver 0.
     * @param numbers
     * @return
     */
    public static double sum(double[] numbers) {
        double aux=0;
        for (double a: numbers) {
            if(a!=0)
                aux += a;
        }
        return aux;
    }

    /**
     * Otras implementaciones
     *  return Arrays.stream(numbers).sum();
     */

}