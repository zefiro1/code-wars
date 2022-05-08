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
 * Tiempo: 20
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Kata {

    public int min(int[] list) {
        if (list != null) {
            int resultado = 0;
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list.length - 1; j++) {
                    int elementactual = list[j];
                    int elementosiguiente = list[j + 1];
                    if (elementactual < elementosiguiente) {
                        list[j] = elementosiguiente;
                        list[j + 1] = elementactual;
                    }
                }
                System.out.println(Arrays.toString(list));
                return list[list.length - 1];
            }
        }
        return 0;
    }

    public int max(int[] list) {
        if (list != null) {
            int resultado = 0;
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list.length - 1; j++) {
                    int elementactual = list[j];
                    int elementosiguiente = list[j + 1];
                    if (elementactual > elementosiguiente) {
                        list[j] = elementosiguiente;
                        list[j + 1] = elementactual;
                    }
                }
                return list[list.length - 1];
            }
        }
        return 0;
    }

    /*
    Otras implementaciones
    public int min(int[] list) {
    return Arrays.stream(list).min().getAsInt();
  }

  public int max(int[] list) {
    return Arrays.stream(list).max().getAsInt();
  }
     */

}