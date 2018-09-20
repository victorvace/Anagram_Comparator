package controllers;

import helpers.AnagramCoparator;
import helpers.Preprocesor;
import models.AnagramModel;
import views.View;

import java.util.ArrayList;

public class AnagramController {

    private ArrayList<String> arrayListWords;

    public AnagramController() throws Exception {
        this.arrayListWords = Preprocesor.preProcessing();
    }

    public void checkAnagram() {

        View view = new View();
        String word = view.show();

        for (int i = 0; i < arrayListWords.size(); i++) {

            AnagramModel anagram = new AnagramModel(arrayListWords.get(i));

            if (AnagramCoparator.isAnagram(word, anagram.getAnagrama())) {
                System.out.println( "The word " + anagram.toString() + " is anagram of " + word + "." );
            }
        }
    }
}

//  Víctor Vanaclocha Cebrián