import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws InterruptedException {
        World w=new World();


        double B=0.142;//Birth chance
        double D=0.055;//Death chance
        double N=B/D;//Equilibrium

        double fB=0.142;//Food Production
        //double fD=0.055;//Food Consumption
        //double fN=fB/fD;//Equilibrium

        //create 40 creatures initially
        System.out.println("Initial human creation...");
        for(int i=0;i<40;i++){
            w.createCreature();
            Thread.sleep(500);
        }

        //create 10 food stations initially
        System.out.println("Initial food creation...");
        for(int i=0;i<10;i++){
            w.spawnFood();
            Thread.sleep(500);
        }

        //simulate birth and death
        while(true){


            int birthNumbers= (int) (World.creatureList.size()*B);
            int deathNumbers= (int) (World.creatureList.size()*D);
            System.out.println("Reproducing humans..."+birthNumbers);
            for(int i=0;i<birthNumbers;i++){
                Random rand = new Random();
                    int m = rand.nextInt(World.creatureList.size());

                    //random creature replicated
                    World.creatureList.get(m).reproduce();
                    w.repaintAndRevalidate();
                Thread.sleep(500);
            }
            System.out.println("Humans Dying..."+deathNumbers);
            for(int i=0;i<deathNumbers;i++){
                World.creatureList.get(0).die();
                Thread.sleep(500);
            }

            int fProdNumbers= (int) (World.foodList.size()*fB);

            System.out.println("Food production..."+fProdNumbers);
            for(int i=0;i<fProdNumbers;i++){
                Random rand = new Random();
                int m = rand.nextInt(World.creatureList.size());

                //random food stations replicated
                w.spawnFood();

                Thread.sleep(500);
            }

        }




    }
}
