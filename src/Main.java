//  Fuentes
// http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
// https://es.stackoverflow.com/questions/41519/identificar-una-anagrama

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Anagram {

    private String anagram;

    public Anagram(String anagram) {
        this.anagram = anagram;
    }

    public String getAnagrama() {
        return anagram;
    }

    public void setAnagrama(String anagram) {
        this.anagram = anagram;
    }

    public boolean isAnagram(String word) {

        char[] array1 = word.toCharArray();
        char[] array2 = this.anagram.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return new String(array1).equals(new String(array2));
    }

    @Override
    public String toString() {
        return this.anagram;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a word to find it in the dictionary.");
        String word = sc.nextLine();
        sc.close();

        ArrayList<String> arrayListWords = Methods.preProcessing();

        for (int i = 0; i < arrayListWords.size(); i++) {

            Anagram anagram = new Anagram(arrayListWords.get(i));

            if ((anagram.isAnagram(word))) {
                System.out.println( "The word " + anagram.toString() + " is anagram of " + word + "." );
            }
        }
    }
}

//  Víctor Vanaclocha Cebrián