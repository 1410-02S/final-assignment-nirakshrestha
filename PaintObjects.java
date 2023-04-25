import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class PaintObjects extends JPanel {

    PaintObjects(){

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        for(Creature c:World.creatureList ) {

            g.setColor(c.getColor());
            g.drawPolygon(c.getxPoints(), c.getyPoints(), c.getnPoints());

        }

        for(Food f:World.foodList){


            g.setColor(f.getColor());
            g.drawRect(f.getPositionX()-f.getSize(),f.getPositionY()-f.getSize(),f.getSize(),f.getSize());


        }


    }



}
