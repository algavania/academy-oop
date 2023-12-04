/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.course;

import com.oop.academy.InjectionContainer;
import com.oop.academy.application.repositories.course.CourseContentRepository;
import com.oop.academy.models.Course;
import com.oop.academy.models.CourseContent;
import com.oop.academy.presentation.MainFrame;
import com.oop.academy.presentation.dashboard.UserDashboardView;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class AddCourseContentView extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private Course course;
    private CourseContent courseContent;
    private CourseContentRepository repository = InjectionContainer.courseContentRepository;

    /**
     * Creates new form AddCourseContentView
     *
     * @param course
     * @param courseContent
     * @param mainFrame
     */
    public AddCourseContentView(Course course, CourseContent courseContent, MainFrame mainFrame) {
        this.course = course;
        this.courseContent = courseContent;
        this.mainFrame = mainFrame;
        initComponents();

        if (courseContent != null) {
            tfName.setText(courseContent.getName());
            tfDesc.setText(courseContent.getContent());
            lblTitle.setText("Edit Kelas");
            btnSubmit.setText("Simpan");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfDesc = new javax.swing.JTextArea();

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Judul");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Deskripsi     :");

        btnSubmit.setBackground(new java.awt.Color(102, 255, 51));
        btnSubmit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSubmit.setText("TAMBAH");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTitle.setText("TAMBAH KELAS");

        tfDesc.setColumns(20);
        tfDesc.setRows(5);
        jScrollPane2.setViewportView(tfDesc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblTitle)
                        .addContainerGap(242, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String name = tfName.getText();
        String desc = tfDesc.getText();
        try {
            if (name.isBlank() || desc.isBlank()) {
                throw new Exception("Field tidak boleh kosong");
            }
            if (courseContent == null) {
                CourseContent content = new CourseContent();
                content.setName(name);
                content.setContent(desc);
                content.setCreatedAt();
                content.setUpdatedAt();
                content.setCourse(course);
                repository.addCourseContent(course, content);

                tfName.setText("");
                tfDesc.setText("");
            } else {
                CourseContent oldContent = courseContent;
                courseContent.setName(name);
                courseContent.setContent(desc);
                courseContent.setUpdatedAt();
                repository.updateCourseContent(course, oldContent, courseContent);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (courseContent == null) {
            mainFrame.showView(new DetailCourseView(mainFrame, course));
        } else {
            mainFrame.showView(new DetailCourseContentView(mainFrame, course, courseContent));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea tfDesc;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
