import java.util.Arrays;

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
 * Día: 02/04/2022
 * </li>
 * <li>
 * Tiempo: 12
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class ReverseWords {

    /**
     * Da la vuelta a las palabras
     * @param str
     * @return
     */
    public static String reverseWords(String str) {

        String[] strings = str.split(" ");

        String temp;


        temp = strings[0];
        strings[0] = strings[strings.length-1];
        strings[strings.length-1] = temp;
        if(strings.length>3) {
            temp = strings[1];
            strings[1] = strings[2];
            strings[2] = temp;
        }
        if(strings.length>4){
            temp = strings[1];
            strings[1] = strings[4];
            strings[4] = temp;
            temp = strings[2];
            strings[2]=strings[3];
            strings[3]=temp;
            temp = strings[3];
            strings[3]=strings[4];
            strings[4]= temp;
        }

        return Arrays.toString(strings).replace("[", "").replace("]", "").replace(",", "");

    }

    //BEST PRACTICE
    /*
      List Words = Arrays.asList(str.split(" "));
     Collections.reverse(Words);
     return String.join(" ", Words);
     */

    /*
    String[] str2 = str.split(" ");
     String fin = "";
     for(int i=str2.length-1;i>=0;i--){
       fin += str2[i];
       if(i>0)fin+=" ";
     }
     return fin;
     */

}