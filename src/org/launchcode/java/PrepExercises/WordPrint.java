package org.launchcode.java.PrepExercises;

import java.util.ArrayList;

/**
 * Created by 007 on 3/2/2017.
 */
public class WordPrint {
    public static void main (String [] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("Frank");
        words.add("quirk");
        words.add("quick");
        words.add("slow");
        words.add("fashion");

        displayFiveCharacterWords(words);
        }

    private static void displayFiveCharacterWords(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }

        }
    }
}

