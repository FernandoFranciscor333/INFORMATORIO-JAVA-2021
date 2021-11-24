import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Input
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        //Output
        filtroDuplicados(palabras);
    }

    public static void filtroDuplicados(List<String> lista){

        int contador=0;

        for(String palabra:lista){    
            char primeraLetra = palabra.charAt(0);                     

            if(primeraLetra == 'B' || primeraLetra ==  'b'){
                contador+=1;
                //System.out.println(primeraLetra);
            } 
        }
        System.out.println(contador);
    }
}
