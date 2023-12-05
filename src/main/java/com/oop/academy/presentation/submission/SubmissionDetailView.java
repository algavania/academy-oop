/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.submission;

import com.oop.academy.InjectionContainer;
import com.oop.academy.application.repositories.course.SubmissionRepository;
import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.Course;
import com.oop.academy.models.StudentSubmission;
import com.oop.academy.models.Submission;
import com.oop.academy.presentation.MainFrame;
import com.oop.academy.presentation.course.DetailCourseView;
import com.oop.academy.util.DateHelper;

/**
 *
 * @author asus
 */
public class SubmissionDetailView extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private Course course;
    private Submission submission;
    private SubmissionRepository repository = InjectionContainer.submissionRepository;

    /**
     * Creates new form SubmissionDetailView
     *
     * @param mainFrame
     * @param course
     * @param submission
     */
    public SubmissionDetailView(MainFrame mainFrame, Course course, Submission submission) {
        DateHelper dateHelper = new DateHelper();
        this.mainFrame = mainFrame;
        this.course = course;
        this.submission = submission;
        initComponents();
        lblTitle.setText(submission.getName());
        lblContent.setText(submission.getDescription());
        lblDate.setText(dateHelper.formatDate(submission.getCreatedAt()));

        if (course.getTeacher() == DatabaseService.currentUser) {
            btnMySubmission.setText("Lihat Tugas Siswa");
        } else {
            btnEdit.setVisible(false);
            btnDelete.setVisible(false);
        }
    }

    private void goBack() {
        mainFrame.showView(new DetailCourseView(mainFrame, course));
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
        lblContent = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        btnMySubmission = new javax.swing.JButton();

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Nama Tugas");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblContent.setText("Lorem ipsum dolor sit amet");
        lblContent.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblDate.setText("12 Desember 2023");

        btnMySubmission.setText("Lihat Tugas Saya");
        btnMySubmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMySubmissionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnMySubmission)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBack)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete))
                                    .addComponent(lblContent, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addGap(11, 11, 11)
                .addComponent(lblDate)
                .addGap(18, 18, 18)
                .addComponent(lblContent, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnMySubmission)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        mainFrame.showView(new AddSubmissionView(course, submission, mainFrame));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        repository.deleteSubmission(course, submission);
        goBack();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        goBack();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMySubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMySubmissionActionPerformed
        if (course.getTeacher() == DatabaseService.currentUser) {
            mainFrame.showView(new StudentSubmissionListView(mainFrame, submission));
        } else {
            StudentSubmission data = null;
            for (StudentSubmission item : submission.getStudentSubmissions()) {
                if (item.getStudent() == DatabaseService.currentUser) {
                    data = item;
                    break;
                }
            }
            mainFrame.showView(new StudentSubmissionDetailView(mainFrame, 
                    submission, data));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMySubmissionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMySubmission;
    private javax.swing.JLabel lblContent;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
