package Colecciones;
public class Curso implements Comparable <Curso> {
    

    private String nombre;
    private int tiempo;

    public Curso (String nombre, int tiempo){
        this.nombre= nombre;
        this.tiempo = tiempo;

    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTiempo(){
        return tiempo;
    }

    //sobreescribir el metodo ToString que ya viene por defecto por todas las clase
    //y si no lo tuilizamos saldra los valores extranos de la direccion en sistema.
    @Override
    public String toString(){
        return this.nombre;

    }
    @Override
    public int compareTo(Curso o) {
        // TODO Auto-generated method stub
        return this.nombre.compareTo(o.getNombre());

        //si no quisieramos usar este comparato en la clase principal
        //podemos agregar** 
    }
    
}
