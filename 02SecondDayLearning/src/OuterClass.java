public class OuterClass {

    String outerField = "Outer Field";
    static String staticOuterField = "Static Outer Field";

    class InnerClass{
        void accessMembers(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(OuterClass outerClass){
            System.out.println(outerClass.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args){
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerClass = outerObject.new InnerClass();
        innerClass.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("----------------------");
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);

    }
}
