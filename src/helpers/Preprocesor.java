package helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


public class Preprocesor {

    public static ArrayList<String> preProcessing() throws Exception {

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
