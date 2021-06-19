import java.util.Scanner;

public class EjercicioProp1 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("SUMA");
        System.out.println("Ingrese el primer número:");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scan.nextInt();
        System.out.println("La suma de ambos números es: " + sum(num1, num2));
        
        scan.close();        
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}
