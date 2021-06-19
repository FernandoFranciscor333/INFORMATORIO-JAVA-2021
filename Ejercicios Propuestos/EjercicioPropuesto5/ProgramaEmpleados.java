import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;



public class ProgramaEmpleados {


    public static void main (String[] args) throws IOException{


        //Lectura del archivo y extracción de datos.
        BufferedReader lector = new BufferedReader(new FileReader("Ejercicios Propuestos/EjercicioPropuesto5/empleados.txt"));     
        ArrayList<Empleado5> empleados = new ArrayList<Empleado5>();
        
        String linea;
        String [] datos=null;
        while ((linea = lector.readLine()) != null) {
            datos = linea.split(","); 
            Double sueldo = Double.parseDouble(datos[3]); 
            LocalDate fechaNacimiento = formatearFecha(datos[2], "dd-MM-yyyy");
            Empleado5 emp = new Empleado5(datos[0], datos[1],fechaNacimiento,sueldo);
            empleados.add(emp);

            
        }
        lector.close();


        //Menú de opciones.
        int operaciones = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una opción. \n 1. Búsqueda. \n 2. Compación de edades. \n 3. Compación de sueldos." +
        "\n 4. Ordenar trabajadores por Apellido. \n 5. Ordenar trabajadores por Nombre. \n 6. Imprimir lista completa de empleados. \r\n");
        operaciones = scan.nextInt();

        if (operaciones == 1) {
            System.out.println("Búsqueda: ");
            busqueda(empleados);
        } else if (operaciones == 2){
            System.out.println("Compación de edades: ");
            comparadorEdades(empleados);
        } else if (operaciones == 3){
            System.out.println("Compación de sueldos");
            comparadorSueldos(empleados);
        } else if (operaciones == 4){
            System.out.println("Ordenar trabajadores por Apellido: ");
            ordenarApellido(empleados);            
        } else if (operaciones == 5){
            System.out.println("Ordenar trabajadores por Nombre:");
            ordenarNombres(empleados);            
        }else if (operaciones == 6){
            for (Empleado5 emp : empleados){
                System.out.println(emp);
            }                       
        } else {
            System.out.println("Vuelva a ingresar una opción: ");                        
        }
    }


    
    //Método para buscar apellidos por letra inicial.
    public static void busqueda(ArrayList<Empleado5> lista){
        int contador = 0;
        int resp = 0;
                 
        while(contador == 0){  
            Scanner scan = new Scanner(System.in);             
            System.out.println("BUSQUEDA POR LETRA. Ingrese la primer letra del apellido: ");
            String letra = scan.nextLine();

            for(Empleado5 empleado : lista) {
                if(empleado.getApellido().startsWith(letra) || empleado.getApellido().toLowerCase().startsWith(letra)){
                    System.out.println(empleado);
                }
            }     

            System.out.println("Si desea realizar otra búsqueda presione 1, sino presione cualquier otro número: ");
            resp = scan.nextInt();
            
            try{
                if(resp != 1){
                    System.out.println("---------------------------------------------------");
                    break; 
                }
            }catch(InputMismatchException e){ 
                System.out.println("No ha ingresado un número");        
            }finally{
                System.out.println(" ");
            }
        }                           
    }



    //Método para comparar edades.
    public static void comparadorEdades(ArrayList<Empleado5> lista){
        
        Comparator<Empleado5> comparador = null;
        comparador = Comparator.comparing(Empleado5::getEdad);
        Empleado5 masJoven = lista.stream().min(comparador).get();
        Empleado5 masViejo = lista.stream().max(comparador).get();

        System.out.println("El empleado más joven es: " + masJoven + " | " + masJoven.getEdad() + " años.");
        System.out.println("El empleado más viejo es: " + masViejo + " | " + masViejo.getEdad() + " años.");

    }


    //Método para comparar sueldos.
    public static void comparadorSueldos(ArrayList<Empleado5> lista){

        Comparator<Empleado5> comparador = null;
        comparador = Comparator.comparing(Empleado5::getSueldo);
        Empleado5 masGana = lista.stream().max(comparador).get();
        Empleado5 menosGana = lista.stream().min(comparador).get();
    
        System.out.println("El empleado que más gana es: " + masGana + " |  $ " + masGana.getSueldo());
        System.out.println("El empleado que menos gana es: " + menosGana + " |  $ " + menosGana.getSueldo()); 
    }



    //Método para ordenar la lista por oden alfabético (Apellido).
    public static void ordenarApellido(ArrayList<Empleado5> lista){
        
        Comparator<Empleado5> comparador = null;
        Iterator<Empleado5> iterador = lista.iterator();

        comparador = Comparator.comparing(Empleado5::getApellido);        
        Collections.sort(lista, comparador);
        iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        } 
    }    



    //Método para ordenar la lista por oden alfabético (Nombre).
    public static void ordenarNombres(ArrayList<Empleado5> lista){

        Comparator<Empleado5> comparador = null;
        Iterator<Empleado5> iterador = lista.iterator();
                     
        comparador = Comparator.comparing(Empleado5::getNombre);        
        Collections.sort(lista, comparador);
        iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }            
    }



    //Formato para las fechas.
    public static LocalDate formatearFecha(String fecha, String formato) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(formato);        
        return LocalDate.parse(fecha,format);
    }
}
