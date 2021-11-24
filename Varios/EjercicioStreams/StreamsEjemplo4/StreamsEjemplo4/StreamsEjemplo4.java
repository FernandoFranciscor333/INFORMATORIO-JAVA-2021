package StreamsEjemplo4;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsEjemplo4 {

    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("200000.00");

    public static void main(String[] args){
        List<Producto> catalogoProductos = List.of(
            new Producto("iPhone 13 Pro", "Celulares", new BigDecimal("400000.00")),
            new Producto("Samsung Galaxy S21 Ultra", "Celulares", new BigDecimal("200000.00")),
            new Producto("Motorola Edge Special Edition", "Celulares", new BigDecimal("159813.00"))            
        );

        List<String> productosBaratos = catalogoProductos.stream()
            .filter(prodcto -> PRECIO_BUSQUEDA.compareTo(prodcto.getPrecioUnitario())>0)
            .map(producto -> producto.getNombre())
            .collect(Collectors.toList());
        System.out.println(productosBaratos);
        
        /*Producto productoBarato = catalogoProductos.stream()
            .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getPrecioUnitario())>0)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No se encontro producto menor a "+ PRECIO_BUSQUEDA));
            System.out.println("El primer producto que se encontro menor a "+PRECIO_BUSQUEDA + " es " + productoBarato);
        */
        /*if(productoBarato.isPresent()){
            System.out.println("El primer producto que se encontro menor a "+PRECIO_BUSQUEDA + " es " + productoBarato.get());
        } else {
            System.out.println("No se encontro producto menor a "+ PRECIO_BUSQUEDA);
        }*/

    }
    
}
