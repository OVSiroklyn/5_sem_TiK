package org.info_ammount.calculate;

import org.info_ammount.gui.MainWindow;

import java.util.HashMap;

public class InfoAmmount {

    public static double calculateShannonEntropy(HashMap<Character, Double> probabilities) {
        double entropy = 0.0;
        int size = probabilities.size();
        for (HashMap.Entry<Character, Double> entry : probabilities.entrySet()) {
            double probability = entry.getValue();
            entropy += probability  * log2(probability);
        }
        System.out.println(size);
        return - size / entropy ;
    }

    public static double log2(double x) {
        return x == 0.0 ? 0.0 : Math.log(x) / Math.log(2);
    }

}
