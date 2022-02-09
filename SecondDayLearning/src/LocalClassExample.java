public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(
            String phoneNumber1, String phoneNumber2, String phoneNumber3) {

        int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 +
                    " and " + phoneNumber2 +  " and " + phoneNumber3);
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        PhoneNumber myNumber3 = new PhoneNumber(phoneNumber3);


        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            myNumber1.printOriginalNumbers();
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            myNumber2.printOriginalNumbers();
        if (myNumber3.getNumber() == null)
            System.out.println("Third number is invalid");
        else
            myNumber3.printOriginalNumbers();
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890", "4567890");
    }
}
