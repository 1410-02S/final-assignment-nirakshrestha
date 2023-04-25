


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Creature  {

    private String name;
    private String prevName;
    private int size=40;
    private Integer positionX=null;
    private Integer positionY=null;
    private int[] xPoints;
    private int[] yPoints;
    private int nPoints;

    private Color color=Color.RED;
    Creature(){

    }

    Creature(String name){
        this.name=name;
        //repaint();
        Random rand = new Random();
        int x = rand.nextInt(World.maxWidth);
        x += 1;
        rand = new Random();
        int y = rand.nextInt(World.maxHeight);
        y += 1;
        int newX = x;
        int newY = y;


        int halfSize = getSize() / 2;
        this.xPoints = new int[]{newX - halfSize, newX, newX + halfSize};
        this.yPoints = new int[]{newY - halfSize, newY + halfSize, newY - halfSize};
        this.nPoints = 3;
    }

    public void die(){
        
        World.creatureList.remove(0);
        this.prevName=new String(name);
        this.name=null;


    }

    public void reproduce(){
        String n=this.name+"Child";
        Creature c=new Creature(n);
        World.creatureList.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrevName() {
        return prevName;
    }

    public void setPrevName(String prevName) {
        this.prevName = prevName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public void setxPoints(int[] xPoints) {
        this.xPoints = xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public void setyPoints(int[] yPoints) {
        this.yPoints = yPoints;
    }

    public int getnPoints() {
        return nPoints;
    }

    public void setnPoints(int nPoints) {
        this.nPoints = nPoints;
    }
}


