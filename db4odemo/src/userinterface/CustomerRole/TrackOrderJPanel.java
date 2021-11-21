/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import OrderDirectory.Order;
import Business.Organization;
import Business.UserAccount.UserAccount;
//import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class TrackOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    private Customer customer;
    
    public TrackOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.customer = userAccount.getCustomer();
        this.system = business;
        System.out.println("Inside TrackOrderJPanel"+ userAccount.getUsername());
        populateCurrentOrdersTable();
        populateOrderHistoryTable();
    }

    public void populateCurrentOrdersTable(){
        DefaultTableModel dtm = (DefaultTableModel) CurrentOrdersTable.getModel();
        dtm.setRowCount(0);
//        System.out.println("Inside populateCurrentOrdersTable" + customer.getCustomerName());
//        System.out.println(customer.getOrderList().get(0));
        
        for(Order o : customer.getOrderList()){
         if(o.getCustomer()!=null && !(o.getStatus().equals("order received")))
         {
            Object row[] = new Object[6];
            row[0] = o;
            row[1] = o.getRestaurant();
            row[2] = o.getItemsList().size();
            row[3] = o.getItemsList().get(0).getItemName();
            row[4] = o.getOrderPrice();
            row[5] = o.getStatus();
            dtm.addRow(row);
         }
        }        
    }
    
     public void populateOrderHistoryTable(){
        DefaultTableModel dtm = (DefaultTableModel) orderHistoryTable.getModel();
        dtm.setRowCount(0);
        for(Order o : customer.getOrderList())
        {
         if(o.getCustomer()!=null&&o.getCustomer().equals(userAccount.getUsername()) && o.getStatus().equals("order received"))
         {
            Object row[] = new Object[6];
            row[0] = o;
            row[1] = o.getRestaurant();
            row[2] = o.getItemsList().size();
            row[3] = o.getItemsList().get(0).getItemName();
            row[4] = o.getOrderPrice();
            row[5] = o.getStatus();
            dtm.addRow(row);
            }
    
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

        jScrollPane1 = new javax.swing.JScrollPane();
        orderHistoryTable = new javax.swing.JTable();
        cancelBtn = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CurrentOrdersTable = new javax.swing.JTable();
        lblorderhistory = new javax.swing.JLabel();
        btnismyorderdelivered = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Restaurant Name", "No of order items", "Sample Order items", "Order cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderHistoryTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 950, 96));

        cancelBtn.setText("Cancel Order");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btnback.setText("back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setText("Current Orders");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        CurrentOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Restaurant Name", "No of order items", "Sample Order items", "Order cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CurrentOrdersTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 950, 96));

        lblorderhistory.setText("Order history");
        add(lblorderhistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        btnismyorderdelivered.setText("Is my order delivered?");
        btnismyorderdelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnismyorderdeliveredActionPerformed(evt);
            }
        });
        add(btnismyorderdelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = CurrentOrdersTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
        Order o = (Order)CurrentOrdersTable.getValueAt(selectedRow,0 );        
        customer.deleteOrder(o);
        JOptionPane.showMessageDialog(null, "Order deleted successfully");
       populateCurrentOrdersTable();
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnismyorderdeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnismyorderdeliveredActionPerformed
        // TODO add your handling code here:
         int selectedRow = CurrentOrdersTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Order o = (Order)CurrentOrdersTable.getValueAt(selectedRow,0 );
         if (!o.getStatus().equals("delivered")) {
            JOptionPane.showMessageDialog(null, "This order is not yet delivered..!");
            return;
        }
        o.setStatus("order received");
        
       populateCurrentOrdersTable();
       populateOrderHistoryTable();
        
    }//GEN-LAST:event_btnismyorderdeliveredActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CurrentOrdersTable;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnismyorderdelivered;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblorderhistory;
    private javax.swing.JTable orderHistoryTable;
    // End of variables declaration//GEN-END:variables
}