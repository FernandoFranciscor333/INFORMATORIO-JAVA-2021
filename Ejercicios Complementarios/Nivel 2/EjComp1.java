import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EjComp1 {
    public static void main(String[] args) {
          
        List<String> ranking = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese tres ciudades por orden de preferencia. ");
        System.out.println("");
        
        System.out.println("Ingrese la primer ciudad: ");        
        ranking.add(scan.nextLine());

        System.out.println("Ingrese la segunda ciudad: ");        
        ranking.add(scan.nextLine());

        System.out.println("Ingrese la tercera ciudad: ");        
        ranking.add(scan.nextLine());

        scan.close();

        System.out.println("");
        int num=1;

        for(String c: ranking) {
            System.out.println("# "+ num + " " + c);
            num+=1;
        }        
    }
}
