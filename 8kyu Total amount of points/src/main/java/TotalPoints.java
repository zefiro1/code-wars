/**
 * <li>
 * Proyecto: Programación
 * </li>
 * <li>
 * Paquete: PACKAGE_NAME; *</li>
 * <p>
 * <li>
 * Autor: José
 * </li>
 * <li>
 * Día: 05/04/2022
 * </li>
 * <li>
 * Tiempo: 11
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class TotalPoints {

    /**
     * Funcion que tome dicha colección y cuente los puntos de
     * nuestro equipo en el campeonato.
     * Reglas para contar puntos para cada partido:
     * @param games
     * @return
     */
    public static int points(String[] games) {
        //implement me
        int result = 0;
        for (String s : games){
            int a = Integer.parseInt(String.valueOf(s.charAt(0)));
            int b = Integer.parseInt(String.valueOf(s.charAt(2)));
            if(a==b){
                result +=1;
            }else if (a<b){
                result +=0;
            }else {
                result +=3;
            }

        }
        return result;
    }
    /**
     * int sum = 0;
     *
     *         for (String s : games) {
     *           char x = s.charAt(0),
     *                y = s.charAt(2);
     *
     *           sum += x > y ? 3 : x == y ? 1 : 0;
     *         }
     *
     *         return sum;
     */

}