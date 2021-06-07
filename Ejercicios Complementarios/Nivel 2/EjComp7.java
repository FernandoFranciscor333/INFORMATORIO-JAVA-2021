import java.util.Scanner;

public class EjComp7 {
    public static void main(String[] args) throws Exception {

        int num1 = 0;
        int num2 = 0;

        int contador = 1;
        System.out.println("Ingrese dos números, uno menor y otro mayor: ");
        do {          
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el número menor");
            num1 = scan.nextInt();
            System.out.println("Ingrese el número mayor");
            num2 = scan.nextInt();
            
            if(num1 < num2){
                contador=0;
                scan.close();
            } else {
                System.out.println("Vuelva a ingresar.");
            }

        } while (contador != 0);

        String [] secuencia = new String[num2 - num1];
        int num = 0;
        secuencia[num] = num1 + "";
        secuencia[num2 - num1 - 1] = (num2 - 1) + "";        
        num = num + 1;

        for (int i = num1+1; i < num2; i ++){
            if (i % 2 == 0){
                secuencia[num] = "Fizz";
            }
            if (i % 3 == 0){
                secuencia[num] = " Buzz";    
            }
            if (i % 2 == 0 && i % 3 == 0){
                secuencia[num] = "FizzBuzz";
            }
            if (i % 2 != 0 && i % 3 != 0){
                secuencia[num] = i + "";
            }
            num = num+1;
        }

        for (int i = 0 ; i < secuencia.length; i ++){
            System.out.print(secuencia[i] + " ");
        }        
    }
}