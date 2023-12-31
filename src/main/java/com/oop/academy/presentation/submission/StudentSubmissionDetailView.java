/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.submission;

import com.oop.academy.application.repositories.course.SubmissionRepository;
import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.StudentSubmission;
import com.oop.academy.models.Submission;
import com.oop.academy.models.User;
import com.oop.academy.presentation.MainFrame;
import java.awt.Desktop;
import java.io.File;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class StudentSubmissionDetailView extends javax.swing.JPanel {

    private StudentSubmission studentSubmission = null;
    private final Submission submission;
    private final MainFrame mainFrame;
    private final SubmissionRepository repository = new SubmissionRepository();
    private final User user = DatabaseService.currentUser;
    private boolean isTeacher = false;

    /**
     * Creates new form StudentSubmissionDetailView
     *
     * @param mainFrame
     * @param submission
     * @param studentSubmission
     */
    public StudentSubmissionDetailView(MainFrame mainFrame, Submission submission, StudentSubmission studentSubmission) {
        this.mainFrame = mainFrame;
        this.studentSubmission = studentSubmission;
        this.submission = submission;
        initComponents();

        lblTitle.setText(submission.getName());
        tfName.setText(user.getName());
        if (studentSubmission != null) {
            tfFile.setText(studentSubmission.getFile().getAbsolutePath());
            Double score = studentSubmission.getScore();
            tfScore.setText(score == null ? "" : String.valueOf(score));
        }

        isTeacher = user == submission.getCourse().getTeacher();

        if (isTeacher) {
            tfScore.setEnabled(true);
            btnUpload.setVisible(false);
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

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfScore = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfFile = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Nama Tugas");

        jLabel2.setText("Nama");

        tfName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfName.setEnabled(false);

        jLabel3.setText("Nilai");

        tfScore.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfScore.setEnabled(false);

        jLabel4.setText("File");

        tfFile.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfFile.setEnabled(false);

        btnUpload.setText("Upload File");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnDownload.setText("Lihat File");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfScore, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDownload)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpload))
                                    .addComponent(tfFile, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblTitle)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpload)
                    .addComponent(btnDownload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        tfFile.setText(file.getAbsolutePath());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        try {
            if (!tfFile.getText().isBlank()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(new File(tfFile.getText()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = tfFile.getText();
        String score = tfScore.getText();
        boolean isScoreValid = !score.isBlank();
        if (!isTeacher) {
            isScoreValid = true;
        }
        try {
            if (name.isBlank() || !isScoreValid) {
                throw new Exception("Field tidak boleh kosong");
            }
            Double scoreValue = score.trim().isEmpty() ? null : Double.valueOf(score);
            File file = new File(tfFile.getText());
            if (studentSubmission == null) {
                StudentSubmission data = new StudentSubmission(submission, user, file, scoreValue, new Date());
                repository.addStudentSubmission(submission, data);
            } else {
                StudentSubmission oldContent = studentSubmission;
                studentSubmission.setFile(file);
                studentSubmission.setScore(scoreValue);
                repository.updateStudentSubmission(submission, oldContent, studentSubmission);
            }
            JOptionPane.showMessageDialog(this, "Berhasil disimpan!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new SubmissionDetailView(mainFrame, submission.getCourse(), submission));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField tfFile;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfScore;
    // End of variables declaration//GEN-END:variables
}
