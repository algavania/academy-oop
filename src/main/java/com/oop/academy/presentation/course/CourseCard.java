/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.course;

import com.oop.academy.InjectionContainer;
import com.oop.academy.application.repositories.course.CourseRepository;
import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.util.CurrencyHelper;
import com.oop.academy.models.Course;
import com.oop.academy.models.Student;
import com.oop.academy.presentation.MainFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class CourseCard extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private final Course course;
    private final CourseRepository repository = InjectionContainer.courseRepository;

    /**
     * Creates new form CourseCard
     * @param course
     * @param mainFrame
     */
    public CourseCard(Course course, MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.course = course;
        initComponents();
        lblCategory.setText(course.getCategory().getName());
        lblPrice.setText(CurrencyHelper.convertToRupiah(course.getPrice()));
        lblTeacherName.setText(course.getTeacher().getName());
        lblTitle.setText(course.getName());
        
        if (course.getTeacher() == DatabaseService.currentUser) {
            btnEnroll.setVisible(false);
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

        lblCategory = new javax.swing.JLabel();
        lblTeacherName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnEnroll = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(230, 165));
        setPreferredSize(new java.awt.Dimension(340, 165));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lblCategory.setText("Programming");

        lblTeacherName.setText("John Doe");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrice.setText("Rp90.000");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setText("Belajar Pemrograman dengan Java");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnEnroll.setText("Enroll");
        btnEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeacherName)
                            .addComponent(lblPrice))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategory)
                                .addGap(0, 255, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnroll)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeacherName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnEnroll)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mainFrame.showView(new DetailCourseView(mainFrame, course));
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed
        try {
            repository.enroll(course);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnrollActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnroll;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTeacherName;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
