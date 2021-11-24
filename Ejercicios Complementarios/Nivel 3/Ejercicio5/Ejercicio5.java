package Ejercicio5;

import java.time.LocalDate;
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
        Mapeador(alumnosLista);

    }

    public static void Mapeador(List<Alumnos> lista){

        HashMap<String, Integer> mapa = new HashMap<String, Integer>();

        Alumnos homero = lista.get(0);
        String nombreCompleto = homero.getApellido()+" "+homero.getNombre();
        Integer edad = 2021 - homero.getFechaDeNacimiento().getYear();
        mapa.put(nombreCompleto, edad);

        System.out.println(mapa);        
    }
    
}
