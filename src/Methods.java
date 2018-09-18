import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Methods {

    public static boolean isAnagram(String string1, String string2) {

        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return new String(array1).equals(new String(array2));
    }

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
