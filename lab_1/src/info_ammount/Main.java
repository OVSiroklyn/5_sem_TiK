package info_ammount;

import info_ammount.calculate.InfoAmmount;
import info_ammount.gui.GUI;

public class Main {
    public static void main(String[] args) {
        InfoAmmount b1 = new InfoAmmount(2000, 33);
        System.out.println(b1.MethodHartli());
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}