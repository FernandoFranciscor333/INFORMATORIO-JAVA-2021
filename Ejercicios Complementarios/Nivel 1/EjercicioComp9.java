import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioComp9 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la frase: ");
        String frase = reader.readLine();
        System.out.println("Ingrese la letra: ");
        char letra = (char) System.in.read();

        int contador=0;

        //recorre la frase contando las veces que aparece la letra ingresada.
        for(int i=0; i<frase.length();i++){
            char c=frase.charAt(i);
            if (c==letra){
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");


    }
}
