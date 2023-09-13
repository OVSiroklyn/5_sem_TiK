package org.info_ammount.util;

import java.util.*;

public class LinkedHashMapSorter {

    /**
     * Метод для сортировки HashMap по убыванию
     *
     * @param map LinkedHashMap для сортировки
     * @return Возвращает HashMap
     */
    public static LinkedHashMap<Character, Double> sortByDescending(LinkedHashMap<Character, Double> map) {
        List<Map.Entry<Character, Double>> list = new ArrayList<>(map.entrySet());

        //определили свой new Comparator<Map.Entry<Character, Double>>()
        // для сортировки в порядке убывания на основе значений
        //(IntellijIdea сама потом в 1 строку заебашила)
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        LinkedHashMap<Character, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}

