package Videos;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

    public static void main(String args[]){
        Set<String> nombres = new HashSet<>();

        cargarSet(nombres);
        System.out.println("Tamaño del set luego de cargarla: " + nombres.size());

        for (String nombre: nombres){
            System.out.println(nombre);
        }

        System.out.println("Existe \"Maria\" en el set: " + nombres.contains("Maria"));

        nombres.remove("Juan");
        System.out.println("Tamaño del set luego de remover: " + nombres.size());
    }

    public static void cargarSet(Set<String> nombres) {
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Lisa");
        nombres.add("Homero");
        nombres.add("Pablo");
    }    
}
