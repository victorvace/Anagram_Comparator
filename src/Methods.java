import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Methods {

    public static ArrayList<String> preProcessing() {

        ArrayList<String> preLoadFile = new ArrayList<>();
        FileReader fr = null;
        try {

            File route = new File("wordlist.txt").getCanonicalFile();
            fr = new FileReader(route);

            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                preLoadFile.add(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("The file doesn't exist");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO error");
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return preLoadFile;
    }

}

//  Víctor Vanaclocha Cebrián
