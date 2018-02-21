import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Excercise08PositionSquare {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.



        for (int i = 0; i < 3; i++) {
            int xTopLeft = (int)(Math.random()*255);
            int yTopLeft = (int)(Math.random()*255);
            int WIDTH = 50;
            int HEIGHT = 50;
            squareDrawing(xTopLeft,yTopLeft,WIDTH,HEIGHT,graphics);

        }


    }

    public static void squareDrawing(int xTopLeft,int yTopLeft, int Width, int HEIGHT, Graphics graphics){
        graphics.drawRect(xTopLeft,yTopLeft,Width,HEIGHT);

        }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}