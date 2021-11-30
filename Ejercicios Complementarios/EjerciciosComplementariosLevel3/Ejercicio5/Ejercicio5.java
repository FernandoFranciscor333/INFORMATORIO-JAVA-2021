import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Ejercicio5 {

    public static void main(String[] args) {

        //Input
        List<Alumnos> alumnosLista = List.of(
            new Alumnos("Homero", "Simpson", LocalDate.parse("1991-11-28")),
            new Alumnos("Cosme", "Fulanito", LocalDate.parse("1993-10-18")),
            new Alumnos("Juan", "Perez", LocalDate.parse("1997-04-12")),
            new Alumnos("Andrea", "Gomez", LocalDate.parse("1996-03-09")),
            new Alumnos("Maria", "Coso", LocalDate.parse("2001-01-20"))            
        ); 

        //Output
        mapeador(alumnosLista);
    }

    public static void mapeador(List<Alumnos> lista){

        Map<String, Integer> mapa = new HashMap<String, Integer>();
        LocalDate fechaActual = LocalDate.now();         

        mapa = lista.stream().collect(Collectors.toMap(x -> x.getApellido()+" "+ x.getNombre(), 
                x -> Integer.valueOf(x.getFechaDeNacimiento().until(fechaActual).getYears())));

        System.out.println(mapa);        
    }    
}
