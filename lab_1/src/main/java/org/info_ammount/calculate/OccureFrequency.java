package org.info_ammount.calculate;

import java.util.*;

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
    public static LinkedHashMap<Character, Double> allCharCounter(String word){ // Видає перелік усіх частот появи у форматі HashSet
        LinkedHashMap<Character, Double> allChar = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            allChar.put(word.charAt(i), 0.0);
        }
        allChar.replaceAll((i, v) -> charFrequency(word, i));
        System.out.println(allChar);


        orderByValue(allChar, new DoubleComparator());

        return allChar;
    }
    static class DoubleComparator implements Comparator<Double> {
        @Override
        public int compare(Double o1, Double o2) {
            // Використовуйте метод compareTo для порівняння значень Double
            return o1.compareTo(o2);
        }
    }
    static <K, V> void orderByValue(LinkedHashMap<K, V> m, final Comparator<? super V> c) {
        List<Map.Entry<K, V>> entries = new ArrayList<>(m.entrySet());
        entries.sort((lhs, rhs) -> c.compare(lhs.getValue(), rhs.getValue()));
        m.clear();
        for(Map.Entry<K, V> e : entries) {
            m.put(e.getKey(), e.getValue());
        }
    }
}
