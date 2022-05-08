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
 * Tiempo: 18
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Bio {

    public String dnaToRna(String dna) {

        return  (!dna.isEmpty())? dna.replace("T","U"):"";
    }

}