/*--Creado por José el día 22/03/2022 y a la hora 20:30 en el proyecto 8kyu SmallestIntegerFinder--*/


public class SmallestIntegerFinder {

    /**
     * Encuentra el numero más pequeño en un array de numeros
     * @param args array de la cual se desea saber el número  más pequeño
     * @return el numero más pequeño del array
     */
    public static int findSmallestInt(int[] args) {

        int aux = args[0];
        for (int i = 0; i < args.length ; i++) {
            aux = Math.min(args[i], aux);
        }

        return aux;

        //Otras implementaciones
        //return IntStream.of(args).min().getAsInt();

        //Arrays.sort(args);
        //        return args[0];

    }


}