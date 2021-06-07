import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EjComp4 {
    public static void main(String[] args) {        

        List<String> alumnos = new ArrayList<>();

        alumnos.add("Ana");
        alumnos.add("Beatriz");
        alumnos.add("Carolina");
        alumnos.add("Diana");
        alumnos.add("Eliana");
        alumnos.add("Fabiana");
        alumnos.add("Gastón");
        alumnos.add("Honorio");
        alumnos.add("Iván");
        alumnos.add("José");
        alumnos.add("Kevin");
        alumnos.add("Leandro");

        Collections.shuffle(alumnos);

        List<String> divA = alumnos.subList(0, 4);
        List<String> divB = alumnos.subList(4, 8);
        List<String> divC = alumnos.subList(8, 12);


        System.out.println("División A: ");
        for (String alumno : divA) {
            System.out.print(alumno+" / ");            
        }
        System.out.println("");

        System.out.println("División B: ");
        for (String alumno : divB) {
            System.out.print(alumno+" / ");            
        }
        System.out.println("");

        System.out.println("División C: ");
        for (String alumno : divC) {
            System.out.print(alumno+" / ");            
        }
    }
}
