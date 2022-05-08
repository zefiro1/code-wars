/*--Creado por José el día 22/03/2022 y a la hora 19:22 en el proyecto 8kyu Grasshopper - Summation--*/


public class GrassHopper {

    /**
     *
     * Sumatorio de cualquier numero positivo
     * @param n numero del que se quiere saber el sumatorio
     * @return el sumatorio del numero
     */
    public static int summation(int n) {
        int aux=0;

        for (int i = 0; i <= n ; i++) {
            aux +=i;
        }

        return (n == 1)?1:aux;

        //---Otras implementaciones
        //return  n*(n+1)/2;
    }
}