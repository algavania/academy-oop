/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.teacher.submission;

import com.oop.academy.InjectionContainer;
import com.oop.academy.application.repositories.teacher.submit.SubmitTeacherRepository;
import com.oop.academy.models.Teacher;
import com.oop.academy.presentation.MainFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamir
 */
public class SubmissionTeacherView extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    private final DefaultTableModel tableContent;
    private final SubmitTeacherRepository submitTeacherRepository
            = InjectionContainer.submitTeacherRepository;
    
    public SubmissionTeacherView(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        tableContent = new DefaultTableModel(new Object[][]{}, new String[]{
            "No", "Nama User", "Nama Sekolah", "periode", "GPA", "Gelar"
        });

        renderTable();
        initComponents();
        
    }

    private void renderTable() {
        tableContent.getDataVector().removeAllElements();
        tableContent.fireTableDataChanged();
        tableContent.setRowCount(0);

        int i = 1;
        for (Teacher teacherRegistration : InjectionContainer.submitTeacherRepository.
                getAllUserTeacherRequest()) {
            this.tableContent.addRow(new Object[]{
                i,
                teacherRegistration.getUsername(),
                teacherRegistration.getEducations().get(0).getName(),
                teacherRegistration.getEducations().get(0).getAttendPeriod(),
                teacherRegistration.getEducations().get(0).getGpa(),
                teacherRegistration.getEducations().get(0).getDegree()
            });
            i++;
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("List Registration Teacher");

        table.setModel(this.tableContent);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnAccept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnAccept)
                .addGap(54, 54, 54)
                .addComponent(btnReject)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnReject))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        if (table.getSelectedRow() >= 0) {
            submitTeacherRepository.acceptNewTeacher(table.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "tolong pilih "
                    + "user yang ingin di terima");
        }
        renderTable();

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        if (table.getSelectedRow() >= 0) {
            submitTeacherRepository.rejectNewTeacher(table.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "tolong pilih "
                    + "user yang ingin di tolak");
        }
        renderTable();

    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
