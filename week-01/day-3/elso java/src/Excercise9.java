public class Excercise9 {
    public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;

    // Print the Body mass index (BMI) based on these values

        double squareHeightInM = (heightInM * heightInM);
        double Bmi = (massInKg / squareHeightInM);
        System.out.println(Bmi);
}
}
