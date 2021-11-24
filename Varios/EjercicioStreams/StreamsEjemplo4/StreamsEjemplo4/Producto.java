package StreamsEjemplo4;

import java.math.BigDecimal;

public class Producto {

    private String nombre;
    private String tipo;
    private BigDecimal precioUnitario;

    public Producto(String nombre, String tipo, BigDecimal precioUnitario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", tipo=" + tipo + "]";
    }
    
}
