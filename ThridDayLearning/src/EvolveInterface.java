public class EvolveInterface {
}


interface DoIt {
    void doSomething(int i, double x);
    int doSomethingElse(String s);
}

interface DoItPlus extends DoIt {

    boolean didItWork(int i, double x, String s);

}