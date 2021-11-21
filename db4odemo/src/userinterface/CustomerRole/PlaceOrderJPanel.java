/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Business.EcoSystem;
import OrderDirectory.Order;
import Business.Organization;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;

/**
 * @author raunak
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

  private JPanel userProcessContainer;
  private UserAccount userAccount;
  private EcoSystem system;
  private Organization organization;
  private Order order;
  private int ctr;
  private Customer customer;
  private Restaurant restaurant;

  public PlaceOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
    initComponents();
    this.ctr = 0;
    this.userProcessContainer = userProcessContainer;
    this.userAccount = account;
    this.system = system;
    this.organization = organization;
    this.customer = account.getCustomer();
    txtcustomername.setText(customer.getCustomerName());
//    this.order = customer.createOrder();
    this.order = new Order();
    populateComboBox();
  }

  public void populateComboBox() {
    DefaultComboBoxModel dm = new DefaultComboBoxModel();
    for (Restaurant rs : system.getRestaurantDirectory().getRestaurantList()){
      dm.addElement(rs);
    }
    cbmboxselectrestaurant.setModel(dm);
  }

  public void populateRequestTable(String restaurantName) {
    DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
    dtm.setRowCount(0);
    for (Restaurant rs : system.getRestaurantDirectory().getRestaurantList()) {
      if (rs.getName().equals(restaurantName)) {
        this.restaurant = rs;
        for (Item item : rs.getItemsList()) {
          Object row[] = new Object[2];
          row[0] = item;
          row[1] = item.getPrice();
          dtm.addRow(row);
        }
      }
    }
  }
  
    public void populateCarttTable() {
    DefaultTableModel dtm2 = (DefaultTableModel) tblcart.getModel();
    dtm2.setRowCount(0);
    int price=0;
    Object row[] = new Object[2];
    for (Item item : this.order.getItemsList()){
        row[0] = item;
        row[1] = item.getPrice();
        price= price+item.getPrice();
        dtm2.addRow(row);
    }
    lbltotalprice.setText(String.valueOf(price));
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnaddtocart = new javax.swing.JButton();
        btnsearchmenu = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btndeletefromcart = new javax.swing.JButton();
        btnplaceorder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbmboxselectrestaurant = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtcustomerNotes = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lbltotalprice = new javax.swing.JLabel();
        lblcustomername = new javax.swing.JLabel();
        txtcustomername = new javax.swing.JTextField();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        btnaddtocart.setText("Add to cart");
        btnaddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddtocartActionPerformed(evt);
            }
        });

        btnsearchmenu.setText("Search Menu");
        btnsearchmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchmenuActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Order Placing");

        btndeletefromcart.setText("Delete from cart");
        btndeletefromcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletefromcartActionPerformed(evt);
            }
        });

        btnplaceorder.setText("Place order");
        btnplaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaceorderActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Restaurant :");

        cbmboxselectrestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmboxselectrestaurantActionPerformed(evt);
            }
        });

        jLabel2.setText("Any message to restaurant?");

        btnback.setText("back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        tblcart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblcart);
        if (tblcart.getColumnModel().getColumnCount() > 0) {
            tblcart.getColumnModel().getColumn(0).setResizable(false);
            tblcart.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cart");

        lbltotal.setText("Total:");

        lblcustomername.setText("Customer Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btnsearchmenu)
                        .addGap(277, 277, 277))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(btnplaceorder)
                            .addGap(168, 168, 168)
                            .addComponent(btndeletefromcart)
                            .addGap(105, 105, 105)
                            .addComponent(btnaddtocart))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(cbmboxselectrestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnback)
                                    .addGap(138, 138, 138)
                                    .addComponent(enterpriseLabel)
                                    .addGap(208, 208, 208)
                                    .addComponent(lblcustomername)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(120, 120, 120)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtcustomerNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(171, 171, 171)
                                            .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbltotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnsearchmenu, txtcustomername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblcustomername)
                        .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnback))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbmboxselectrestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnsearchmenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcustomerNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotal)
                    .addComponent(lbltotalprice))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddtocart)
                    .addComponent(btndeletefromcart)
                    .addComponent(btnplaceorder))
                .addGap(63, 63, 63))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnsearchmenu, jLabel3, lblcustomername, txtcustomername});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnaddtocart, lbltotal, lbltotalprice});

    }// </editor-fold>//GEN-END:initComponents

  private void btnaddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddtocartActionPerformed


    int selectedRow = workRequestJTable.getSelectedRow();
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(null, "Please select a row");
      return;
    } else {
      
      //order.setRestaurant(restaurant);
      Item i = (Item) workRequestJTable.getValueAt(selectedRow, 0);
      
      //this.customer.addOrder(order);
      //this.restaurant.addOrder(order);
      Item item = order.addItem();
      item.setItemName(i.getItemName());
      item.setPrice(i.getPrice());
      populateCarttTable();
      
      JOptionPane.showMessageDialog(null, "Added to cart successfully");
    }

  }//GEN-LAST:event_btnaddtocartActionPerformed

  private void btnsearchmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchmenuActionPerformed
    Restaurant rs = (Restaurant) cbmboxselectrestaurant.getSelectedItem();
    this.restaurant = rs;

    if (rs.getName() == null || rs.getName() == "") {
        JOptionPane.showMessageDialog(null, "No restaurants are available at the moment");
        return;
    }

    JOptionPane.showMessageDialog(null, "As the restaurant has been changed, the cart is cleared");
    //order = system.getOrderDirectory().createOrder();
    populateRequestTable(rs.getName());

  }//GEN-LAST:event_btnsearchmenuActionPerformed

  private void btndeletefromcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletefromcartActionPerformed
    // TODO add your handling code here:
    int selectedRow = tblcart.getSelectedRow();
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(null, "Please select a row from Cart");
      return;
    } else {
      Item i = (Item) tblcart.getValueAt(selectedRow, 0);
      order.deleteItem(i);
      populateCarttTable();

      JOptionPane.showMessageDialog(null, "Item deleted from cart successfully");
    }
  }//GEN-LAST:event_btndeletefromcartActionPerformed

  private void btnplaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaceorderActionPerformed
    // TODO add your handling code here:
    //System.out.println(order.getStatus());
      //System.out.println(customer.getCustomerName().isBlank());
      customer.setCustomerName(txtcustomername.getText());
//    txtcustomername.setText(customer.getCustomerName());
    if (customer.getCustomerName().isBlank()){
        JOptionPane.showMessageDialog(this, "Please Enter your name");
        return;
    }
//    Restaurant selectedItem = (Restaurant) cbmboxselectrestaurant.getSelectedItem();
//    this.restaurant = selectedItem;
    
    order.setRestaurant(restaurant);
    //restaurant.addOrder(order);
//    order.setRestaurant(restaurant);
    order.setStatus("order placed");
    order.setCustomerNotes(txtcustomerNotes.getText());
    
    order.setCustomer(customer);
    //customer.addOrder(order);
//    order.setCustomerId(userAccount.getEmployee().getId());

    JOptionPane.showMessageDialog(null, "Order placed successfully");
    txtcustomerNotes.removeAll();
      //System.out.println(userAccount.getCustomer().getOrderList().get(0).getItemsList().get(0));

//    CustomerBillJPanel panel = new CustomerBillJPanel(userProcessContainer, userAccount, order);
//    userProcessContainer.add("CustomerBillJPanel", panel);
//    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//    layout.next(userProcessContainer);
//    userProcessContainer.remove(this);

  }//GEN-LAST:event_btnplaceorderActionPerformed

  private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
    // TODO add your handling code here:
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    userProcessContainer.remove(this);
    layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnbackActionPerformed

    private void cbmboxselectrestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmboxselectrestaurantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmboxselectrestaurantActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddtocart;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndeletefromcart;
    private javax.swing.JButton btnplaceorder;
    private javax.swing.JButton btnsearchmenu;
    private javax.swing.JComboBox<String> cbmboxselectrestaurant;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcustomername;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltotalprice;
    private javax.swing.JTable tblcart;
    private javax.swing.JTextField txtcustomerNotes;
    private javax.swing.JTextField txtcustomername;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
