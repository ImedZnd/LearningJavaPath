public class MultiDimArrayDemo {
    public static void main(String[] args){
        String[][] names = {
                {"Dr." , "Mr.", "Ms.", "Mrs"},
                {"Imed", "Farah", "Salah"}
        };
        // Dr. Imed
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Farah
        System.out.println(names[0][2] + names[1][1]);
        System.out.println(names.length);//number of line
        System.out.println(names[0].length);//line 1 length
        System.out.println(names[1].length);//line 2 length

    }
}
