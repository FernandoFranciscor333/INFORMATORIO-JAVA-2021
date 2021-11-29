import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Input
        List<Alumnos> alumnosLista = List.of(
            new Alumnos("Homero", "Simpson", LocalDate.now().minusYears(30)),
            new Alumnos("Cosme", "Fulanito", LocalDate.now().minusYears(28)),
            new Alumnos("Juan", "Perez", LocalDate.now().minusYears(25)),
            new Alumnos("Andrea", "Gomez", LocalDate.now().minusYears(25)),
            new Alumnos("Maria", "Coso", LocalDate.now().minusYears(22))            
        ); 

        //Output
        mapeador(alumnosLista);
    }

    public static void mapeador(List<Alumnos> lista){

        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        LocalDate fechaActual = LocalDate.parse("2021-11-28");        

        for (Alumnos alumno:lista){
            String nombreCompleto = alumno.getApellido()+" "+alumno.getNombre();
            Period diferenciaFechas = alumno.getFechaDeNacimiento().until(fechaActual);
            Integer edad = diferenciaFechas.getYears();

            mapa.put(nombreCompleto, edad);
        }

        System.out.println(mapa);        
    }    
}
