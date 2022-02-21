import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByCollection {
    public static void main(String[] args) {
        Collection<String> strings =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve");
        Map<Integer, List<String>> map =
                 strings
                         .stream()
                         .collect(Collectors.groupingBy(String::length));

        map.forEach((key, value) -> System.out.println(key + " :: " + value));

    }
}
