package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<>();
        String phrase = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charArray = phrase.toLowerCase(Locale.ROOT).toCharArray();

        for(char character : charArray) {
            if (count.containsKey(character)) {
                count.put(character, count.get(character) + 1);
            } else {
                count.put(character, 1);
            }
        }
        System.out.println(count);

        for (Map.Entry<Character, Integer> eachChar : count.entrySet()){
            System.out.println(eachChar.getKey() +":"+ eachChar.getValue());

        }
    }
}
