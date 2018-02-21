import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Excercise01LineInTheMiddle {

    public static void mainDraw(Graphics graphics) {
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
        graphics.setColor((Color.green));
        graphics.drawLine(155, 0, 155, 343);
        graphics.setColor((Color.red));
        graphics.drawLine(0, 150, 320, 150);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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