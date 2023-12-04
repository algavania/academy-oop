/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.oop.academy.presentation.dashboard;

import com.oop.academy.application.service.DatabaseService;
import com.oop.academy.models.Admin;
import com.oop.academy.models.Teacher;
import com.oop.academy.models.User;
import com.oop.academy.presentation.MainFrame;
import com.oop.academy.presentation.authentication.LoginView;
import com.oop.academy.presentation.course.CoursesView;
import com.oop.academy.presentation.dashboard.admin.CategoryManagementView;
import com.oop.academy.presentation.dashboard.admin.UserManagementView;
import com.oop.academy.presentation.profile.ProfileView;
import com.oop.academy.presentation.teacher.registration.RegistrationTeacherView;
import javax.swing.JInternalFrame;

/**
 *
 * @author mapam
 */
public class UserDashboardView extends javax.swing.JPanel {

    MainFrame mainFrame;
    User currentUser;

    /**
     * Creates new form UserDashboard
     *
     * @param mainFrame
     * @param initialFrame
     */
    public UserDashboardView(MainFrame mainFrame, JInternalFrame initialFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        currentUser = DatabaseService.currentUser;
        if (currentUser instanceof Admin) {
            LoginLabel.setText("Login sebagai Admin.");
            Menu1.setText("User Management");
            Menu2.setText("Category Management");
            Menu3.setText("Courses List");
            Menu4.setText("Approval");
            Menu5.setVisible(false);
        } else if (currentUser instanceof Teacher) {
            LoginLabel.setText("Login sebagai Teacher.");
            Menu1.setText("My Lecture");
            Menu2.setText("Add Course");
            Menu3.setText("Profile");
            Menu4.setVisible(false);
            Menu5.setVisible(false);
        } else {
            LoginLabel.setText("Login sebagai Student.");
            Menu1.setText("Home");
            Menu2.setText("My Course");
            Menu3.setText("Profile");
            Menu4.setVisible(false);
            Menu5.setText("Be a Teacher!");
        }
        if (initialFrame != null) {
            changeInternalFrame(initialFrame);
        }
    }

    private void changeInternalFrame(JInternalFrame view) {
        jDesktopPane1.removeAll();
        jDesktopPane1.add(view).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AcademyLabel = new javax.swing.JLabel();
        MenuLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Menu1 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JLabel();
        Menu3 = new javax.swing.JLabel();
        Menu4 = new javax.swing.JLabel();
        Menu5 = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jLabel9.setText("jLabel9");

        setBackground(new java.awt.Color(242, 228, 228));

        jPanel1.setBackground(new java.awt.Color(54, 53, 56));

        AcademyLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AcademyLabel.setForeground(new java.awt.Color(246, 246, 246));
        AcademyLabel.setText("Academy");

        MenuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MenuLabel.setForeground(new java.awt.Color(246, 246, 246));
        MenuLabel.setText(" ");

        LoginLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(246, 246, 246));
        LoginLabel.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AcademyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(AcademyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LoginLabel)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MenuLabel)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(141, 140, 138));

        Menu1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Menu1.setText(" Menu 1");
        Menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu1MousePressed(evt);
            }
        });

        Menu2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Menu2.setText(" Menu 2");
        Menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu2MousePressed(evt);
            }
        });

        Menu3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Menu3.setText(" Menu 3");
        Menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu3MousePressed(evt);
            }
        });

        Menu4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Menu4.setText(" Menu 4");
        Menu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu4MousePressed(evt);
            }
        });

        Menu5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Menu5.setText(" Menu 5");
        Menu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu5MousePressed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(153, 97, 97));
        LogoutButton.setForeground(new java.awt.Color(246, 246, 246));
        LogoutButton.setText("Sign out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoutButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Menu1)
                .addGap(18, 18, 18)
                .addComponent(Menu2)
                .addGap(18, 18, 18)
                .addComponent(Menu3)
                .addGap(18, 18, 18)
                .addComponent(Menu4)
                .addGap(18, 18, 18)
                .addComponent(Menu5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 873, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
        // TODO add your handling code here:
        if (currentUser instanceof Admin) {
            MenuLabel.setText("User Management");
            changeInternalFrame(new UserManagementView(mainFrame));
        } else if (currentUser instanceof Teacher) {
            MenuLabel.setText("My Lecture");
        } else {
            changeInternalFrame(new CoursesView(mainFrame));
            MenuLabel.setText("Home");
        }
    }//GEN-LAST:event_Menu1MouseClicked

    private void Menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MousePressed
        // TODO add your handling code here:
//        changeInternalFrame(new CoursesView(mainFrame));
    }//GEN-LAST:event_Menu1MousePressed

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        // TODO add your handling code here:
        if (currentUser instanceof Admin) {
            MenuLabel.setText("Category Management");
            changeInternalFrame(new CategoryManagementView(mainFrame));
        } else if (currentUser instanceof Teacher) {
        } else {
            MenuLabel.setText("My Course");
        }
    }//GEN-LAST:event_Menu2MouseClicked

    private void Menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu2MousePressed

    private void Menu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu3MousePressed

    private void Menu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu4MousePressed

    private void Menu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu5MousePressed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        DatabaseService.currentUser = null;
        mainFrame.showView(new LoginView(mainFrame));
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseClicked
        // TODO add your handling code here:
        if (currentUser instanceof Admin) {
            MenuLabel.setText("Courses List");
        } else if (currentUser instanceof Teacher) {
            MenuLabel.setText("Profile");
            changeInternalFrame(new ProfileView(mainFrame, currentUser));
        } else {
            MenuLabel.setText("Profile");
            changeInternalFrame(new ProfileView(mainFrame, currentUser));
        }
    }//GEN-LAST:event_Menu3MouseClicked

    private void Menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MouseClicked
        // TODO add your handling code here:
        if (currentUser instanceof Admin) {
            MenuLabel.setText("Approval");
        } else if (currentUser instanceof Teacher) {
            MenuLabel.setText("");
        } else {
            MenuLabel.setText("");
        }
    }//GEN-LAST:event_Menu4MouseClicked

    private void Menu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MouseClicked
        // TODO add your handling code here:
        if (currentUser instanceof Admin) {
            MenuLabel.setText("");
        } else if (currentUser instanceof Teacher) {
            MenuLabel.setText("");
        } else {
            MenuLabel.setText("Be a Teacher!");
            mainFrame.showView(new RegistrationTeacherView(mainFrame));
        }
    }//GEN-LAST:event_Menu5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcademyLabel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel Menu1;
    private javax.swing.JLabel Menu2;
    private javax.swing.JLabel Menu3;
    private javax.swing.JLabel Menu4;
    private javax.swing.JLabel Menu5;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
