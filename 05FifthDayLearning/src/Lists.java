import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("0", "1", "2", "3", "4");
        System.out.println(strings);
        int fromIndex = 1, toIndex = 4;
        Collections.rotate(strings.subList(fromIndex, toIndex), -1);
        System.out.println(strings);

        List<String> sencodStrings = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4"));
        List<String> immutableStrings = Collections.unmodifiableList(sencodStrings);
        sencodStrings.add("5");
        System.out.println(immutableStrings);
        sencodStrings.add("5");
        System.out.println(immutableStrings);
    }
}
