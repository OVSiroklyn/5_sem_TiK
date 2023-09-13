package org.info_ammount;
import javax.swing.JFrame;

import com.formdev.flatlaf.FlatDarculaLaf;
import org.info_ammount.gui.MainWindow;


public class Main {
    public static void main(String[] args) {

        FlatDarculaLaf.setup();
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MainWindow().setVisible(true);
    }
}
