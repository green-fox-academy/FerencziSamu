import java.util.Scanner;

public class Excercise18 {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer!");
        int number = sc.nextInt();


        if (number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");

        }









    }
}
