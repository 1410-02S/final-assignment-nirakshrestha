

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class World extends JFrame {

    static int creatureCount=0;
    static int foodCount=0;
    static ArrayList<Creature> creatureList=new ArrayList<>();
    static ArrayList<Food> foodList=new ArrayList<>();
    static PaintObjects po=new PaintObjects();;
    static final int maxHeight=400;
    static final int maxWidth=400;
    private JPanel panel;

    //JFrame to create a GUI
    World(){
        super("World GUI (Press 'e' to exit.)");
        panel=new JPanel();
        panel.setSize (maxWidth,maxHeight);
        panel.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);

        this.setSize(maxWidth,maxHeight);

        this.setVisible(true);
        po.setPreferredSize(new Dimension(400,400));

        panel.add(po);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int id = e.getID();
                String keyString;
                char keyChar = e.getKeyChar();
                //System.out.println("keyChar pressed "+keyChar);
                if(keyChar=='e'){
                    System.exit(0);
                }

            }
        });


    }

    
    //        in this project to get a random creatures.
    public void createCreature(){
        ReadnameFile rnf=new ReadnameFile();

        Creature c1;
        String st=rnf.readFile().trim();
        if(!st.isBlank() && !st.isEmpty()){

            c1=new Creature(st);
        }else{
            c1=new Creature("Name"+(creatureCount++));
        }

        creatureList.add(c1);



        po.repaint();
        this.revalidate();



    }

    public void spawnFood(){
        //Random position generate
        Food f1=new Food("Name"+(foodCount++));
        foodList.add(f1);

        po.repaint();


        this.revalidate();


        // and spawn food


    }

    public void repaintAndRevalidate(){

        po.repaint();


        this.revalidate();

    }


}
