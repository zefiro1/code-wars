/*--Creado por José el día 22/03/2022 y a la hora 18:56 en el proyecto 8kyu Reversed Strings--*/


public class Kata {
    /**
     * Convierte un String
     * <li>Por ejemplo WORLD => DLROW</li>
     * @param str al que se le quiere poner de reversa
     * @return el string reverso
     */
    public static String solution(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();

        //---Otras implementaciones

        // return StringBuilder(str).reverse().toString;

        //return StringUtils.reverse(str);

    /*    String newcad ="";
        for (int i = 0; i <= str.length()-1; i++) {
            newcad+= str.charAt(i);
        }
        return  newcad;*/

    }




}