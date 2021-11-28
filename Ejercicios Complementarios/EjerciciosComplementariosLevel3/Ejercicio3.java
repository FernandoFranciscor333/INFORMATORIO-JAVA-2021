import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Input
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        //Output
        filtroDuplicados(palabras);
    }

    public static void filtroDuplicados(List<String> lista){

        long contador = lista.stream().map(String::toUpperCase).filter(x -> x.startsWith("B")).count();     
        System.out.println(contador);
    }
}
