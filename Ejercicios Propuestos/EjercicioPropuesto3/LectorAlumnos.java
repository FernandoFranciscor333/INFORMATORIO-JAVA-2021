package EjercicioPropuesto3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorAlumnos {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/user/Desktop/prog/ETAPA 3/Java/git/INFORMATORIO-JAVA-2021/Ejercicios Propuestos/EjercicioPropuesto3/alumnos.txt");
        Scanner scan = new Scanner(file);        

        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
    }    
}
