/*--Creado por José el día 22/03/2022 y a la hora 8:31 en el proyecto 8kyu Even or Odd--*/


/**
 *
 * Todos los números que terminen 1,3,5,7 y 9 son odd números.
 * Todos los números que terminan con 0,2,4,6 y 8 son even números.
 *
 *
 */
public class EvenOrOdd {
    public static String even_or_odd(int number) {

        return number % 2 == 0 ? "Even" : "Odd";


    }


}