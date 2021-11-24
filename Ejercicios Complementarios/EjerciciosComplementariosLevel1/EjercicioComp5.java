import java.util.Scanner;

public class EjercicioComp5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el siguiente número:");
        int num2 = scan.nextInt();
        scan.close();

        int resultado = multiplicacion(num1, num2);
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }

    //calcula la multiplicación por sumas y devuelve un resultado   
    private static int multiplicacion(int x, int y){  
        int res = y;
        for (int i = 1; i < x; i++) {            
            res = res + y;            
        }
        return res;            
    }
}
