import java.util.Scanner;

public class Excercise25 {
    public static void main(String[] args){
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter a number!");
        //int number = sc.nextInt();

        //System.out.println("1 * "+ number +" = "+ number * 1);

        int number, multi;
        System.out.println("Enter a number!");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        for ( multi = 1 ; multi <= 10 ; multi++ )
            System.out.println(multi + " * " + number +" = " + (number*multi));
    }
}
