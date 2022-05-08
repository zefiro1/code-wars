/*--Creado por José el día 22/03/2022 y a la hora 17:38 en el proyecto 8kyu Return Negative--*/


public class Kata {

    /**
     *
     * Convierte numero positivo en negativo
     * @param x numero positivo a convertir
     * @return un el mismo numero recibido pero en negativo en caso de que sea un numero negativo
     * devuelve el mismo numero
     *
     */
    public static int makeNegative(final int x) {

       return (x>0)?-x:x;
       //---Otras formas de implementarlo con Math abs
       // return -abs(x);

    }

}