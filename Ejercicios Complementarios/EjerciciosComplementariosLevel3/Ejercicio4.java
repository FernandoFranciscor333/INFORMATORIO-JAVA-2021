import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        //Input
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        //output
        factorial(numeros);
    }    

    public static void factorial(List<Integer> lista){

        List<Integer> listaFactoriales = new ArrayList<Integer>();

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(lista);
        ArrayList<Integer> listaSinDuplicados = new ArrayList<>(hashSet);

        for (int numero : listaSinDuplicados){
            int factorial = 1;
            for (int i = 1; i<=numero; i++){
                factorial = factorial * i;            
            }
            listaFactoriales.add(factorial);
        }
        System.out.println(listaFactoriales);
    }
}
