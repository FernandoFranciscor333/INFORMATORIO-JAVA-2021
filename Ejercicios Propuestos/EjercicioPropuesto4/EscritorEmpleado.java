package EjercicioPropuesto4;
import java.util.ArrayList;
import java.io.*;

public class EscritorEmpleado {
    public static void main(String[] args) throws IOException {

        //Contrucción del escritor y del archivo
        File archivo = new File("Ejercicios Propuestos/EjercicioPropuesto4/empleados.txt");
        FileWriter escritor = new FileWriter(archivo);
        PrintWriter impresor = new PrintWriter(escritor);

        //Creación de los objetos
        Empleado emp1 = new Empleado(45781354, "Jorge", "Gomez");
        Empleado emp2 = new Empleado(45127454, "Carlos", "Fernandez");
        Empleado emp3 = new Empleado(39845741, "Patricia", "hernandez");
        Empleado emp4 = new Empleado(39854754, "Maria", "Perez");

        //Creación de la lista y adición de los objetos
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);

        //Escritura en el archivo
        for (Empleado empleado : empleados){
            impresor.println(empleado);
        }

        impresor.close();
    }    
}
