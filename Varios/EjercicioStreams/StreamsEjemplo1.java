import java.util.stream.Stream;

public class StreamsEjemplo1{
    public static void main(String[] args){
        Stream<String> streamVacio = Stream.empty();
        System.out.println(streamVacio);
    }
}