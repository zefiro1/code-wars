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
 * Tiempo: 20
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class MonkeyCounter {

    public static int[] monkeyCount(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 1; j <n; j++) {
                result[i] = j;
            }

        }
        System.out.println(Arrays.toString(result));
        return result;

    }

}