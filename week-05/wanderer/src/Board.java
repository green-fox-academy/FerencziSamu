import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {
  Map map = new Map();

  public Board() {
    map.fillMap();
    map.toSpawn();
    setPreferredSize(new Dimension(720, 720));
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
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      ((Hero) map.characters.get(0)).goUp(map);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      ((Hero) map.characters.get(0)).goDown(map);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      ((Hero) map.characters.get(0)).turnLeft(map);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      ((Hero) map.characters.get(0)).turnRight(map);
    }
    repaint();
  }
}