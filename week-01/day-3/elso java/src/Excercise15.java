import java.util.Scanner;

public class Excercise15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        /*
        System.out.println("Please provide a distance in kilometer with number(s)!");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        // As 1 km is 0.6214 mile.
        double convNum = 0.6214;
        System.out.println(userInput * convNum + "mile(s)");
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please type a distance in kilometers as an integer!");
        int kilometers = sc.nextInt();
        double aMile = 0.621371192;
        double miles;

        miles = kilometers * aMile;
        System.out.println("The distance is " + miles + " miles.");









    }
}
