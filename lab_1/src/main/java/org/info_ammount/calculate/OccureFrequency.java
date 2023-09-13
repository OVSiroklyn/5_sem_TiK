package org.info_ammount.calculate;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class OccureFrequency {
    public static double charFrequency(String word, char n) { // Здійснює підрахунок частоти появи символу в тексті повідомлення
        int freq = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == n){
                freq++;
            }
        }
        return (double) freq / (double) word.length();
    }
    public static HashMap<Character, Double> allCharCounter(String word){ // Видає перелік усіх частот появи у форматі HashSet
        LinkedHashMap<Character, Double> allChar = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            allChar.put(word.charAt(i), 0.0);
        }
        for (Character i : allChar.keySet()){
            allChar.put(i, charFrequency(word, i));
        }
        System.out.println(allChar);
        return allChar;
    }
}
