import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleTrySmall {
       static int WIDTH = 800;
       static int HEIGHT = 800;
       static int xpoints[] = {20+(WIDTH/2), (WIDTH/2), 10+(WIDTH/2)};
       static int ypoints[] = {18, 18, 1};
       static int npoints = 3;

    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 10; i++) {
            xModifier(xpoints);
            yModifier(ypoints);
            graphics.drawPolygon(xpoints, ypoints, npoints);

            for (int j = 0; j < i+1; j++) {

            }
        }

    }

    private static int[] yModifier(int[] ypoints) {
        for (int i = 0; i < ypoints.length; i++) {
            ypoints[i] = ypoints[i] + 17;
        }
        return ypoints;
    }

    private static int[] xModifier(int[] xpoints) {
        for (int i = 0; i < xpoints.length; i++) {
            xpoints[i] = xpoints[i] - 10;
        }
        return xpoints;
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