
public class Excercise05Reverse {
    public static void main(String... args) {

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        reverse();
    }

    public static void reverse() {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


        for (int i = reversed.length() - 1; i >= 0; i--) {

            System.out.print(reversed.charAt(i));


        }
    }
}

