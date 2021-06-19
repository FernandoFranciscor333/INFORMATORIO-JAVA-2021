package Videos;
import java.util.HashMap;
import java.util.Map;

public class EjemploMap {

    public static void main(String args[]){
        Map<Integer, String> alumnos = new HashMap<>();
        cargarMap(alumnos);
        System.out.println("Tamaño del Map luego de cargarlo: " + alumnos.size());
        //iterar y mostrar clave y valor
        for(Map.Entry<Integer, String> registro: alumnos.entrySet()){
            System.out.println("Id: " + registro.getKey() + " Nombre: " + registro.getValue());
        }
        //iterar y mostrar solo las claves   
        for (Integer clave: alumnos.keySet()){
            System.out.println("Id: " + clave);
        }
        //iterar y solo mostrar los valores
        for (String valor: alumnos.values()){
            System.out.println("Id: " + valor);
        }
        // Pregunto si map contiene una clave dada
        System.out.println("Existe la clave 1234 en el Map: " + alumnos.containsKey(1234));
        System.out.println("Existe el valor 1234 en el Map: " + alumnos.containsValue("1234"));
        //eliminar un elemento
        alumnos.remove(1234);
        System.out.println("Tamaño del Map luego de remover: " + alumnos.size());

    }
    public static void cargarMap(Map<Integer, String> nombres){
        nombres.put(1234, "Juan");
        nombres.put(2345, "Maria");
        nombres.put(3456, "Lisa");
        nombres.put(4567, "Homero");
        nombres.put(7890, "Pablo");        
    }
}

    

