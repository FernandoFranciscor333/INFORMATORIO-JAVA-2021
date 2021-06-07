import java.util.HashSet;
import java.util.HashMap;

public class EjComp6 {
    public static void main(String[] args) {

        HashSet<Empleado> empleados = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();

        empleados.add(new Empleado("José", 36587491, 20, 1324));
        empleados.add(new Empleado("Pedro", 40545454, 30, 1024));
        empleados.add(new Empleado("Sandra", 44545654, 25, 1024));
        empleados.add(new Empleado("Patricia", 28454321, 35, 1460));

        for (Empleado emp : empleados) {
            sueldo.put(emp.getDni(), emp.getSalario());
        }

        for (int dni: sueldo.keySet()) {
            System.out.println("DNI " + dni + " $ " + sueldo.get(dni));            
        }
    }
}

class Empleado {
    
    String nombre;
    int dni;
    float horasTrabajadas;
    float salarioHora;

    public Empleado(String nombre, int dni, float horasTrabajadas, float salarioHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHora = salarioHora;
    }

    public int getDni() {
        return dni;
    }

    public float getSalario() {
        return this.horasTrabajadas * this.salarioHora;
    }
}