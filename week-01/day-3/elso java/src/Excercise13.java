public class Excercise13 {
    public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

        int secondsDay = (24*60*60);
        int spentSeconds = (((currentHours * 60 * 60)+ currentMinutes * 60)+ currentSeconds);

        // System.out.println(secondsDay);
        // System.out.println(spentSeconds);


        int remainingSeconds = (secondsDay - spentSeconds);

        if (currentHours == 14 && currentMinutes == 34 && currentSeconds == 42)
            System.out.println(remainingSeconds);
}
}
