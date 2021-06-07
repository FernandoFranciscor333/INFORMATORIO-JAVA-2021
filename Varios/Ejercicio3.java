import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nota;

        do {
            System.out.println("Ingrese la nota: ");            
            nota = scan.nextInt();
            scan.close();
            if (nota > 92){
                System.out.println("Excelente");        
            } else if (nota > 89) {
                System.out.println("Sobresaliente");        
            } else if (nota > 74) {
                System.out.println("Distinguido");        
            } else if (nota > 59) {
                System.out.println("Bueno");        
            } else {
                System.out.println("Desaprobado");
            }   
         
            System.out.println("Si desea continuar presione 1, sino cualquier otro número ");
            continuar = scan.nextInt();            
        } while (continuar == 1);
        scan.close();             
    }
}
