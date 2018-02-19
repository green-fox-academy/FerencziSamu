public class Excercise04Sum {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main (String[] args) {
        int input = 10;
        sum(input);
        System.out.println(sum(input));

    }
    public static int sum(int numbers) {
        int summa = 0;
        for (int i = 0; i <= numbers; i++) {
            summa = summa + i;
        }
        return summa;
    }

}
