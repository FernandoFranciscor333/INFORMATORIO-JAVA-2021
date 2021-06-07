import java.util.Scanner;

public class EjercicioComp4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scan.nextInt();
        
        int resultado = factorial(numero);
        scan.close();
      
         

        System.out.printf("El factorial es: " + resultado);
    }
     
    //calcula el factorial y retorna el resultado
    private static int factorial(int num)
    {
        int factorial = 1;
        while(num != 0){
            factorial *= num;
            num--;                     
        }
        return factorial;       
    
    }
}
