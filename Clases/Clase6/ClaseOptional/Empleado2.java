package ClaseOptional;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

public class Empleado2 {

    private Long id;
    private String nombre;
    private Optional<LocalDate> fechaNacimiento;
    private BigInteger salario;

    public Empleado2(Long id, String nombre, Optional<LocalDate> fechaNacimiento, BigInteger salario){
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Optional<LocalDate> getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Optional<LocalDate> fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigInteger getSalario() {
        return salario;
    }

    public void setSalario(BigInteger salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado2 [fechaNacimiento=" + fechaNacimiento + ", id=" + id + ", nombre=" + nombre + ", salario="
                + salario + "]";
    }
    
    
    
}
