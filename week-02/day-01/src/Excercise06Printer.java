public class Excercise06Printer {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printer`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printer("first")
    // printer("first", "second")
    // printer("first", "second", "third", "fourth")
    // ...

    public static void main(String[] args) {
        String[] myList = {"first","second","third","fourth","fifth"};

        // Print the second element of the array
        System.out.println();

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
    }


}
