public class ArrayCopyDemo {
    public static void main (String[] args){
        String[] toCopyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] toCopyTo = new String[7];
        System.arraycopy(toCopyFrom,2,toCopyTo,0,5);

        for (String nameCoffee : toCopyTo){
            System.out.print(nameCoffee + " ,");
        }
        //there will be two null object cause we didn't fill them (the array have size 7 and we only fill 5)
        System.out.print("\n");
        String[] antherCopyTo = java.util.Arrays.copyOfRange(toCopyFrom,2,5);
        for (String nameCoffee : antherCopyTo){
            System.out.print(nameCoffee + " ,");
        }
        System.out.print("\n");

        java.util.Arrays.stream(toCopyTo).map(coffee -> coffee + " ").forEach(System.out::print);

    }
}
