import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Ejercicio1{

    public static void main(String[] args) {
        
        //Input
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        //Output
        FiltroNulos(palabras);
    }   

    public static void FiltroNulos(List<String> lista){

        List<String> palabrasFiltradas = Optional.ofNullable(lista)
            .orElseGet(Collections::emptyList)
            .stream()
            .filter(a -> a != null && !a.isEmpty())            
            .collect(Collectors.toList());    

        System.out.println(palabrasFiltradas);
    }
}