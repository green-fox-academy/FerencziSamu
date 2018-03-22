import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {
  Map map = new Map();

  public Board() {
    map.fillMap();
    map.toSpawn();
    setPreferredSize(new Dimension(1020, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    map.drawMap(graphics);
    for (int i = 0; i < map.characters.size(); i++) {
      map.characters.get(i).draw(graphics,map.characters.get(i).getSkin());
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    ((Hero) map.characters.get(0)).move(e,map);
    if (((Hero) map.characters.get(0)).getMoveCounter() == 2) {
      ((Boss) map.characters.get(1)).move(map);
      for (int i = 2; i < map.characters.size(); i++) {
        ((Skeleton) map.characters.get(i)).move(map);
      }
      ((Hero) map.characters.get(0)).setMoveCounter(0);
    }
    repaint();
  }
}