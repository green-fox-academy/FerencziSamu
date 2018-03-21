public class Tiles extends PositionedImage {
  private boolean isFloor;
  private boolean isOccupied;
  private String fileName;

  public Tiles(boolean isFloor) {
    this.isFloor = isFloor;
    checkTile();
  }

  public boolean isOccupied() {
    return isOccupied;
  }

  public void setOccupied(boolean occupied) {
    isOccupied = occupied;
  }

  public boolean isFloor() {
    return isFloor;
  }

  public String getFileName() {
    return fileName;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  private void checkTile() {
    if (isFloor) {
      fileName = "img/floor.png";
    } else {
      fileName = "img/wall.png";
    }
  }

}