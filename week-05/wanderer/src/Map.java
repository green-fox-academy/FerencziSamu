import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Map {
  public static int SIZE = 72;
  ArrayList<Character> characters = new ArrayList<>();

  private int[][] levelDesign = {
      {0, 1, 0, 0, 1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0, 1, 0, 0, 0},
      {0, 1, 0, 1, 0, 1, 1, 0, 1, 1},
      {0, 1, 1, 1, 0, 1, 0, 0, 0, 0},
      {0, 0, 0, 1, 0, 1, 1, 0, 1, 1},
      {1, 1, 0, 1, 0, 0, 1, 0, 1, 0},
      {1, 1, 0, 1, 1, 0, 1, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
      {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
  };
  private List<List<Tiles>> map = new ArrayList<>();

  public List<List<Tiles>> getMap() {
    return map;
  }

  public void fillMap() {
    for (int i = 0; i < 10; i++) {
      map.add(new ArrayList<>());
      for (int j = 0; j < 10; j++) {
        if (levelDesign[i][j] == 0) {
          map.get(i).add(new Tiles(true));
          map.get(i).get(j).setPosX(j * SIZE);
          map.get(i).get(j).setPosY(i * SIZE);
        } else {
          map.get(i).add(new Tiles(false));
          map.get(i).get(j).setPosX(j * SIZE);
          map.get(i).get(j).setPosY(i * SIZE);
        }
      }
    }
  }

  public void drawMap(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        Tiles tile = map.get(i).get(j);
        tile.draw(graphics, tile.getFileName());
      }
    }
  }

  public int getMazeIndex(int posX, int posY) {
    return levelDesign[posY / 72][posX / 72];
  }


  public void toSpawn() {
    Random random = new Random();
    int n = random.nextInt(3) + 3;
    characters.add(new Hero());
    do {
      characters.add(new Boss());
      if (characters.size() > 2) {
        characters.remove(1);
      }
    } while (getMazeIndex(characters.get(1).posX, characters.get(1).posY) == 1);
    for (int i = 0; i < n; i++) {
      do {
        characters.add(new Skeleton());
        if (characters.size() > i + 3) {
          characters.remove(i + 2);
        }
      } while (getMazeIndex(characters.get(i + 2).posX, characters.get(i + 2).posY) == 1);
    }
  }
}