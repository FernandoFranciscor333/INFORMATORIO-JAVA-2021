import java.util.Scanner;

public class EjercicioComp2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Por favor, ingrese el primer número: ");
        numero1 = scan.nextInt();

        
        System.out.println("Por favor, ingrese el primer siguiente: ");
        numero2 = scan.nextInt();

        scan.close();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);
        System.out.println(numero1 + " % " + numero2 + " = " + resto);       
        
    }
    
}
