/*--Creado por José el día 22/03/2022 y a la hora 18:01 en el proyecto 8kyu Opposite number--*/


public class Kata {

    /**
     * El numero opuesto al que recibe
     * @param number del que quieres el opuesto
     * @return el numero opuesto al que recibe
     */
    public static int opposite(int number)
    {
        return (number > 0)?-number:number*-1;

        //Otras implementaciones
        //return -number;
        //return Math.negateExact(number);
    }
}