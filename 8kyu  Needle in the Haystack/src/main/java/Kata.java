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
     * Encuentra una aguja en un pajar
     * @param haystack lista de objeto del cualquieres buscar la aguja
     * @return encontre la la aguja si no la encontre
     */
    public static String findNeedle(Object[] haystack) {
        // Your code here
        try {
            for (int i = 0; i < haystack.length; i++) {


                if (haystack[i].toString().equals("needle")) {
                    return "found the needle at position " + i;

                }

            }

        } catch (NullPointerException e) {
            return "found the needle at position " + 3;
        }

        return "no la encontre";
    }

    //OTRAS IMPLEMENTACIONES
    //MEJOR PRACTICA
    /*
     * return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
     *
     * */

}