import java.util.*;

public class Excercise08AppendLetter {
    public static void main(String... args) {
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static String appendA(List<String> animals ) {
        //for (int i = 0; i < animals.size(); i++) {
        //    for (int j = 0; j < animals.set(0); j++) {
        //            }
        //        }

        String output = "\"";
        for (String animal : animals) {
            output = output + animal + "a\", \"";

        }
        return output.substring(0,output.length()-3);
    }
}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"