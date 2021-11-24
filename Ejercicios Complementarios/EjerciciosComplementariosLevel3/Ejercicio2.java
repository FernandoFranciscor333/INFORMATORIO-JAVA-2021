import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Input
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5);

        //Output
        potencia(listaNumeros);
    }    

    public static void potencia(List<Integer> lista){

        List<Integer> listaPotencias = new ArrayList<Integer>();

        for(int numero : lista){            
            listaPotencias.add(numero*numero);
        }

        System.out.println(listaPotencias);
    }
}
