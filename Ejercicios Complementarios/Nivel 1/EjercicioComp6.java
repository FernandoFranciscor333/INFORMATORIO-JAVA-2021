import java.util.Scanner;

public class EjercicioComp6 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);   
        System.out.println("Ingrese el primer número: ");   
        int num1 = scan.nextInt();   
        System.out.println("Ingrese el segundo número: ");
        int num2 = scan.nextInt();
        scan.close();
    
        int resultado = potencia(num1, num2);
        System.out.println(num1+ " elevado a " + num2 + " = "+ resultado);

    }   

    //calcula la potencia por multiplicación sucesiva y devuelve un resultado.  
    private static int potencia(int x, int y) {
        int potencia=1;
        for (int i = 0; i < x ; i++) {
            potencia = potencia*y;            
        }
        return potencia;
    }
    
}
