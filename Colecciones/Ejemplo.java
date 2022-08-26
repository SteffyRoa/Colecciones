package Colecciones;




import java.util.ArrayList;
   //adicionara de acuerdo al orden que se va colocando
public class Ejemplo {
    public static void main(String[] args) {
        String variable1 = "Ejemplo";
        String variable2 = "Ejemplo2";
        String variable3 = "Ejemplo3";
        String variable4 = "Ejemplo4";

        ArrayList<String> lista = new ArrayList<>();
        //imprime en orden variable1,2,3,4
        lista.add(variable1);//0
        lista.add(variable2);//1
        lista.add(variable3);//2
        lista.add(variable4);//3

        //remover elementos de la lista
        lista.remove(1);

        //modificar elementos de la lista
        lista.set(2,"Ejemplo alterado");

   

     

        System.out.println(lista.size());//tamaño de la lista
        System.out.println(lista);//imprimir
    }
    
}
