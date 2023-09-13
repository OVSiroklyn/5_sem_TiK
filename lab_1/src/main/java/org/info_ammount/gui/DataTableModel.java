package org.info_ammount.gui;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.TreeMap;


import javax.swing.table.AbstractTableModel;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;

public class DataTableModel extends AbstractTableModel {

    private TreeMap<Character, Double> data;
    private String[] columnNames = {"Character", "Value", ""};

    public DataTableModel(TreeMap<Character, Double> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        char character = (char) data.keySet().toArray()[row];
        double value = (double) data.values().toArray()[row];

        if (col == 0) {
            return character;
        } else if (col == 1) {
            return value;
        } else if (col == 2) {
            return "";
        }
        return null;
    }

    public void updateTable(TreeMap<Character, Double> newData) {
        this.data = newData;
        fireTableDataChanged(); // Уведомляем таблицу о том, что данные изменились
    }


    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
}


