import java.util.Scanner;

public class Ejercicio6DoWhile {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;
        
        do {
            System.out.println("Por favor ingrese el número: ");
            nro = scan.nextInt();
            System.out.println("El número ingresado es: " + nro);
    
            System.out.println("Si desea continuar presione 1, sino cualquier otro número");
            continuar = scan.nextInt();
        } while (continuar == 1);
        scan.close();
    }

}
