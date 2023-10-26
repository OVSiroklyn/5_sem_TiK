package org.info_ammount.calculate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InfoAmmount {

    private static int charquant; //довжина повідомлення в знаках
    private String beginstr; //вхідна строка
    private  int mquantity; //Кількість літер у алфавіту
    private  double log2_m;
    private  int iresult;

    public InfoAmmount(String str, int mquantity)
    {
        this.beginstr = str;
        this.mquantity = mquantity;
        this.charquant = str.length();
        this.log2_m =  (Math.log(mquantity) / Math.log(2));
    }
    public int MethodHartli()
    {
        return  iresult = ( (charquant) * (int)log2_m);
    }

    public static double calculateShannonEntropy(HashMap<Character, Double> probabilities) {
        double entropy = 0.0;
        for (HashMap.Entry<Character, Double> entry : probabilities.entrySet()) {
            double probability = entry.getValue();
            // entropy -= probability * log2(probability);
            entropy += (charquant/probability  * log2(charquant/probability))  ;
        }
        System.out.println(charquant);
        return entropy ;
    }

    public static double log2(double x) {
        if (x == 0.0) {
            return 0.0; // Логарифм от 0 по основанию 2 равен 0
        }
        return Math.log(x) / Math.log(2);
    }

}
