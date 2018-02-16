import java.util.Scanner;

public class Excercise21 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int girls = sc.nextInt();
        System.out.println("Please enter a number!");
        int boys = sc.nextInt();
        // System.out.println(girls + " " + boys);

        if (girls == boys && girls + boys > 20){
            System.out.println("The party is excellent!");
        }
        else if (girls + boys > 20 && girls != boys){
            System.out.println("Quite cool party!");
        }
        else if (girls + boys < 20){
            System.out.println("Average party...");
        }
        else if (girls == 0){
            System.out.println("Sausage party");
        }

    }
}
