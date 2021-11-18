/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author braya
 */
public class AddorUpdateRestaurantJPanel extends javax.swing.JPanel {

    JPanel cardSequenceJPanel;
    Restaurant restaurant;
    Employee manager;
    UserAccount userAccount;
    EcoSystem system;
    

    AddorUpdateRestaurantJPanel(JPanel cardSequenceJPanel, EcoSystem system) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.system=system;
        this.restaurant = new Restaurant("");
        //system.getRestaurantDirectory().addRestaurant(rt);
        //this.userAccount = restaurant.getManager().getUseraccount();
        
    }
    
    AddorUpdateRestaurantJPanel(JPanel cardSequenceJPanel, Restaurant restaurant, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        txtusername.setText(userAccount.getUsername());
        txtPassword.setText(userAccount.getPassword());
        txtrestaurantname.setText(restaurant.getRestaurantName());
        txtcuisinetype.setText(restaurant.getCuisineType());
        txtRestaurantAddress.setText(restaurant.getAddress());
        txtmanagername.setText(restaurant.getManager().getName());
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.userAccount = userAccount;
        this.system = system;
        this.restaurant = restaurant;        
    }
    
        AddorUpdateRestaurantJPanel(JPanel cardSequenceJPanel, Restaurant restaurant, EcoSystem system) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        Employee manager = restaurant.getManager();
        this.userAccount = manager.getUseraccount();
        txtRestaurantAddress.setText(restaurant.getAddress());
        txtmanagername.setText(restaurant.getManager().getName());
        txtusername.setText(this.userAccount.getUsername());
        txtPassword.setText(this.userAccount.getPassword());
        txtcuisinetype.setText(restaurant.getCuisineType());
        this.manager = restaurant.getManager();
        txtmanagername.setText(manager.getName());
        txtrestaurantname.setText(restaurant.getRestaurantName());
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.system = system;
        this.restaurant = restaurant;        
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
        btnBack = new javax.swing.JButton();
        txtRestaurantAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblpassword = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblmanagername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtmanagername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblrestaurantname = new javax.swing.JLabel();
        txtrestaurantname = new javax.swing.JTextField();
        lblcuisinetype = new javax.swing.JLabel();
        txtcuisinetype = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Restaurant Details");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpassword.setText("Password");

        lblusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusername.setText("UserName");

        lblmanagername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblmanagername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmanagername.setText("Manager Name");

        lblrestaurantname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblrestaurantname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrestaurantname.setText("Restaurant Name");

        lblcuisinetype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcuisinetype.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcuisinetype.setText("Cuisine Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblrestaurantname, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtrestaurantname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(txtusername))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)
                                    .addComponent(txtPassword))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblmanagername)
                                        .addComponent(lblcuisinetype))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmanagername, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(txtcuisinetype))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtRestaurantAddress, txtmanagername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrestaurantname)
                    .addComponent(txtrestaurantname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcuisinetype)
                    .addComponent(txtcuisinetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmanagername)
                    .addComponent(txtmanagername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusername)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnSave)
                .addGap(64, 64, 64))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtRestaurantAddress, txtmanagername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed
    
    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtusername.getText());
        boolean b = m.matches();
        return b;
  }

    private boolean passwordPatternCorrect() {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = p1.matcher(txtPassword.getText());
        boolean b1 = m1.matches();
        return b1;
  }
    
    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if (usernamePatternCorrect() == false) {
        lblusername.setForeground(Color.red);
        txtusername.setBorder(BorderFactory.createLineBorder(Color.RED));
        JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
        return;
        } else {
        lblusername.setForeground(Color.BLACK);
        txtusername.setBorder(BorderFactory.createLineBorder(Color.black));
        }
        if (passwordPatternCorrect() == false) {
        lblpassword.setForeground(Color.red);
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
        JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
        return;
        } else {
        lblpassword.setForeground(Color.BLACK);
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.black));
        }
        
        Restaurant rt;
        if (system.getRestaurantDirectory().checkIfRestaurantnameIsUnique(txtrestaurantname.getText())){
            if (!system.getRestaurantDirectory().checkIfRestaurantnameIsUnique(this.restaurant.getName())){
                system.getRestaurantDirectory().deleteRestaurant(this.restaurant);
            }
            rt = new Restaurant(txtrestaurantname.getText());
            this.restaurant = rt;
            system.getRestaurantDirectory().addRestaurant(rt);
            this.userAccount = this.restaurant.getManager().getUseraccount();

        }else{
            int index = system.getRestaurantDirectory().checkIfRestaurantExists(txtrestaurantname.getText());
            rt = system.getRestaurantDirectory().getRestaurantList().get(index);
            this.restaurant = rt;
            this.userAccount = this.restaurant.getManager().getUseraccount();
        }
        
        
        this.restaurant.setCuisineType(txtcuisinetype.getText());
        userAccount.setPassword(txtPassword.getText());
        userAccount.setUsername(txtusername.getText());
        
        if (!txtmanagername.getText().isEmpty()){
            userAccount.getEmployee().setName(txtmanagername.getText());
        }


        userAccount.getEmployee().setRestaurant(this.restaurant);
        this.restaurant.setAddress(txtRestaurantAddress.getText().isEmpty()?"":txtRestaurantAddress.getText());

        JOptionPane.showMessageDialog(this, "Updated Successfully");
        
        String name=txtrestaurantname.getText();
        String address=txtRestaurantAddress.getText();
        
        if (name.equals("") ){
            JOptionPane.showMessageDialog(null,"Name field cannot be empty");
            return;            
        }     
    }//GEN-LAST:event_btnSaveActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblcuisinetype;
    private javax.swing.JLabel lblmanagername;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblrestaurantname;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtcuisinetype;
    private javax.swing.JTextField txtmanagername;
    private javax.swing.JTextField txtrestaurantname;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}