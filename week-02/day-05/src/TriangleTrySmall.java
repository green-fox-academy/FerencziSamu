import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleTrySmall {
  static int WIDTH = 800;
  static int HEIGHT = 800;
  static int xpoints[] = {20 + (WIDTH / 2), (WIDTH / 2), 10 + (WIDTH / 2)};
  static int ypoints[] = {19, 19, 1};
  static int npoints = 3;

  public static void mainDraw(Graphics graphics) {
    for (int sor = 0; sor < 20; sor++) {
      Modifier(ypoints,xpoints);

      graphics.drawPolygon(xpoints, ypoints, npoints);
      for (int oszlop = 0; oszlop < sor + 1; oszlop++) {
        int[] kiindulo = oszloptolas(xpoints, oszlop);
        graphics.drawPolygon(kiindulo, ypoints, npoints);
      }
    }
  }

  private static int[] oszloptolas(int[] xpoints, int oszlop) {
    int[] kiindulo = Arrays.copyOf(xpoints, xpoints.length);
    for (int i = 0; i < xpoints.length; i++) {
      kiindulo[i] = (kiindulo[i] + (20 * oszlop));
    }
    return kiindulo;
  }

  private static void Modifier(int[] ypoints, int [] xpoints) {
    for (int i = 0; i < ypoints.length; i++) {
      ypoints[i] = ypoints[i] + 17;
      xpoints[i] = xpoints[i] - 10;
    }

  }




  // Don't touch the code below


  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}