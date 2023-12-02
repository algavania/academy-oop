/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.dashboard.admin;

import com.oop.academy.InjectionContainer;
import com.oop.academy.models.User;
import com.oop.academy.presentation.MainFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mfazi
 */
public class OldUserManagementView extends javax.swing.JPanel {

    /**
     * Creates new form AdminUserManagemen
     */
    private final MainFrame mainFrame;
    private final DefaultTableModel tableContent;

    public OldUserManagementView(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        tableContent = new DefaultTableModel(new Object[][]{}, new String[]{
            "No", "Username", "Name", "Gender", "Birth Date", "Email", "Balance"
        });

        renderTable();
        initComponents();
        sidebar.setMainFrame(mainFrame);
    }

    private void renderTable() {
        tableContent.getDataVector().removeAllElements();
        tableContent.fireTableDataChanged();
        tableContent.setRowCount(0);

        int i = 1;
        for (User user: InjectionContainer.userRepository.getAllUser()) {
            this.tableContent.addRow(new Object[]{
                i,
                user.getUsername(),
                user.getName(),
                user.getGender(),
                user.getBirthdate(),
                user.getEmail(),
                user.getBalance(),
            });
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

        sidebar = new com.oop.academy.presentation.components.AdminDashboardSidebar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputGender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputBirthDate = new javax.swing.JTextField();
        inputBlance = new javax.swing.JTextField();

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 500));

        table.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        table.setModel(this.tableContent);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        inputUsername.setEditable(false);
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 32)); // NOI18N
        jLabel4.setText("User Management");

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        btnCancel.setBackground(new java.awt.Color(204, 204, 0));
        btnCancel.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Gender");

        inputGender.setEditable(false);
        inputGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGenderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        inputEmail.setEditable(false);
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText("Balance");

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText("Birth Date");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText("Name");

        inputName.setEditable(false);
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        inputBirthDate.setEditable(false);
        inputBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBirthDateActionPerformed(evt);
            }
        });

        inputBlance.setEditable(false);
        inputBlance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBlanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputGender, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBlance, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBlance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selectedRow = this.table.getSelectedRow();
        if (selectedRow >= 0) {
            this.inputUsername.setText((String) this.tableContent.getValueAt(selectedRow, 1));
            this.inputName.setText((String) this.tableContent.getValueAt(selectedRow, 2));
            this.inputGender.setText((String) this.tableContent.getValueAt(selectedRow, 3));
            this.inputBirthDate.setText(this.tableContent.getValueAt(selectedRow, 4).toString());
            this.inputEmail.setText((String) this.tableContent.getValueAt(selectedRow, 5));
            this.inputBlance.setText((String) this.tableContent.getValueAt(selectedRow, 6).toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int selectedRow = this.table.getSelectedRow();
        if (selectedRow >= 0) {
            String username = (String) tableContent.getValueAt(selectedRow, 1);
            try {
                InjectionContainer.userRepository.delete(InjectionContainer.userRepository.getByUsername(username));
                this.inputUsername.setText("");
                this.inputName.setText("");
                this.inputGender.setText("");
                this.inputBirthDate.setText("");
                this.inputEmail.setText("");
                this.inputBlance.setText("");
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
            renderTable();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        int selectedRow = this.table.getSelectedRow();
        if (selectedRow >= 0) {
            this.inputUsername.setText("");
            this.inputName.setText("");
            this.inputGender.setText("");
            this.inputBirthDate.setText("");
            this.inputEmail.setText("");
            this.inputBlance.setText("");
        }
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void inputGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputGenderActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBirthDateActionPerformed

    private void inputBlanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBlanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBlanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JTextField inputBirthDate;
    private javax.swing.JTextField inputBlance;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputGender;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.oop.academy.presentation.components.AdminDashboardSidebar sidebar;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
