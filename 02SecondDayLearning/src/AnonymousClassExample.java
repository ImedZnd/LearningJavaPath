public class AnonymousClassExample {
    public static void main(String[] args) {
        final var x = new X();
        x.doSth(AnonymousClassExample::dealWithX);
    }
    public static String dealWithX(int x1){
        return "message"+x1;
    }
}

class X {

    public void doSth(Y y) {
        System.out.println("y.message() = " + y.message(10));
    }


    @FunctionalInterface
    interface Y {
        String message(int x);
    }
}
