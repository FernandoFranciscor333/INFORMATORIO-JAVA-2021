package EjercicioPropuesto4;

public class Empleado {
    
    int dni;
    String nombre;
    String apellido;

    public Empleado(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;    
    }

    @Override
    public String toString() {
        return String.valueOf(this.dni) + " - " + this.nombre + " - " + this.apellido;
    }
}
