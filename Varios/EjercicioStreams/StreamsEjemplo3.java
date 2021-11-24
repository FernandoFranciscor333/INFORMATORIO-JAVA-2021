import java.util.stream.Stream;

public class StreamsEjemplo3{
    public static void main(String[] args){
        Stream<Integer> numeros = Stream.iterate(40, n -> n +2).limit(20);
        Stream<String> streamVacio = Stream.empty();
        System.out.println(streamVacio);
    }
}