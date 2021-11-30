import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Ejercicio5 {

    public static void main(String[] args) {

        //Input
        List<Alumnos> alumnosLista = List.of(
            new Alumnos("Homero", "Simpson", LocalDate.parse("2021-11-28").minusYears(30)),
            new Alumnos("Cosme", "Fulanito", LocalDate.parse("2021-10-18").minusYears(28)),
            new Alumnos("Juan", "Perez", LocalDate.parse("2021-04-12").minusYears(25)),
            new Alumnos("Andrea", "Gomez", LocalDate.parse("2021-03-09").minusYears(25)),
            new Alumnos("Maria", "Coso", LocalDate.parse("2021-01-20").minusYears(22))            
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
