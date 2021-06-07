import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EjComp2 {
    public static void main(String[] args) {
          
        List<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int contador = 5;

        System.out.println("Ingrese cinco números: ");
        do {                                
            numeros.add(scan.nextInt());
            contador -= 1;
        } while (contador != 0);

        System.out.println("El tamaño de la lista es: " + numeros.size());

        System.out.println("Ingrese nuevamente dos números: ");
        numeros.add(0, scan.nextInt());
        numeros.add(4, scan.nextInt());

        scan.close();

        System.out.println("");
        System.out.println("El tamaño actualizado de la lista es: " + numeros.size());
        System.out.println("");        

        for(int n: numeros) {
            System.out.print(n+", ");            
        }        
    }    
}
