public class ArrayDemo {
    public static void main(String args[]){
        //we declare the array
        int [] anArray;

        //System.out.println("Element at index 0: " + anArray[0]);
        //Variable 'anArray' might not have been initialized

        //we allocate the specific size
        anArray = new int[3];
        anArray[0] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);

        //System.out.println("Element at index 5: " + anArray[5]);
        //Index 5 out of bounds for length 3

        //we decalre and allocate the desired size
        int [] AnotherArray = new int[3];
        System.out.println("Element at index 0: " + AnotherArray[0]);//default value is 0
        AnotherArray[0] = 5;
        System.out.println("Element at index 0: " + AnotherArray[0]);
        AnotherArray[1] = 6;
        AnotherArray[2] = 7;

        int[] anArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };
    }
}
