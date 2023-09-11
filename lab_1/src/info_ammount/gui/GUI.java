package info_ammount.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

public class GUI extends JFrame {
    private JLabel blank = new JLabel();
    private JLabel l11 = new JLabel("Число №1:");
    private TextField i1 = new TextField();
    private JLabel l12 = new JLabel("");
    private JLabel l13 = new JLabel("");
    private JLabel l21 = new JLabel("Число №2:");
    private TextField i2 = new TextField();
    private JLabel l22 = new JLabel("");
    private JLabel l23 = new JLabel("");

    private JLabel l31 = new JLabel("Число №3:");
    private TextField i3 = new TextField();
    private JLabel l32 = new JLabel("");
    private JLabel l33 = new JLabel("");

    private JLabel l41 = new JLabel("Число №4:");
    private TextField i4 = new TextField();
    private JLabel l42 = new JLabel("");
    private JLabel l43 = new JLabel("");

    private JLabel l51 = new JLabel("Число №5:");
    private TextField i5 = new TextField();
    private JLabel l52 = new JLabel("");
    private JLabel l53 = new JLabel("");

    private JButton b1 = new JButton("Перевірити простоту");
    private JButton b2 = new JButton("Факторизувати");

    public GUI() {
        super("525і2 Сіроклин Олександр Курсовий проєкт \"Перевірка чисел на простоту\"");
        this.setBounds(200, 300, 700, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6, 4, 4, 4));
        container.add(l11);
        container.add(i1);
        container.add(l12);
        container.add(l13);
        container.add(l21);
        container.add(i2);
        container.add(l22);
        container.add(l23);
        container.add(l31);
        container.add(i3);
        container.add(l32);
        container.add(l33);
        container.add(l41);
        container.add(i4);
        container.add(l42);
        container.add(l43);
        container.add(l51);
        container.add(i5);
        container.add(l52);
        container.add(l53);
        container.add(blank);
        container.add(b1);
        container.add(b2);

        long primeBase = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43};
        for (int prime : primes) {
            primeBase *= prime;
        }

        i1.setText(Long.toString( 947));
        i2.setText(Long.toString( 953));
        i3.setText(Long.toString( 67));
        i4.setText(Long.toString( 971));
        i5.setText(Long.toString( 977));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    i1.setText(Long.toString( 947));

                } catch (Exception err) {
                    l12.setText("Некоректний ввід");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i1.setText(Long.toString( 947));

            }
        });
    }
}

