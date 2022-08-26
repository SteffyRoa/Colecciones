package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Clase5 {

    public static void main(String[] args) {




    Curso curso1 = new Curso("Python",30);
        Curso curso2 = new Curso("Javascript",30);
        Curso curso3 = new Curso ("PHP",10);
        Curso curso4 = new Curso ("Angular", 50);

        ArrayList<Curso> cursos = new ArrayList <>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        

        //utilizando la clase collection
        Collections.sort(cursos);//dara error porque no tenemos comparable y por eso
        //implementamos  comparable en curso
        System.out.println(cursos);


        //SI QUEREMOS EL ORDEN INVERSO QUE COMIENCE PHP que es el ultimo en la lista
        Collections.sort(cursos,Collections.reverseOrder());

        //sino queremos usar compareTo de la clase curso** y tambien dara el mismo resultado
        cursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println(cursos);

        //Si queremos utilizar stream,
       // cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo).collect(Collectors.toList()));


}

}
