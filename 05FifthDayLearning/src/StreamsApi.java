import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamsApi {

    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three","four");
        var map = strings
                .stream()
                .collect(groupingBy(String::length, counting()));
                // .collect(groupingBy(String::length, counting()));
        map.forEach((key, value) -> System.out.println(key + " :: " + value));
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        long ans = strings
                .stream()
                .collect(Collectors.counting());

        // displaying the required count
        System.out.println(ans);
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        String[] myArray = { "this", "is", "a", "sentence" };
        String result = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + " " + b);
        System.out.println(result);
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Stream<Integer> intStream = Stream.of(1, 2, 3);
        List<Integer> ints = intStream.collect(Collectors.toList());

        System.out.println("ints = " + ints);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        String sentence = "For there is good news yet to hear and fine things to be seen";

        Pattern pattern = Pattern.compile(" ");
        Stream<String> stream = pattern.splitAsStream(sentence);
        List<String> words = stream.collect(Collectors.toList());

        System.out.println("words = " + words);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Stream<Integer> intsExam = Stream.of(2, 8, 1, 5, 3);
        Optional<Integer> optional = intsExam.reduce((i1, i2) -> i1 > i2 ? i1: i2);

        if (optional.isPresent()) {
            System.out.println("result = " + optional.orElseThrow());
        } else {
            System.out.println("No result could be computed");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Stream<String> stringsForEach = Stream.of("one", "two", "three", "four");
        List<String> resultForEach = new ArrayList<>();

        stringsForEach.filter(s -> s.length() == 3)
                .map(String::toUpperCase)
                .forEach(resultForEach::add);

        System.out.println("result = " + resultForEach);

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Stream<String> stringsNew = Stream.of("one", "two", "three", "four");
        List<String> resultx =
                stringsNew.filter(s -> s.length() == 3)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println(resultx);


        Collection<String> stringsPredecate =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        boolean noBlank  =
                stringsPredecate.stream()
                        .allMatch(Predicate.not(String::isBlank));
        boolean oneGT3   =
                stringsPredecate.stream()
                        .anyMatch(s -> s.length() == 3);
        boolean allLT10  =
                stringsPredecate.stream()
                        .noneMatch(s -> s.length() > 10);

        System.out.println("noBlank = " + noBlank);
        System.out.println("oneGT3  = " + oneGT3);
        System.out.println("allLT10 = " + allLT10);
    }

}
