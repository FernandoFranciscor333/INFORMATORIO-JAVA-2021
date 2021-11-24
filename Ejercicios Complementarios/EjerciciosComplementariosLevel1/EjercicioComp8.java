import java.util.Scanner;

public class EjercicioComp8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //toma los datos
        System.out.println("Ingrese nombre y apellido: ");
        String nombre = scan.nextLine();
        System.out.println("Edad: ");
        String edad = scan.nextLine();
        System.out.println("Dirección: ");
        String direccion = scan.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        //imprime los datos
        System.out.println("");
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);   
    }
}
