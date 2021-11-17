/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.MasterUserAccountDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
        system.setMasterUserAccountDirectory(new MasterUserAccountDirectory());
        system.setCustomerDirectory(new CustomerDirectory());
        system.setRestaurantDirectory(new RestaurantDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        txtuserName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        btnlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnloginKeyPressed(evt);
            }
        });

        txtuserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserNameKeyPressed(evt);
            }
        });

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        lblusername.setText("User Name");

        lblpassword.setText("Password");

        btnlogout.setText("Logout");
        btnlogout.setEnabled(false);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        btnlogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnlogoutKeyPressed(evt);
            }
        });

        btnsignup.setText("Sign up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        jLabel1.setText("User Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(loginJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblusername, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblpassword, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnlogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsignup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtuserName, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnlogin, btnsignup});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblusername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogin))
                .addGap(36, 36, 36)
                .addComponent(btnlogout)
                .addGap(18, 18, 18)
                .addComponent(btnsignup)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, lblpassword});

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // Get user name
        
        String username = txtuserName.getText();
        char[] passwordArray = passwordField.getPassword();
        String password = String.valueOf(passwordArray);
        System.out.println(username);
        System.out.println(password);
        
        UserAccount loggedinuser = system.getMasterUserAccountDirectory().authenticateUser(username, password);
        
        if (loggedinuser==null){
            JOptionPane.showMessageDialog(this, "User doesn't exist\nCreate new User?");
        }else{
            
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",loggedinuser.getRole().createWorkArea(container, loggedinuser, system));
            layout.next(container);
            btnlogout.setEnabled(true);
            btnlogin.setEnabled(false);
            
            JOptionPane.showMessageDialog(this, "Login Successful");
        }        
       
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        btnlogout.setEnabled(false);
        txtuserName.setEnabled(true);
        passwordField.setEnabled(true);
        btnlogin.setEnabled(true);

        txtuserName.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        
        
        
//        Organization custOrg= (Organization)system.getCustomerDirectory().searchOrganization("Customer");
//        Organization organization5;
//        if(custOrg==null){
//            organization5=(Organization)system.getCustomerDirectory().createOrganization(Organization.Type.Customer);
//        }
//        else{
//            organization5=custOrg;
//        }

//        CardLayout layout=(CardLayout)container.getLayout();
//        container.add(new CreateNewCustomerJPanel(container,system,organization5));
//        layout.next(container);
    }//GEN-LAST:event_btnsignupActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnlogin.doClick();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void txtuserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserNameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passwordField.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtuserNameKeyPressed

    private void btnlogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlogoutKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnlogout.doClick();
        }
    }//GEN-LAST:event_btnlogoutKeyPressed

    private void btnloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnloginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnlogin.doClick();
        }
    }//GEN-LAST:event_btnloginKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsignup;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtuserName;
    // End of variables declaration//GEN-END:variables
}
