/*--Creado por José el día 22/03/2022 y a la hora 22:10 en el proyecto 8kyu Counting Sheep--*/


public class Counter {

    /**
     * Cuenta las "obejas" en realidad cuenta cuantos trues hay en un array
     * @param arrayOfSheeps boolean array del cual quieres saber el número de tures que hay
     * @return el número de trues que hay en el arrays
     */
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
       int contador = 0;
        try {

            if (arrayOfSheeps != null) {
                for (boolean b : arrayOfSheeps) {
                    if (b == true)
                        contador++;

                }

            }

        } catch (NullPointerException e) {

        }

        //Mejorado por mi
//        int contador = 0;
//        try{
//        for (Boolean b: arrayOfSheeps) {
//            if(b)
//                contador++;
//        }
//        }catch(NullPointerException e){}

        return contador;
    }

}