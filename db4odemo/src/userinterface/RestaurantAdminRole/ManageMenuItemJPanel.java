/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gunav
 */
public class ManageMenuItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagaeMenuItemJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Restaurant restaurant;
    
    public ManageMenuItemJPanel(JPanel userProcessContainer, UserAccount userAccount, Restaurant restaurant) {
        this.userProcessContainer = userProcessContainer;
        this.restaurant = restaurant;
        this.userAccount = userAccount;
        initComponents();
        populateMenuItems();
    }
    
    public void populateMenuItems() {
        
        DefaultTableModel model = (DefaultTableModel) tblMenuItemsList.getModel();
        model.setRowCount(0);
        int count = 0;
        for(MenuItem menuItem:restaurant.getMenuItems()){
            count++;
            Object[] row = new Object[7];
            row[0] = count;
            row[1] = menuItem;
            row[2] = menuItem.getPrice();
            row[3] = menuItem.getCreatedBy();
            row[4] = menuItem.getCreatedDate();
            row[5] = menuItem.getModifiedBy();
            row[6] = menuItem.getLastUpdatedDate();
            
            model.addRow(row);
        }
        totalCountjLabel.setText(String.valueOf(restaurant.getMenuItems().size()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        backButtonjButton = new javax.swing.JButton();
        headerjLabel = new javax.swing.JLabel();
        deliveryPersonsjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenuItemsList = new javax.swing.JTable();
        totalCountHeaderjLabel = new javax.swing.JLabel();
        totalCountjLabel = new javax.swing.JLabel();

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCreate.setText("Create >");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        backButtonjButton.setText("< < Back");
        backButtonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonjButtonActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Manage Menu Items");

        deliveryPersonsjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        deliveryPersonsjLabel.setText("MenuItems List");

        tblMenuItemsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Item Name", "Price Per-dish ($)", "Created By", "Created Date", "Last Modified By", "Last Modified Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMenuItemsList);
        if (tblMenuItemsList.getColumnModel().getColumnCount() > 0) {
            tblMenuItemsList.getColumnModel().getColumn(0).setResizable(false);
            tblMenuItemsList.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        totalCountHeaderjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        totalCountHeaderjLabel.setText("Total Count :");

        totalCountjLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        totalCountjLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButtonjButton)
                        .addGap(170, 170, 170)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deliveryPersonsjLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(totalCountHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(totalCountjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButtonjButton)
                    .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(deliveryPersonsjLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCountHeaderjLabel)
                    .addComponent(totalCountjLabel))
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenuItemsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            MenuItem selectedDeliveryPerson = (MenuItem) tblMenuItemsList.getValueAt(selectedRow, 1);
            restaurant.getMenuItems().remove(selectedDeliveryPerson);
            JOptionPane.showMessageDialog(null, "Menu-Item deleted successfully");

            populateMenuItems();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateMenuItemJPanel panel = new CreateMenuItemJPanel(userProcessContainer, userAccount, restaurant);
        //          userProcessContainer.remove(this);
        userProcessContainer.add("CreateNewMenuItemJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed
 
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenuItemsList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            MenuItem selectedMenuItem = (MenuItem) tblMenuItemsList.getValueAt(selectedRow, 1);
            UpdateMenuItemJPanel updateMenuItemJPanel = new UpdateMenuItemJPanel(userProcessContainer,selectedMenuItem,userAccount);
            userProcessContainer.add("UpdateMenuItemJPanel", updateMenuItemJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void backButtonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonjButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonjButton;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel deliveryPersonsjLabel;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenuItemsList;
    private javax.swing.JLabel totalCountHeaderjLabel;
    private javax.swing.JLabel totalCountjLabel;
    // End of variables declaration//GEN-END:variables
}
