import java.util.*;

import static java.util.Map.entry;

public class map {
    Map<Integer, String> map =
            Map.of(
                    1, "one",
                    2, "two",
                    3, "three"
            );

    Map.Entry<Integer, String> e1 = entry(1, "one");
    Map.Entry<Integer, String> e2 = entry(2, "two");
    Map.Entry<Integer, String> e3 = entry(3, "three");

    Map<Integer, String> map2 = Map.ofEntries(e1, e2, e3);

    Map<Integer, String> map3 =
            Map.ofEntries(
                    entry(1, "one"),
                    entry(2, "two"),
                    entry(3, "three")
            );



    public static void main(String[] args) {
        Map<String, Integer> map4 = new HashMap<>();

        map4.put("one", 1);
        map4.put("three", 3);
        map4.put("five", 5);

        for (int value : map4.values()) {
            System.out.println("value = " + value);
        }


        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");

        Set<Integer> keys = map.keySet();
        System.out.println("keys = " + keys);

        Collection<String> values = map.values();
        System.out.println("values = " + values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entries = " + entries);

        keys.remove(3);
        entries.forEach(System.out::println);

        Map<Integer, String> map6 =
                Map.ofEntries(
                        Map.entry(1, "one"),
                        Map.entry(2, "two"),
                        Map.entry(3, "three"),
                        Map.entry(4, "three")
                );
        map6 = new HashMap<>(map6);
        map6.values().remove("three");
        System.out.println("map = " + map6);

        Map<Integer, String> map7 = new HashMap<>();
        map7.put(1, "one");
        map7.put(2, "two");
        map7.put(3, "three");

        map7.forEach((key, value) -> System.out.println(key + " :: " + value));

        Map<Integer, String> map8 = new HashMap<>();

        map8.put(1, "one");
        map8.put(2, "two");
        map8.put(3, "three");

        map8.replaceAll((key, value) -> value.toUpperCase());
        map8.forEach((key, value) -> System.out.println(key + " :: " + value));

        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven");
        Map<Integer, List<String>> map9 = new HashMap<>();
        for (String word: strings) {
            int length = word.length();
            map9.putIfAbsent(length, new ArrayList<>());
            map9.get(length).add(word);
        }

        map9.forEach((key, value) -> System.out.println(key + " :: " + value));


        List<String> strings3 = List.of("one", "two", "three", "four", "five", "six", "seven");
        Map<Integer, String> map10 = new HashMap<>();
        for (String word: strings3) {
            int length = word.length();
            map10.merge(length, word,
                    (existingValue, newWord) -> existingValue + ", " + newWord);
        }

        map10.forEach((key, value) -> System.out.println(key + " :: " + value));
    }
}
