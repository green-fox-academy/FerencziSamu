import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {
  Map map = new Map();
  Hero hero = new Hero();

  public Board() {
    map.fillMap();
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    map.drawMap(graphics);
    hero.draw(graphics,hero.getSkin());
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
      hero.goUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.goDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.turnLeft(map);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.turnRight();
    }
    repaint();
  }
}