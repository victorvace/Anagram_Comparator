package helpers;

import java.util.Arrays;

public class AnagramCoparator {
    public static boolean isAnagram(String word, String anagram) {

        char[] array1 = word.toCharArray();
        char[] array2 = anagram.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return new String(array1).equals(new String(array2));
    }
}

//  Víctor Vanaclocha Cebrián