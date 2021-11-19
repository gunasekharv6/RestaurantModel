/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Business.EcoSystem;
import Business.Order;
import Business.Organization;
import Business.UserAccount.UserAccount;

/**
 * @author raunak
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

  private JPanel userProcessContainer;
  private UserAccount userAccount;
  private EcoSystem business;
  private Enterprise enterprise;
  private Organization organization;
  private Order order;
  private int ctr;

  public PlaceOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
    initComponents();
    this.ctr = 0;
    this.userProcessContainer = userProcessContainer;
    this.userAccount = account;
    this.business = business;
    this.enterprise = enterprise;
    this.organization = organization;
    this.order = business.getOrderDirectory().createOrder();
    populateComboBox();
  }

  public void populateComboBox() {
    DefaultComboBoxModel dm = new DefaultComboBoxModel();
    for (Enterprise e : business.getEnterpriseDirectory().getEnterpriseList()) {
      dm.addElement(e);
    }
    RestaurantComboBox.setModel(dm);
  }

  public void populateRequestTable(String restaurantName) {
    DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
    dtm.setRowCount(0);
    for (Enterprise e : business.getEnterpriseDirectory().getEnterpriseList()) {
      if (e.getName().equals(restaurantName)) {
        for (Items item : e.getItemsList()) {
          Object row[] = new Object[2];
          row[0] = item;
          row[1] = item.getPrice();
          dtm.addRow(row);
        }
      }
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    workRequestJTable = new javax.swing.JTable();
    requestTestJButton = new javax.swing.JButton();
    refreshTestJButton = new javax.swing.JButton();
    enterpriseLabel = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    RestaurantComboBox = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    customerNotesTxt = new javax.swing.JTextField();
    jButton3 = new javax.swing.JButton();

    workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null}
            },
            new String[]{
                    "Item", "Price"
            }
    ) {
      Class[] types = new Class[]{
              java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean[]{
              false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    jScrollPane1.setViewportView(workRequestJTable);
    if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
      workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
      workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
    }

    requestTestJButton.setText("Add to cart");
    requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        requestTestJButtonActionPerformed(evt);
      }
    });

    refreshTestJButton.setText("Search Menu");
    refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refreshTestJButtonActionPerformed(evt);
      }
    });

    enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    enterpriseLabel.setText("Order Placing");

    jButton1.setText("Delete from cart");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("Place order");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jLabel1.setText("Select Restaurant :");

    jLabel2.setText("Any message to restaurant?");

    jButton3.setText("back");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(refreshTestJButton)
                            .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(92, 92, 92)
                                            .addComponent(jButton2)
                                            .addGap(168, 168, 168)
                                            .addComponent(jButton1)
                                            .addGap(105, 105, 105)
                                            .addComponent(requestTestJButton))
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(131, 131, 131)
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(RestaurantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jButton3)
                                            .addGap(138, 138, 138)
                                            .addComponent(enterpriseLabel))
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(145, 145, 145)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(customerNotesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(86, 86, 86))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(RestaurantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addComponent(refreshTestJButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(customerNotesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(requestTestJButton)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                            .addGap(63, 63, 63))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed


    int selectedRow = workRequestJTable.getSelectedRow();
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(null, "Please select a row");
      return;
    } else {
      Items i = (Items) workRequestJTable.getValueAt(selectedRow, 0);
      Items item = order.addItem();
      item.setItemName(i.getItemName());
      item.setPrice(i.getPrice());
      JOptionPane.showMessageDialog(null, "Added to cart successfully");
    }

  }//GEN-LAST:event_requestTestJButtonActionPerformed

  private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
    Enterprise e = (Enterprise) RestaurantComboBox.getSelectedItem();

    if (e.getName() == null || e.getName() == "") {
      return;
    }

    JOptionPane.showMessageDialog(null, "As the restaurant has been changed, the cart is cleared");
    order = business.getOrderDirectory().createOrder();
    populateRequestTable(e.getName());

  }//GEN-LAST:event_refreshTestJButtonActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    int selectedRow = workRequestJTable.getSelectedRow();
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(null, "Please select a row");
      return;
    } else {
      Items i = (Items) workRequestJTable.getValueAt(selectedRow, 0);
      order.deleteItem(i);

      JOptionPane.showMessageDialog(null, "Deleted from cart successfully");
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    System.out.println(order.getStatus());
    Enterprise selectedItem = (Enterprise) RestaurantComboBox.getSelectedItem();
    order.setRestaurantName(selectedItem.getName());
    order.setStatus("order placed");
    order.setCustomerNotes(customerNotesTxt.getText());
    order.setCustomerUserName(userAccount.getUsername());
    order.setCustomerName(userAccount.getEmployee().getName());
    order.setCustomerId(userAccount.getEmployee().getId());

    JOptionPane.showMessageDialog(null, "Order placed successfully");

    CustomerBillJPanel panel = new CustomerBillJPanel(userProcessContainer, userAccount, order);
    userProcessContainer.add("CustomerBillJPanel", panel);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    userProcessContainer.remove(this);

  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    userProcessContainer.remove(this);
    layout.previous(userProcessContainer);
  }//GEN-LAST:event_jButton3ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> RestaurantComboBox;
  private javax.swing.JTextField customerNotesTxt;
  private javax.swing.JLabel enterpriseLabel;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton refreshTestJButton;
  private javax.swing.JButton requestTestJButton;
  private javax.swing.JTable workRequestJTable;
  // End of variables declaration//GEN-END:variables
}
