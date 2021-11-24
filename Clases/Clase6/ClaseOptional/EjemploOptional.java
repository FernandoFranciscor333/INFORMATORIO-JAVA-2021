package ClaseOptional;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

public class EjemploOptional {
    
    public static void main(String[] args) {

        Empleado2 homero = new Empleado2(1L, "Homero Simpson", Optional.of(LocalDate.of(2003,5,20)), new BigInteger("5000"));
    
        System.out.println("Homer nacio en el año: "
             + homero.getFechaNacimiento().map(fecha -> fecha.getYear()).orElse(0));
        
    }


}

