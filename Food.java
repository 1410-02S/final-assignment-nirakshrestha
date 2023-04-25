import java.awt.*;
import java.util.Random;

public class Food {
    private String foodName;
    private int positionX;
    private int positionY;
    private int size=20;
    private Color color=Color.GREEN;


    Food(String foodName){
        this.foodName=foodName;
        Random rand = new Random();
        this.positionX = rand.nextInt(World.maxWidth);
        this.positionX += 1;
        rand = new Random();
        this.positionY = rand.nextInt(World.maxHeight);
        this.positionY += 1;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
