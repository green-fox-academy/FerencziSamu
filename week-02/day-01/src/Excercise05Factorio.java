public class Excercise05Factorio {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial
    public static void main(String[] args){
        int alap = 10;
        factorio(alap);
        System.out.println(factorio(alap));
    }
    public static int factorio(int alap){
        int summa = 1;
        for (int i = 1; i < alap+1; i++) {
            summa *= i ;
        }
        return summa;
    }

}
