import java.util.ArrayList;
import java.util.List;

public class MainDominoes {
  public static void main(String[] args) {
    List<Dominoes> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = i; j < dominoes.size(); j++) {
        if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
          dominoes.add(i + 1, dominoes.get(j));
          dominoes.remove(j + 1);
        }
      }

    }

    System.out.println(dominoes);
  }

  static List<Dominoes> initializeDominoes() {
    List<Dominoes> dominoes = new ArrayList<>();
    dominoes.add(new Dominoes(5, 2));
    dominoes.add(new Dominoes(4, 6));
    dominoes.add(new Dominoes(1, 5));
    dominoes.add(new Dominoes(6, 7));
    dominoes.add(new Dominoes(2, 4));
    dominoes.add(new Dominoes(7, 1));
    return dominoes;
  }
}