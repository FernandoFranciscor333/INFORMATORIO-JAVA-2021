import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamsEjemplo2{
    public static void main(String[] args){
        Collection<String> vocales = Arrays.asList("a", "e", "i", "o", "u");
        Stream<String> streamVacio = Stream.empty();
        System.out.println(streamVacio);
    }
}