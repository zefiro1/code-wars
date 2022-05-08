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
 * Tiempo: 19
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Kata {

    public static int sum(int[] numbers) {
        if(numbers != null) {
            int resultado = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length - 1; j++) {
                    int elementactual = numbers[j];
                    int elementosiguiente = numbers[j + 1];
                    if (elementactual > elementosiguiente) {
                        numbers[j] = elementosiguiente;
                        numbers[j + 1] = elementactual;
                    }
                }
            }
            for (int i = 1; i < numbers.length - 1; i++) {
                resultado += numbers[i];
            }
            return resultado;
        }
        return 0;
    }


}