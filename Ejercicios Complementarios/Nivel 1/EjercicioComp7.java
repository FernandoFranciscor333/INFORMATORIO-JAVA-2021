import java.util.Scanner;

public class EjercicioComp7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String palabra = null;
        char cadena[] = null;

        System.out.println("Ingrese una palabra en minúscula: ");
        palabra=scan.nextLine();
        scan.close();
        cadena=palabra.toCharArray();

        //convierte la cadena de caracteres a mayúscula empleando los valores ASCII
        for (int i = 0; i < cadena.length; i++){
            cadena[i]=(char) (cadena[i] - 32);
        }
            
        for(int j=0; j<cadena.length;j++){
            System.out.print(cadena[j]);
        }

    }

}
