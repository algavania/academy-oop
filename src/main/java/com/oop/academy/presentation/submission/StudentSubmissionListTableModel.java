package com.oop.academy.presentation.submission;

import com.oop.academy.models.StudentSubmission;
import com.oop.academy.util.DateHelper;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class StudentSubmissionListTableModel extends AbstractTableModel {

    private List<StudentSubmission> list;
    private final String[] columnNames = {"Nama", "Tanggal Pengumpulan"};

    public StudentSubmissionListTableModel(List<StudentSubmission> list) {
        this.list = list;
    }

    public void setList(List<StudentSubmission> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StudentSubmission data = list.get(rowIndex);
        DateHelper dateHelper = new DateHelper();
        NumberFormat format = NumberFormat.getInstance();
        format.setCurrency(Currency.getInstance("IDR"));
        format.setMaximumFractionDigits(0);

        return switch (columnIndex) {
            case 0 ->
                data.getStudent().getName();
            case 1 ->
                dateHelper.formatDate(data.getCreatedAt());
            default ->
                null;
        };
    }

    public StudentSubmission getDataAt(int rowIndex) {
        return list.get(rowIndex);
    }
}
