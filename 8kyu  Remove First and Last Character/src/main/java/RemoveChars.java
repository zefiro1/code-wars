/*--Creado por José el día 22/03/2022 y a la hora 18:11 en el proyecto 8kyu Remove First and Last Character--*/


import org.jetbrains.annotations.NotNull;

public class RemoveChars {


    /**
     *
     * Borra el primero y el último character del String que le pasas
     * @param str al que quieres borrar el primer y el último character
     * @return la cadena con la letra principal y final borrada
     */
    public static String remove(@NotNull String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.deleteCharAt(str.length()-1);
        stringBuilder.deleteCharAt(0);

         return stringBuilder.toString() ;

       //---Otras implementaciones
        //return str.substring(1, str.length() - 1);
        //return str.replaceAll("^.|.$", "");


    }

}