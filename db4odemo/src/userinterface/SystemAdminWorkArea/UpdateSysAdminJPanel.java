/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Validator;
import Business.EcoSystem;
import Business.SysAdmin.SysAdmin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public class UpdateSysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateSysAdminJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private SysAdmin sysAdmin;
    private UserAccount userAccount;
    
    public UpdateSysAdminJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, SysAdmin sysAdmin, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.sysAdmin = sysAdmin;
        this.userAccount = userAccount;
        initComponents();
        initializeData();
    }

    private void initializeData() {
        
        namejTextField.setText(sysAdmin.getUserAccount().getName());
        userNamejTextField.setText(sysAdmin.getUserAccount().getUserName());
        passwordjTextField.setText(sysAdmin.getUserAccount().getPassword());
        phoneNojTextField.setText(sysAdmin.getUserAccount().getPhoneNo());
        emailjTextField.setText(sysAdmin.getUserAccount().getEmail());
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phoneNojTextField = new javax.swing.JTextField();
        phoneNojLabel = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        namejLabel = new javax.swing.JLabel();
        userNamejTextField = new javax.swing.JTextField();
        namejTextField = new javax.swing.JTextField();
        passwordjLabel = new javax.swing.JLabel();
        userNamejLabel = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        backButtonjButton = new javax.swing.JButton();
        emailjTextField = new javax.swing.JTextField();
        headerjLabel = new javax.swing.JLabel();

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Contact No :");

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText(" Name :");

        passwordjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwordjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordjLabel.setText("Password :");

        userNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNamejLabel.setText("User Name :");

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");

        backButtonjButton.setText("< < Back");
        backButtonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonjButtonActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Update System Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButtonjButton)
                        .addGap(61, 61, 61)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(emailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatejButton)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButtonjButton)
                    .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namejLabel)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNamejLabel)
                            .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailjLabel)
                        .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNojLabel)
                        .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordjLabel)
                        .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(updatejButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(!sysAdmin.getUserAccount().getUserName().equals(userNamejTextField.getText()) && Validator.checkUserNameAlreadyExists(ecoSystem, userNamejTextField.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(!sysAdmin.getUserAccount().getEmail().equals(emailjTextField.getText()) && Validator.checkEmailAlreadyExists(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(!sysAdmin.getUserAccount().getPhoneNo().equals(phoneNojTextField.getText()) && Validator.checkPhoneNoAlreadyExists(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }
            sysAdmin.getUserAccount().setName(namejTextField.getText());
            sysAdmin.getUserAccount().setUserName(userNamejTextField.getText());
            sysAdmin.getUserAccount().setPassword(passwordjTextField.getText());
            sysAdmin.getUserAccount().setEmail(emailjTextField.getText());
            sysAdmin.getUserAccount().setPhoneNo(phoneNojTextField.getText());

            JOptionPane.showMessageDialog(this, "Successfully Updated the SysAdmin");
        }else {
            JOptionPane.showMessageDialog(this, "Error Updating the SysAdmin. Please check Datatypes");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void backButtonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonjButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = (SystemAdminWorkAreaJPanel) components[components.length-1];
        systemAdminWorkAreaJPanel.populateSysAdmins();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonjButtonActionPerformed

    private boolean isDataEnteredValid() {
        if(namejTextField.getText().matches("^[a-zA-Z0-9 ']+$") && userNamejTextField.getText().matches("^[a-zA-Z0-9]+$") && 
                emailjTextField.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") && 
                !phoneNojTextField.getText().isEmpty() && phoneNojTextField.getText().matches("^[0-9]+$") 
                && phoneNojTextField.getText().length()==10 && passwordjTextField.getText().matches("^[a-zA-Z0-9]+$"))  {
           return true; 
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonjButton;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JLabel phoneNojLabel;
    private javax.swing.JTextField phoneNojTextField;
    private javax.swing.JButton updatejButton;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
