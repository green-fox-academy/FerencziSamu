import java.util.Scanner;


public class Excercise14 {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Please enter your name!");
        Scanner sc = new Scanner(System.in);
        String yourName = sc.nextLine();
        System.out.println("Hello, " + yourName +"!");


    }
}
