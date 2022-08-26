package Colecciones;
//FORMAS DE LEER UN ARRAYLISTS
import java.util.ArrayList;

public class Ejemplo2 {
    public static void main(String[] args) {
        String variable1 = "Ejemplo";
        String variable2 = "Ejemplo2";
        String variable3 = "Ejemplo3";
        String variable4 = "Ejemplo4";

        ArrayList<String> listaString = new ArrayList<>();
      
        listaString.add(variable1);//0
        listaString.add(variable2);//1
        listaString.add(variable3);//2
        listaString.add(variable4);//3

        System.out.println(listaString);

        //Primer forma de leer un Arraylist
        for(int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));

            //Segunda Forma con un forEach

            for(String clase: listaString){//recorrio la lista string y comenzo a escribir en ella.
                System.out.println(clase);

            }

            //Tercera Forma foreach recurso de lambda apartir de java8
            listaString.forEach(notas->{
                System.out.println(notas);
            }
            );

     
    }
    
}
}
