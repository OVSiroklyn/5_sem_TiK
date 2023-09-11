package info_ammount;

import info_ammount.calculate.*;
import info_ammount.gui.GUI;

public class Main {
    public static void main(String[] args) {
        System.out.println(OccureFrequency.charFrequency("dasdasdaaaas", 'a'));
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}