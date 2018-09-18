//  Fuentes
// http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
// https://es.stackoverflow.com/questions/41519/identificar-una-anagrama

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a word to find it in the dictionary.");
        String word = sc.nextLine();
        sc.close();

        ArrayList<String> arrayListWords = Methods.preProcessing();

        for (int i = 0; i < arrayListWords.size(); i++) {

            if ((Methods.isAnagram(word, arrayListWords.get(i)))) {
                System.out.println("The word " + arrayListWords.get(i) + " is anagram of " + word + ".");
            }
        }
    }
}

//  Víctor Vanaclocha Cebrián