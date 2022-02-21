public class mainTestGenerics {
    public static void main(String[] args) {
        TestGenerics.Pair<String, Integer> p1 = new TestGenerics.OrderedPair<String, Integer>("Even", 8);
        TestGenerics.Pair<String, String> p2 = new TestGenerics.OrderedPair<String, String>("hello", "world");
    }
}
