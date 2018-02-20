public class Excercise03Takeslonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the String (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        //String[] parts = quote.split("It");
        //String part1 = parts[0];
        //String part2 = parts[1];

        String quoteAdd = "It always takes longer than";
        String newQuote = quote.replace("It", quoteAdd);
        System.out.println(newQuote);

    }
}