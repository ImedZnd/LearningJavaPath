public class TrySwitch {
    public static void main(String[] args) {
        final var age = 10;
        System.out.println(
                messageForAge(age)
        );
    }

    private static String messageForAge(final int age) {
        return switch (age) {
            case 0, 1 -> "baby";
            case 2, 3, 4, 5 -> "toddler";
            case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 -> "teen";
            default -> "adult";
        };
    }
}
