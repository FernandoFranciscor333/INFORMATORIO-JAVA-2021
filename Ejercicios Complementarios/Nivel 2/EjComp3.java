import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EjComp3 {
    public static void main(String[] args) {
        
        List<String> mazo = new ArrayList<>();
        mazo.add("A");
        mazo.add("2");
        mazo.add("3");
        mazo.add("4");
        mazo.add("5");
        mazo.add("6");
        mazo.add("7");
        mazo.add("8");
        mazo.add("9");
        mazo.add("10");
        mazo.add("J");
        mazo.add("Q");
        mazo.add("K");

        //Mazo en orden
        System.out.println("Primera tirada:");

        for (String carta : mazo) {
            System.out.print(carta + ", ");            
        }

        //Mazo en orden inverso
        System.out.println("");
        System.out.println("Segunda tirada:");

        Collections.reverse(mazo);
        for (String carta : mazo) {            
            System.out.print(carta + ", ");
        }        

        //Mazo en orden aleatorio
        System.out.println("");
        System.out.println("Tercera tirada:");

        Collections.shuffle(mazo);
        for (String carta : mazo) {            
            System.out.print(carta + ", ");
        }        
    }    
}
