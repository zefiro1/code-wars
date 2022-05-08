/*--Creado por José el día 23/03/2022 y a la hora 9:14 en el proyecto 8kyu Century From Year--*/


public class Solution {

    /**
     * Calcula los siglos si en función del año si el siglo es menor a 100 por defecto es el Siglo I
     * @param number  años del cual se quiere calcular el siglo
     * @return el siglo
     */
    public static int century(int number) {
        // your code goes here
        if(number <= 100)
            return 1;
        return (number%3==0&&number%100!=0||number%2==0&&number%100!=0 ||number%5==0&&number%100!=0|| number%2!=0)?number/100+1:number/100;
        // Otras implementaciones
        //return (number + 99) / 100;
        //return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);
        //return (int)Math.ceil((double)number/100);
        //return (number - 1) / 100 + 1;

    }
}