package Videos;

public class ExcepcionesNoChequeadas {

    public static void main(String[] args){


        try{
            System.out.println("Cargar un aray de 3 elementos: ");

            int[] dnis = new int[]{12345678, 12345679, 12345670};
            imprimirCuatroElementos(dnis);
    
    
    /*      Integer horasTrabajadasEnMes = 0;
            Integer diasTrabajados = null;
            System.out.println("El promedio de horas trabajadas del empleado es: " 
            + horasTrabajadasEnMes / diasTrabajados + " por día."); */
        } catch(Exception ex){
            System.out.println("Excepción ocurrida: " + ex);
        }
        
    }
    
    public static void imprimirCuatroElementos(int[] array){
        System.out.println("Este es el 4to elemento: " + array[3]); 
    }
}
