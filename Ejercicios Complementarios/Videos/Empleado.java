package Videos;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;

    public Empleado(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;        
    }

    public abstract int calcularSueldo();

    //setter (permite cambiar atributos aunque sean privados)
    //public void setNombre(String nombre) {
    //    this.nombre = nombre;
    //}

    @Override
    public String toString() {
        return String.valueOf(this.dni) + " - " + this.nombre + " - " + this.apellido;
    }
}
