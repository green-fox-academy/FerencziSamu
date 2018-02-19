import java.util.Arrays;

public class Excercise13Matrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    //      Integer [][] array = {{0},{1}};
    //      System.out.println(Arrays.toString(array));
    //      int[][] multidimensional = {{0},{1}};
    //      int[][] multiDimensional = new int[5][5];
    //      System.out.println(Arrays.toString(multiDimensional));
     //     int[][] myArray = { {1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1} };
    public static void main(String[] args){

        for (int i = 0; i < 4; i++) {     //fuggoleges
            for (int j = 0; j < 4; j++) { //vizszintes
                if (i == 0 && j == 0 || (i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3)) {
                    System.out.print(1);
                }
                 else {
                    System.out.print(0);
                }
            }
             System.out.println();
        }



    }
}
