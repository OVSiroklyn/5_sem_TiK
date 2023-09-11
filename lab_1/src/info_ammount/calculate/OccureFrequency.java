package info_ammount.calculate;

public class OccureFrequency {
    public static double charFrequency(String word, char n) {
        int freq = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == n){
                freq++;
            }
        }
        return freq/word.trim().length();
    }

}
