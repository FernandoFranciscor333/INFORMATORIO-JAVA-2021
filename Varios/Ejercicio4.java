import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int dia;



        while (continuar == 1){
            System.out.println("Ingrese un número del 1 al 7");
            dia = scan.nextInt();
            switch (dia){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                }
                System.out.println("Si desea continuar presione 1, sino cualquier otro número");
                continuar = scan.nextInt();
        }
        scan.close();
    }
}