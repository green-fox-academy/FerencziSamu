public class Excercise04TodoPrint {
    public static void main(String... args){
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk\n";
        String download = " - Download games";
        String diablo = " \n \t - Diablo";
        String myTodo = (("My todo:\n"+todoText)+download)+diablo;
        
        System.out.println(myTodo);
    }
}
