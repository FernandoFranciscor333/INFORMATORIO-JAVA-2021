import java.util.Scanner;

public class EjercicioComp1 {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        String nombre;        

        System.out.println("Por favor, ingrese un nombre: ");
        nombre = scan.nextLine();
        System.out.println("Hola " + nombre);
        scan.close();
    }

}
