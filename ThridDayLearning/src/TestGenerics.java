import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestGenerics {

    public interface Pair<K, V> {
        public K getKey();

        public V getValue();
    }

    public static class OrderedPair<K, V> implements Pair<K, V> {

        private K key;
        private V value;

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        public OrderedPair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    record Tuple<E1, E2>(E1 element1, E2 element2) {
        public <E3> Tuple<E3, E2> mapElement1(Function<E1, E3> mapper) {
            return new Tuple<>(
                    mapper
                            .apply(
                                    element1
                            ),
                    element2
            );
        }

        public <E3> Tuple<E1, E3> mapElement2(Function<E2, E3> mapper) {
            return new Tuple<>(
                    element1,
                    mapper
                            .apply(
                                    element2
                            )
            );
        }
    }

    public static void main(String[] args) {
        final var t1 =
                new Tuple<>("imed", 25)
                        .mapElement1(String::length)//e -> e.length()
                        .mapElement1(e -> e * 10)
                        //.mapElement1(e -> e.toString().concat(" this is a string"))
                        .mapElement2(e -> e * 10);
        final var t2 =
                new Tuple<>(true, "abc");
        final var t3 =
                new Tuple<>(220, 25.5);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);


        final var l1 =
                Stream.of(
                        "true",
                        "1",
                        "2",
                        "3"
                )
                        .map(String::length)//e->e.length()
                        .map(Object::toString)//e->e.toString()
                        .toList();
        System.out.println("l1 = " + l1);
    }
}
