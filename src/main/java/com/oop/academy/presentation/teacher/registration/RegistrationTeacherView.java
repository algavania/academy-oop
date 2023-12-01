/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.teacher.registration;

import com.oop.academy.InjectionContainer;
import com.oop.academy.application.repositories.teacher.registration.TeacherRegistRepository;
import com.oop.academy.models.Education;
import com.oop.academy.models.Teacher;
import com.oop.academy.models.User;
import com.oop.academy.presentation.MainFrame;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrationTeacherView extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    private final DefaultTableModel tableContent;
    private final TeacherRegistRepository teacherRegistRepository
            = InjectionContainer.teacherRegistRepository;

    public RegistrationTeacherView(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        tableContent = new DefaultTableModel(new Object[][]{}, new String[]{
            "No", "Nama Sekolah", "periode", "GPA", "Gelar"
        });

        renderTable();
        initComponents();
    }

    private void clearInputEducation() {
        this.btnAddEducation.setText("Add");

        this.inputGpa.setText("");
        this.inputPeriod.setText("");
        this.inputName.setText("");
        this.inputCertificate.setText("");
        this.inputGelar.setText("");
    }

    private void renderTable() {
        tableContent.getDataVector().removeAllElements();
        tableContent.fireTableDataChanged();
        tableContent.setRowCount(0);

        int i = 1;
        for (Education educations : teacherRegistRepository.getAllEducation()) {
            this.tableContent.addRow(new Object[]{
                i,
                educations.getName(),
                educations.getAttendPeriod(),
                educations.getGpa(),
                educations.getDegree()});
            i++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputPeriod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputGpa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputCertificate = new javax.swing.JTextField();
        btnUploadCertificate = new javax.swing.JButton();
        btnAddEducation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputCL = new javax.swing.JTextField();
        btnUploadCL = new javax.swing.JButton();
        btnRegistration = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        inputPersonalWeb = new javax.swing.JTextField();
        inputDegree = new javax.swing.JLabel();
        inputGelar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Form Pendaftaran Guru");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nambah List Education");

        jLabel3.setText("Nama Sekolah :");

        jLabel4.setText("Lama Periode :");

        jLabel5.setText("Certificate :");

        jLabel6.setText("GPA :");

        jLabel7.setText("years");

        btnUploadCertificate.setText("upload");
        btnUploadCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadCertificateActionPerformed(evt);
            }
        });

        btnAddEducation.setText("Add");
        btnAddEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEducationActionPerformed(evt);
            }
        });

        table.setModel(this.tableContent);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel8.setText("Surat Lamaran :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("List Education");

        btnUploadCL.setText("upload");
        btnUploadCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadCLActionPerformed(evt);
            }
        });

        btnRegistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistration.setText("Registration");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });

        jLabel10.setText("Personal Website :");

        inputDegree.setText("Gelar :");

        jButton1.setText("Delete");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputCertificate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnUploadCertificate))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(inputPeriod)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addGap(115, 115, 115))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90)
                                                .addComponent(inputDegree)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton1)
                                                    .addComponent(inputGelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 35, Short.MAX_VALUE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel10))
                                            .addGap(25, 25, 25)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(inputCL, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnUploadCL))
                                                .addComponent(inputPersonalWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(185, 185, 185)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(btnAddEducation))
                                                .addComponent(jLabel9))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCancel)
                                            .addGap(20, 20, 20)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnRegistration)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(136, 204, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUploadCertificate)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputDegree)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(inputGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(inputGelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEducation)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inputCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUploadCL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(inputPersonalWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnRegistration)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadCLActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        String filename = f.getAbsolutePath();
        inputCL.setText(filename);
    }//GEN-LAST:event_btnUploadCLActionPerformed

    private void btnAddEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEducationActionPerformed
        String name = inputName.getText();
        String degree = inputGelar.getText();
        String certificate = inputCertificate.getText();
        float Gpa = 0;
        int period = 0;

        try {
            period = Integer.parseInt(inputPeriod.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Out Of "
                    + "Integer");
        }
        try {
            Gpa = Float.parseFloat(inputGpa.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Out Of "
                    + "Float");
        }
        Education newEducation = new Education(name, period, degree,
                Gpa, certificate);
        if ("Add".equals(btnAddEducation.getText())) {
            try {
                teacherRegistRepository.addEducation(newEducation);
            } catch (Exception ex) {
                Logger.getLogger(RegistrationTeacherView.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                teacherRegistRepository.
                        updateEducation(teacherRegistRepository.
                                getSelectedRow(), newEducation);
            } catch (Exception ex) {
                Logger.getLogger(RegistrationTeacherView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        clearInputEducation();
        renderTable();

    }//GEN-LAST:event_btnAddEducationActionPerformed

    private void btnUploadCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadCertificateActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        String filename = f.getAbsolutePath();
        inputCertificate.setText(filename);
        
    }//GEN-LAST:event_btnUploadCertificateActionPerformed

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        User currentUser = teacherRegistRepository.getCurrentUser();
        List<Education> educations = InjectionContainer.teacherRegistRepository.getAllEducation();
        String coverLetter = inputCL.getText();
        String personalWebsite = inputPersonalWeb.getText();

        Teacher registTeacher = new Teacher(currentUser);
        registTeacher.setEducations(educations);
        registTeacher.setCoverLetter(coverLetter);
        registTeacher.setPersonalWebsiteUrl(personalWebsite);

        try {
            teacherRegistRepository.RegisterTeacher(registTeacher);
        } catch (Exception ex) {
            Logger.getLogger(RegistrationTeacherView.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        String period;
        String Gpa;
        btnAddEducation.setText("Update");

        int selectedRow = this.table.getSelectedRow();
        if (selectedRow >= 0) {
            teacherRegistRepository.setSelectedRow(selectedRow);
            Gpa = String.valueOf(teacherRegistRepository.
                    getEducationById(selectedRow).getGpa());
            period = String.valueOf(teacherRegistRepository.
                    getEducationById(selectedRow).getAttendPeriod());
            this.inputGpa.setText((String) Gpa);
            this.inputPeriod.setText((String) period);
            this.inputName.setText((String) teacherRegistRepository.
                    getEducationById(selectedRow).getName());
            this.inputCertificate.setText((String) teacherRegistRepository.
                    getEducationById(selectedRow).getCertificateUrl());
            this.inputGelar.setText((String) teacherRegistRepository.
                    getEducationById(selectedRow).getDegree());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearInputEducation();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEducation;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JButton btnUploadCL;
    private javax.swing.JButton btnUploadCertificate;
    private javax.swing.JTextField inputCL;
    private javax.swing.JTextField inputCertificate;
    private javax.swing.JLabel inputDegree;
    private javax.swing.JTextField inputGelar;
    private javax.swing.JTextField inputGpa;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPeriod;
    private javax.swing.JTextField inputPersonalWeb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
