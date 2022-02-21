public class PassPrimitiveByValue {

    public static void main(String[] args) {

        int x = 3;

        // invoke passMethod() with
        // x as argument
        var h = passMethod(x);

        // print x to see if its
        // value has changed
        System.out.println("After invoking passMethod, x = " + x+"h = " + h);
        // After invoking passMethod, x = 3h = 10
    }

    // change parameter in passMethod()
    public static int  passMethod(int x) {
        x = 10;
        return 10;
    }
}