import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {
  int posX, posY;

  public void draw(Graphics graphics,String filename) {
    try {
      BufferedImage image = ImageIO.read(new File(filename));
      if (image != null) {
        graphics.drawImage(image, posX, posY, null);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }
}
