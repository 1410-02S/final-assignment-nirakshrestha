import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class ReadnameFile {
    static ArrayList<String> alstr=new ArrayList<>();;

    public String readFile(){
        try {

            String file = "names.txt";

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine;
            ArrayList<String> alstr=new ArrayList<>();
            ArrayList<String> alRandstr=new ArrayList<>();
            for(Creature c:World.creatureList){
                alstr.add(c.getName());
            }

            while((currentLine = reader.readLine()) != null) {


                    String str = currentLine.trim();
                    if (!alstr.contains(str) && str!="" && str!="\n") {
                        alRandstr.add(str);
                    }


            }
            reader.close();
            Random rand = new Random();
            int m = rand.nextInt(alRandstr.size());

            String str=alRandstr.get(m);
            return str;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
