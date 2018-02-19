public class Excercise01Doubling {

    public static void main(String[] args) {
// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(ak)`

        int ak = 123;
        int af = doubling(ak);
        System.out.println(af);

    }

    public static int doubling(int number) {
        number = number * 2;
        return number;


    }
}