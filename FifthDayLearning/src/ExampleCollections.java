import java.util.*;

public class ExampleCollections {

    static class Person {

        String name;
        int age;

        Person(String n, int a) {
            name = n;
            age = a;
        }

        public String getName(){
            return this.name;
        }

        @Override
        public String toString() {
            return String.format("{name=%s, age=%d}", name, age);
        }
    }

    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        System.out.println("strings = " + strings);
        strings.remove("one");
        System.out.println("strings = " + strings);
        strings.add("one");
        if (strings.contains("one")) {
            System.out.println("one is here");
        }
        if (!strings.contains("three")) {
            System.out.println("three is not here");
        }

        strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Collection<String> first = new ArrayList<>();
        first.add("one");
        first.add("two");

        Collection<String> second = new ArrayList<>();
        second.add("one");
        second.add("four");

        System.out.println("Is first contained in strings? " + strings.containsAll(first));
        System.out.println("Is second contained in strings? " + strings.containsAll(second));
        for (String element: strings) {
            System.out.println(element);
        }

        Collection<String> iterateStrings = List.of("one", "two", "three", "four");
        for (Iterator<String> iterator = iterateStrings.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Joe", 24),
                new Person("Pete", 18),
                new Person("Chris", 21)
        );
        people.sort((a, b) -> a.name.compareToIgnoreCase(b.name));
        System.out.println(people);
        people.sort((a, b) -> Integer.compare(a.age, b.age)); //(a, b) -> a.age < b.age ? -1 : a.age == b.age ? 0 : 1
        System.out.println(people);
    }
}
