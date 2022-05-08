import java.util.Arrays;
import java.util.Locale;

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
 * Tiempo: 14
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class FakeBinary {

    /**
     * Dada una cadena de dígitos, debe reemplazar cualquier dígito por debajo de
     * 5 con '0' y cualquier dígito 5 y superior con '1'. Devuelve la cadena resultante.
     * @param numberString
     * @return
     */
    public static String fakeBin(String numberString) {
        if(numberString.isBlank() || numberString.isEmpty()){
            return numberString;
        }

        String[] arr = numberString.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: arr) {
            stringBuilder.append((Integer.parseInt(s)>=5?s.replace(s,"1"):s.replace(s,"0")));
        }
        return stringBuilder.toString();

    }

    /*
    Mejores practicas
     return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

      final char c[] = numberString.toCharArray();
        for (int i = 0; i < c.length; i++)
          c[i] = c[i] < '5' ? '0' : '1';
        return new String(c);
     */
}