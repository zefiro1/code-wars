/*--Creado por José el día 23/03/2022 y a la hora 22:11 en el proyecto 8kyu Abbreviate a Two Word Name--*/


import org.jetbrains.annotations.NotNull;



public class AbbreviateTwoWords {


    /**
     * Te da las iniciales de tu nombre
     * @param name del que quieres saber las iniciales
     * @return las iniciales
     */
    public static @NotNull String abbrevName(String name) {

        String[] b = name.split(" ", name.length());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < b.length; i++) {
            stringBuilder.append(b[i].toUpperCase().charAt(0) + "." + b[i].toUpperCase().charAt(0));

        }
        return (stringBuilder.charAt(0) + "." + stringBuilder.charAt(3));

        //Otras implementaciones
        //Best Practices
        //  String[] names = name.split(" ");
        //    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}