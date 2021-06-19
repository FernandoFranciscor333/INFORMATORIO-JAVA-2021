import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado5{
    private String nombre ; 
    private String apellido ;
    private LocalDate fechaNac ;
    private double sueldo ;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");        


    Empleado5(String nombre , String apellido , LocalDate fechaNac , double sueldo){

        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNac = fechaNac;
        this.sueldo=sueldo;

    }
    @Override
    public String toString() {
        return this.nombre + " - " + this.apellido + " - " + this.fechaNac.format(this.formato) + " - " + this.sueldo;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public Double getSueldo(){
        return sueldo;
    }

}
