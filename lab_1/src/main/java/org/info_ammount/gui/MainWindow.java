package org.info_ammount.gui;

import org.info_ammount.parser.Parser;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

import static org.info_ammount.util.Gagulya.*;

public class MainWindow extends JFrame {

    private static DataTableModel tableModel;
    private JPanel mainPanel;
    private JPanel infoLabel;
    private JLabel me;
    private JToolBar toolbar;
    private JButton exitButton;
    private JTextField textField1;
    private JLabel textLabel;
    private JTextField inputTextField;
    private JButton workButton;
    private JTextField inputLinkField;
    private JLabel linkLabel;
    private JButton clearButton;
    private JTable symbolTable;
    private JLabel someLabel;
    private JComboBox comboBox1;

    private String[] chooseLang = {"ua", "en", "de"};
    HashMap<String, Integer> languages = new HashMap<>();
    public MainWindow() {
        me.setText(" LAB-1 " + " | ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 750);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setUndecorated(true);

        buttonListeners();
        setupTable();

        comboBox1.setSelectedItem(0);
    }

    private void buttonListeners() {
        exitButton.addActionListener(e -> System.exit(0));

        workButton.addActionListener(e -> {
            // получаем выбраный елемент языка
            String selectedLanguage = (String) comboBox1.getSelectedItem();
            switch (selectedLanguage) {
                case "en" -> selectedLangChars = 26;
                case "de" -> selectedLangChars = 30;
                default -> selectedLangChars = 33;
            }


            String link;
            if (inputTextField.getText() != null) {
                //получаем текст с пер
                inputTextField.getText();
            }
            if (inputLinkField.getText() != null) {
                link = inputLinkField.getText();
                Parser.parseUrl(link);
                //Parser.parseUrl(link);
            }

            // это просто прикол
            double s = 0.123;
            someLabel.setText("Непомню что double | " + s + " | " + selectedLanguage + " " + selectedLangChars); // GetChota.getNumber()
        });

        clearButton.addActionListener(e -> {
            inputTextField.setText("");
            inputLinkField.setText("");
            someLabel.setText("Непомню что double |");
            //updateTable(getSumbolsMap().size()-1);
        });
    }

    public static void updateTable(int rowIndex) {
        tableModel.fireTableRowsInserted(rowIndex, rowIndex);
    }

    private void setupTable() {
        HashMap<Character, Double> tempmap = new HashMap<Character, Double>();
        tempmap.put('a', 0.123);
        tempmap.put('g', 0.3);

        tableModel = new DataTableModel(tempmap);//new ArrayList<HashMap<Character, Double>>()); // <-- getRecipeArrayList() in ()

        symbolTable.setModel(tableModel);
        TableColumnModel columnModel = symbolTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);      // char
        columnModel.getColumn(1).setPreferredWidth(70);     // value
        columnModel.getColumn(2).setPreferredWidth(680);     // value

        // можно выбрать только 1 ряд одновременно
        symbolTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        symbolTable.setSelectionBackground(Color.white);
        symbolTable.setSelectionForeground(Color.black);
        symbolTable.getTableHeader().setReorderingAllowed(false);

        // выровнять колонки по центру
        int[] centeredColumns = {0, 1, 2};
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int column : centeredColumns) {
            symbolTable.getColumnModel().getColumn(column).setCellRenderer(centerRenderer);
        }

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 4, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-14605013));
        mainPanel.setEnabled(false);
        mainPanel.setForeground(new Color(-5524801));
        toolbar = new JToolBar();
        toolbar.setBackground(new Color(-14605013));
        toolbar.setFloatable(false);
        mainPanel.add(toolbar, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, 20), null, 0, false));
        me = new JLabel();
        Font meFont = this.$$$getFont$$$(null, -1, 16, me.getFont());
        if (meFont != null) me.setFont(meFont);
        me.setForeground(new Color(-5524801));
        me.setHorizontalAlignment(0);
        me.setText("LAB-1");
        toolbar.add(me);
        exitButton = new JButton();
        exitButton.setBackground(new Color(-14605013));
        exitButton.setForeground(new Color(-5524801));
        exitButton.setText("Закрыть");
        toolbar.add(exitButton);
        inputTextField = new JTextField();
        inputTextField.setBackground(new Color(-14605013));
        inputTextField.setForeground(new Color(-5524801));
        inputTextField.setToolTipText("nihua ne delaet");
        mainPanel.add(inputTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(220, -1), new Dimension(220, -1), 1, false));
        textLabel = new JLabel();
        textLabel.setBackground(new Color(-5524801));
        textLabel.setForeground(new Color(-5524801));
        textLabel.setText("Ввести текст");
        mainPanel.add(textLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        mainPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        mainPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        inputLinkField = new JTextField();
        inputLinkField.setBackground(new Color(-14605013));
        inputLinkField.setForeground(new Color(-5524801));
        inputLinkField.setToolTipText("nihua ne delaet");
        mainPanel.add(inputLinkField, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(220, -1), new Dimension(220, -1), 1, false));
        linkLabel = new JLabel();
        linkLabel.setBackground(new Color(-5524801));
        linkLabel.setForeground(new Color(-5524801));
        linkLabel.setText("Ввести посилання");
        mainPanel.add(linkLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        workButton = new JButton();
        workButton.setBackground(new Color(-14605013));
        workButton.setForeground(new Color(-5524801));
        workButton.setHorizontalTextPosition(2);
        workButton.setText("Обработать");
        mainPanel.add(workButton, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, new Dimension(150, 30), null, 1, false));
        clearButton = new JButton();
        clearButton.setBackground(new Color(-14605013));
        clearButton.setForeground(new Color(-5524801));
        clearButton.setText("clear");
        mainPanel.add(clearButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(75, 30), new Dimension(75, 30), 1, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setBackground(new Color(-14605013));
        scrollPane1.setForeground(new Color(-5524801));
        mainPanel.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        symbolTable = new JTable();
        symbolTable.setAutoResizeMode(4);
        symbolTable.setBackground(new Color(-14605013));
        symbolTable.setFillsViewportHeight(true);
        Font symbolTableFont = this.$$$getFont$$$("Arial", -1, -1, symbolTable.getFont());
        if (symbolTableFont != null) symbolTable.setFont(symbolTableFont);
        symbolTable.setForeground(new Color(-5524801));
        symbolTable.setGridColor(new Color(-5524801));
        symbolTable.setSelectionForeground(new Color(-10855846));
        symbolTable.setVisible(true);
        scrollPane1.setViewportView(symbolTable);
        someLabel = new JLabel();
        someLabel.setBackground(new Color(-14605013));
        someLabel.setForeground(new Color(-5524801));
        someLabel.setText("double chota");
        mainPanel.add(someLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        comboBox1 = new JComboBox<>(chooseLang);
        comboBox1.setBackground(new Color(-14605013));
        comboBox1.setForeground(new Color(-5524801));
        mainPanel.add(comboBox1, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(75, 25), new Dimension(75, 25), 1, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
