import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {
  Map map = new Map();
  Hero hero = new Hero();
  Boss boss = new Boss();
  Skeleton skeleton1 = new Skeleton();
  Skeleton skeleton2 = new Skeleton();
  Skeleton skeleton3 = new Skeleton();

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
    boss.draw(graphics,boss.getSkin());
    skeleton1.draw(graphics,skeleton1.getSkin());
    skeleton2.draw(graphics,skeleton2.getSkin());
    skeleton3.draw(graphics,skeleton3.getSkin());
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
      hero.goUp(map);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.goDown(map);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.turnLeft(map);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.turnRight(map);
    }
    repaint();
  }
}