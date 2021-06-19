package Videos;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExcepcionesChequeadas {
    static Map<Integer, String> alumnos = cargarMap();

    public static void main(String[] args) {
        String nombre;
        try{
            //nombre = alumnos.get(0123); //retorna null(no existe)
            nombre = buscarAlumnoPorLegajo(0123);
            System.out.println("Tamaño del nombre: " + nombre.length());            
        } catch (EntidadNoEncontradaException e){
            e.printStackTrace();
        }
        System.out.println("Operación terminada.");
    }

    public static Map<Integer, String> cargarMap(){
        Map<Integer, String> alumnos = new HashMap<>();
        alumnos.put(1234, "Juan");
        alumnos.put(2345, "Maria");
        alumnos.put(3456, "Lisa");
        alumnos.put(4567, "Homero");
        alumnos.put(7890, "Pablo");  
        return alumnos;
    }

    public static String buscarAlumnoPorLegajo(Integer legajo) throws EntidadNoEncontradaException {
        String nombre=alumnos.get(legajo);
        if(Objects.isNull(nombre)) {
            throw new EntidadNoEncontradaException("Legajo " + legajo + " no encontrado");
        }
        return nombre;
    }    
}
