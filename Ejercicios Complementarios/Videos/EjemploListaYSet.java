package Videos;

import java.util.ArrayList;
import java.util.List;

public class EjemploListaYSet {

    public static void main(String args[]){
        List<String> nombres = new ArrayList<>();

        cargarLista(nombres);
        System.out.println("Tamaño de la lista luego de cargarla" + nombres.size());

        for (String nombre: nombres){
            System.out.println(nombre);
        }

        System.out.println("Existe \"Maria\" en la lista: " + nombres.contains("Maria"));

        nombres.remove("Juan");
        System.out.println("Tamaño de la lista luego de remover: " + nombres.size());
    }

    public static void cargarLista(List<String> nombres) {
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Lisa");
        nombres.add("Homero");
        nombres.add("Pablo");
    }    
}