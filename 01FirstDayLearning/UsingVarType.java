import java.nio.file.Path;
import java.util.List;

public class UsingVarType {

    //we cannot use var in the global scope
    //    var message1 = "Hello world!";
    //    var path1 = Path.of("debug.log");

    public static void main(String[] args){
        // we can only use var in a local scope
        var list = List.of("one", "two", "three", "four");
        for (var element: list) {
            System.out.println(element);

        }
        int x = -1;
        System.out.println(x);
        x = -x;
        System.out.println(x);
    }
}
