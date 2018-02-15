public class Excercise6 {public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    int weekDays = 7 ;
    int workingDays = 5 ;


        float workingHours = ((weekDays - workingDays)* 17* 6);
        System.out.println(workingHours);
        float averageCodingHours= (workingDays * 6);
        System.out.println((averageCodingHours / workingHours ) *100 );



}
}
