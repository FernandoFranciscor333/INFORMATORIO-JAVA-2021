import java.util.Scanner;

public class EjercicioProp2 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("FACTORIAL");
        System.out.println("Ingrese un número:");
        int num = scan.nextInt(); 

              
        System.out.println("El factorial de " + num + " es: " + factorial(5));  
        scan.close();        
    }
    
    public static int factorial(int numero){
        int res = numero;
        if (numero > 1){
            res = res*factorial(numero-1);
        }
        return res;
    }   
}
