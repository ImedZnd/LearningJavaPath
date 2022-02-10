public class TestGenerics {

    public interface Pair<K, V>{
        public K getKey();
        public V getValue();
    }

    public static class OrderedPair<K, V> implements Pair<K, V>{

        private K key;
        private V value;

        @Override
        public K getKey() {return key;}

        @Override
        public V getValue() {return value;}

        public OrderedPair(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
