import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsJoining {
    public static void main(String[] args) {
        String joined =
                IntStream.range(0, 10)
                        .boxed()
                        .map(Object::toString)
                        .collect(Collectors.joining(", "));

        System.out.println("joined = " + joined);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        String joined2 =
                IntStream.range(0, 10)
                        .boxed()
                        .map(Object::toString)
                        .collect(Collectors.joining(", ", "{ ", " }"));

        System.out.println("joined = " + joined2);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Collection<String> strings =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve");

        Map<Boolean, List<String>> map =
                strings.stream()
                        .collect(Collectors.partitioningBy(s -> s.length() > 4));

        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Collection<String> strings2 =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve");

        Map<Integer, List<String>> map2 =
                strings2.stream()
                        .collect(Collectors.groupingBy(String::length));

        map2.forEach((key, value) -> System.out.println(key + " :: " + value));
    }
}
