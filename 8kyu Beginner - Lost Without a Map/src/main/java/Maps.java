/*--Creado por José el día 24/03/2022 y a la hora 15:45 en el proyecto 8kyu Beginner-Lost Without a Map--*/


import java.util.Arrays;

public class Maps {

    /**
     * Multiplica los elementos de un array por dos
     *
     * @param arr array de la que se quiere doblar sus elementos
     * @return la array multiplicada por dos
     */
    public static int[] map(int[] arr) {
        int aux = arr[0];
        for (int i = 0; i < arr.length; i++) {
            aux = arr[i] * 2;
            arr[i] = aux;
        }
        return arr;

        /*
        * Otras implementaciones
        * Mejor practica
        *---------------------------------------------
        * for (int i = 0; i < arr.length; i++) {
                 arr[i] *= 2;
           }
                return arr;

        *-----------------------------------------
        * return Arrays.stream(arr).map(x -> x*2).toArray();
        * */
    }


}