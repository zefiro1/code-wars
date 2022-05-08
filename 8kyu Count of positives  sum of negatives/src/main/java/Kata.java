import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <li>
 * Proyecto: Prueba
 * </li>
 * <li>
 * Paquete: package Ejemplo2; *</li>
 * <p>
 * <li>
 * Autor: José
 * </li>
 * <li>
 * Día: 24/03/2022
 * </li>
 * <li>
 * Tiempo: 9:39
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Kata {

    /**
     * Cuanta los numeros positivos y suma los numeros negativos de un array de numeros
     *
     * @param input array del que se quiere saber la suma de los numeros negativos y contar los
     *              numeros positivos que hay en la array
     * @return array de numero con la dos espacio uno para la cuenta de positivo y otro para la
     * suma de negativos
     */
    public static int[] countPositivesSumNegatives(@NotNull int[] input) {
        int aux = 0;
        int contador = 0;
        int[] ouput = new int[2];

        //return an array with count of positives and sum of negatives
        if (Arrays.equals(input, new int[0])) {
            ouput = new int[0];
            return ouput;
        }
        if (Arrays.equals(input, null)) {
            ouput = new int[0];
            return ouput;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                ouput[0] = ++contador;
            } else if (input[i] < 0) {
                aux += input[i];
                ouput[1] = aux;
            }
        }

        return ouput;

            /*----OTRAS IMPLEMENTACIONES----*\
            MEJORES PRACTICAS
              if (input == null || input.length == 0) return new int[] {};
              int count = 0,sum = 0;
              for (int i : input) {
              if (i > 0) count ++;
              if (i < 0) sum += i;
       }
       return new int[] {count,sum};

       FUNCIONAL

       return input == null || input.length == 0 ?
      new int[0] :
      new int[] { (int)IntStream.of(input).filter(i->i>0).count(), IntStream.of(input).filter(i->i<0).sum() };
             */
    }

}