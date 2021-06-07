import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int continuar = 1;

        while (continuar == 1){
            System.out.println("Por favor, ingrese tres números: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
    
            System.out.println("El primer nro ingresado es: " + a);
            System.out.println("El primer nro ingresado es: " + b);
            System.out.println("El primer nro ingresado es: " + c);


            System.out.println("Si desea continuar presione 1, sino cualquier otro número");
            continuar = scan.nextInt();
        }
        scan.close();
    }
}
