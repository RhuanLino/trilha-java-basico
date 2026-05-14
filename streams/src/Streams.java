import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 5, 7, 3, 10);

        Stream<Integer> streamNumeros = numeros.stream()
                .map(x -> x * 10);
        System.out.println(Arrays.toString(streamNumeros.toArray()));

        Stream<Integer> streamFibonacci = Stream.iterate(new Integer[] { 0, 1 },
                (a) -> new Integer[] { a[1], a[0] + a[1] })
                .limit(10)
                .map(a -> a[0]);

        System.out.println(Arrays.toString(streamFibonacci.toArray()));
    }
}
