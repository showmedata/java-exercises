package org.launchcode.java.studios;

import java.util.HashMap;
import java.lang.Character;
import java.util.Map;

/**
 * Created by 007 on 3/2/2017.
 */
public class charCounter {
    public static void main (String [] args){
        String chars = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> count = new HashMap<>();
        char[] charactersInString = chars.toCharArray();


        for (char singleChar : charactersInString){
            if (count.containsKey(singleChar)){
                int val = count.get(singleChar);
                val += 1;
                count.put(singleChar,val);
            }
            else{
                count.put(singleChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> counter : count.entrySet()) {
            System.out.println(counter.getKey() + " (" + counter.getValue() + ")");
        }

    }

}
