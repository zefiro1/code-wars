/**
 * <li>
 * Proyecto: Prueba
 * </li>
 * <li>
 * Paquete: package ; *</li>
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
     *
     * Da la vuelta  al número que recibe y lo convierte en un array
     * y devuelve un array
     * @param n numero que quieres convertir en array dado la vuelta
     * @return un array con los numeros dado la vuelta
     */
    public static int[] digitize(long n) {
        // Code here

        int a[] = new int[1];
        if (n == 0)
            return a;

        String probar = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder(probar);
        probar = String.valueOf(stringBuilder.reverse());
        int tamaño = (int) Math.log10(n) + 1;

        int[] array = new int[tamaño];


        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(probar.charAt(i));
        }

        return array;

        //OTRAS IMPLEMENTACIONES
        //MEJORES PRACTICAS
        /*
        * return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
        *---------------------------------------------------------
        *      int length = n == 0 ? 1 : (int) Math.log10(n) + 1;
        *      int[] digits = new int[length];
        *      for (int i = 0; i < length; i++, n /= 10) {
        *            digits[i] = (int) (n % 10);
        *       }
        *       return digits;
        * -------------------------------------------------------
        * */


    }

}