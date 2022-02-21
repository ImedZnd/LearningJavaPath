import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
//        final var coldStream =
//                IntStream
//                        .rangeClosed(1, 5)
//                        .boxed()
//                        .map(it->it*100)
//                        .flatMap(it ->
//                                IntStream
//                                        .rangeClosed(it+1, it + 2)
//                                        .boxed()
//                        )
//                        .peek(it -> System.out.println("the current element is = " + it))
////                .forEach(System.out::println)
//                ;
//
//        coldStream
//                .forEach(System.out::println);

        final var op1=
        Optional
                .of(5)
                .map(it -> Optional.of(it * 2))
//                .ifPresent(System.out::println)
                ;


    }
}
