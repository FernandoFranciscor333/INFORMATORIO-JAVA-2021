package Videos;

public class ServicioSueldo {

    public static void main(String[] args){
        Empleado emp1 = new EmpleadoEfectivo(1234, "Homero", "Simpson", 40000, 2);
        Empleado emp2 = new EmpleadoJornada(0303, "Cosme", "Fulanito", 100, 400);
        System.out.println(emp1.calcularSueldo());
        System.out.println(emp2.calcularSueldo());
    }
    
}
