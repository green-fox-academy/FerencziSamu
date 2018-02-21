import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise07FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
            int width = 10;
            int height = 10;
            int x = 10;
            int y = 10;

        for (int i = 0; i < 4; i++) {
            graphics.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255)));
            RectDrawing(x,y,width,height,graphics);
            width = width+21;
            height = height+21;
            x = x +10;
            y = y + 10;

        }

    }
        public static void RectDrawing ( int x, int y, int width, int height, Graphics graph){
            graph.drawRect(x,y,width,height);

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