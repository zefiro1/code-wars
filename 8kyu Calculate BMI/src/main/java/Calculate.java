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
 * Tiempo: 15
 * </li>
 * <li>
 * Version: 0.1
 * </li>
 * <p>
 */

public class Calculate {

    public static String bmi(double weight, double height) {
        if(weight/Math.pow(height,2)<=18.5){
            return "Underweight";
        }
        else if(weight/Math.pow(height,2)<=25.0){
            return "Normal";
        }
        else if(weight/Math.pow(height,2)<=30.0){
            return "Overweight";
        }
        else if(weight/Math.pow(height,2)>30.0){
            return "Obese";
        }
        return "";
    }

    /*
    Otras implementaciones
    double bmi = weight / (height * height);

      if ( bmi <= 18.5) return "Underweight";
      if ( bmi <= 25) return "Normal";
      if ( bmi <= 30) return "Overweight";
      return "Obese";
    ------------------------------------------
    double bmi =weight/(height*height);
    return bmi <= 18.5 ? "Underweight": bmi <=25.0 ? "Normal" : bmi<=30.0 ? "Overweight" : "Obese";
     */

}