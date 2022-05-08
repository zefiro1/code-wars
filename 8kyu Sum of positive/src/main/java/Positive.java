/*--Creado por José el día 22/03/2022 y a la hora 17:21 en el proyecto 8kyu Sum of positive--*/


public class Positive {

    /**
     * Suma solo los numeros positivos de un array
     * @param arr Array
     * @return suma de los numeros positivos en un array
     */
    public static int sum(int[] arr){
        int aux=0;
        for (int a: arr) {
            if(a>0)
                aux += a;
        }
        return aux;

        /* Otra forma de implementarlo*/

        // Comprueba si el array esta vacio
      /*  if(arr.length == 0) return 0;

        // Asinga  todos los numeros positivos  del array a la variable sum y devuelve el resutlado

        else {
            int sum = 0;
            for(int num : arr){
                sum = (num > 0 ? sum + num : sum);
            }
            return sum;
        }*/

    }
}