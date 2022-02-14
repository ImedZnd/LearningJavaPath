import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsExample {
    public static void main(String[] args) {
        Set<Integer> evenNumbers =
                IntStream.range(0, 10)
                        .map(number -> number / 2)
                        .boxed()
                        .collect(Collectors.toSet());
        System.out.println("evenNumbers = " + evenNumbers);
    }
}
