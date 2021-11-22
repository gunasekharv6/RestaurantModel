/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.CityNetwork;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Order;
import Business.Restaurant.OrderStatus;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manojreddy
 */
public class CustomerMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerMainJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Customer customer;
    
    private CityNetwork cityNetwork;
    private Restaurant restaurant;
    
    public CustomerMainJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.customer = (Customer)userAccount;
        initComponents();
        initializeData();
        cityjComboBox.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                cityNetwork = ecoSystem.getCityNetworks().get(cityjComboBox.getSelectedIndex());
                restaurantjComboBox.removeAllItems();
                
                if(cityNetwork.getRestaurantDirectory().getRestaurants().size()>0) {
                    for(Restaurant resta:cityNetwork.getRestaurantDirectory().getRestaurants()) {
                        restaurantjComboBox.addItem(resta.getRestaurantName());
                    }
                    restaurantjComboBox.setSelectedIndex(0);
                    restaurant = cityNetwork.getRestaurantDirectory().getRestaurants().get(0);
                    populateMenuItems();
                }
                
            }
            
        });
        
    }
    
    private void initializeData() {
        
        cityjComboBox.removeAllItems();
        for(CityNetwork cityNetwork:ecoSystem.getCityNetworks()) {
            cityjComboBox.addItem(cityNetwork.getCityName().name());
        }
        cityjComboBox.setSelectedIndex(0);
        
        for(CityNetwork cityNetwork:ecoSystem.getCityNetworks()) {
            if(cityNetwork.getCityName().name().equalsIgnoreCase(cityjComboBox.getItemAt(0))) {
                restaurantjComboBox.removeAllItems();
                for(Restaurant restaurant:cityNetwork.getRestaurantDirectory().getRestaurants()) {
                    restaurantjComboBox.addItem(restaurant.getRestaurantName());
                }
                restaurantjComboBox.setSelectedIndex(0);
            }
        }
        cityNetwork = ecoSystem.getCityNetworks().get(cityjComboBox.getSelectedIndex());
        restaurant = cityNetwork.getRestaurantDirectory().getRestaurants().get(restaurantjComboBox.getSelectedIndex());
        populateMenuItems();
        populateOrderHistory();
        
    }
    
    private void populateOrderHistory() {
        
        DefaultTableModel model = (DefaultTableModel) orderHistoryjTable.getModel();
        model.setRowCount(0);
        int count = 0;
        Double totalCost = 0.0;
        for(Order order:customer.getOrders()){
            count++;
            if(!order.getOrderStatus().name().equalsIgnoreCase(OrderStatus.Decline.name())){
                totalCost+=order.getTotalPrice();
            }
            Object[] row = new Object[8];
            row[0] = count;
            row[1] = order.getCityNetwork().getCityName().name();
            row[2] = order.getRestaurant().getRestaurantName();
            row[3] = order;
            row[4] = order.getCreatedDate();
            row[5] = order.getOrderStatus().name();
            row[6] = order.getCustomerInstructions();
            row[7] = order.getCustomerFeedBack();
            model.addRow(row);
        }
        totalcountjLabel.setText(String.valueOf(customer.getOrders().size()));
        totalSpentCostjLabel.setText(String.valueOf(totalCost));
    }
    
    private void populateMenuItems() {
        
        DefaultTableModel model = (DefaultTableModel) menuItemsjTable.getModel();
        model.setRowCount(0);
        int count = 0; 
        for(MenuItem menuItem:restaurant.getMenuItems()){
            count++;
            Object[] row = new Object[3];
            row[0] = count;
            row[1] = menuItem;
            row[2] = menuItem.getPrice();
            
            model.addRow(row);
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

        headerjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        cityjComboBox = new javax.swing.JComboBox<>();
        cityjLabel1 = new javax.swing.JLabel();
        restaurantjComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderHistoryjTable = new javax.swing.JTable();
        placeOrderjButton = new javax.swing.JButton();
        specialInstructionsjLabel = new javax.swing.JLabel();
        specialInstructionsjTextField = new javax.swing.JTextField();
        headerjLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuItemsjTable = new javax.swing.JTable();
        searchjButton = new javax.swing.JButton();
        totalcountHeaderjLabel = new javax.swing.JLabel();
        totalcountjLabel = new javax.swing.JLabel();
        totalSpentHeaderjLabel = new javax.swing.JLabel();
        totalSpentCostjLabel = new javax.swing.JLabel();
        feedbackjLabel = new javax.swing.JLabel();
        feedbackjTextField = new javax.swing.JTextField();
        submitjButton = new javax.swing.JButton();

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Place Orders");

        cityjLabel.setText("City :");

        cityjLabel1.setText("Restaurant :");

        orderHistoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "City", "Restaurant", "Total Price($)", "Ordered On", "Status", "Instructions", "My Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderHistoryjTable);
        if (orderHistoryjTable.getColumnModel().getColumnCount() > 0) {
            orderHistoryjTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        placeOrderjButton.setText("PlaceOrder");
        placeOrderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderjButtonActionPerformed(evt);
            }
        });

        specialInstructionsjLabel.setText("Special Instructions :");

        headerjLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel1.setText("Orders History");

        menuItemsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serial-No", "Menu Item", "Price($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuItemsjTable);
        if (menuItemsjTable.getColumnModel().getColumnCount() > 0) {
            menuItemsjTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        totalcountHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        totalcountHeaderjLabel.setText("Total Count :");

        totalcountjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        totalcountjLabel.setText("0");

        totalSpentHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        totalSpentHeaderjLabel.setText("Total Spent($) :");

        totalSpentCostjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        totalSpentCostjLabel.setText("0");

        feedbackjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        feedbackjLabel.setText("Give Feedback:");

        submitjButton.setText("Submit");
        submitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(specialInstructionsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(specialInstructionsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(placeOrderjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalcountHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalcountjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(totalSpentHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalSpentCostjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(feedbackjLabel)
                                .addGap(18, 18, 18)
                                .addComponent(feedbackjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(submitjButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(headerjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(182, 182, 182)
                                            .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(106, 106, 106)
                                            .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41)
                                            .addComponent(cityjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(restaurantjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchjButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityjLabel)
                    .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityjLabel1)
                    .addComponent(restaurantjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchjButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeOrderjButton)
                    .addComponent(specialInstructionsjLabel)
                    .addComponent(specialInstructionsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(headerjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalcountHeaderjLabel)
                    .addComponent(totalcountjLabel)
                    .addComponent(totalSpentHeaderjLabel)
                    .addComponent(totalSpentCostjLabel)
                    .addComponent(feedbackjLabel)
                    .addComponent(feedbackjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitjButton))
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        // TODO add your handling code here:
        if(restaurantjComboBox.getSelectedIndex()<0) {
            DefaultTableModel model = (DefaultTableModel) menuItemsjTable.getModel();
            model.setRowCount(0);
            return;
        }
        restaurant = cityNetwork.getRestaurantDirectory().getRestaurants().get(restaurantjComboBox.getSelectedIndex());
        System.out.println(restaurant.getRestaurantName());
        populateMenuItems();
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void placeOrderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderjButtonActionPerformed
        // TODO add your handling code here:
        
        int rowsCount = menuItemsjTable.getSelectedRowCount();
        if(rowsCount==0) {
            JOptionPane.showMessageDialog(this, "Please select at least one Menu Item to order");
            return;
        }
        
        int[] selectedRows = menuItemsjTable.getSelectedRows();
        List<MenuItem>menuItems  =  new ArrayList<>();
        Double totalPrice = 0.0;
        for(int i=0; i< selectedRows.length;i++) {
            menuItems.add((MenuItem) menuItemsjTable.getValueAt(selectedRows[i], 1));
            totalPrice+= menuItems.get(i).getPrice();
        }
        String specialInstructions  = specialInstructionsjTextField.getText();
        
        Order customerOrder = new Order(specialInstructions,"", "", "", customer,null, "", 0,0,
            restaurant, cityNetwork, OrderStatus.OrderPlaced, totalPrice,null, new Date(),new Date(), customer.getName(), customer.getName());
        customerOrder.getMenuItems().addAll(menuItems);
        
        customer.getOrders().add(customerOrder);
        restaurant.getOrders().add(customerOrder);
        specialInstructionsjTextField.setText("");
        populateOrderHistory();
        menuItemsjTable.clearSelection();
    }//GEN-LAST:event_placeOrderjButtonActionPerformed

    private void submitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedOrder = orderHistoryjTable.getSelectedRow();
        if(selectedOrder <0) {
            JOptionPane.showMessageDialog(this, "Please select an Order to give feedback.");
            return;
        }
        if(feedbackjTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Feedback is Empty.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) orderHistoryjTable.getModel();
        Order order = (Order) model.getValueAt(selectedOrder, 3);
        if(!order.getOrderStatus().name().equalsIgnoreCase(OrderStatus.Delivered.name())){
            JOptionPane.showMessageDialog(this, "Order is yet to be Delivered");
            feedbackjTextField.setText("");
            return;
        }
        order.setCustomerFeedBack(feedbackjTextField.getText());
        feedbackjTextField.setText("");
        JOptionPane.showMessageDialog(this, "Feedback Successfully saved");
        populateOrderHistory();
    }//GEN-LAST:event_submitjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityjComboBox;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JLabel cityjLabel1;
    private javax.swing.JLabel feedbackjLabel;
    private javax.swing.JTextField feedbackjTextField;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel headerjLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuItemsjTable;
    private javax.swing.JTable orderHistoryjTable;
    private javax.swing.JButton placeOrderjButton;
    private javax.swing.JComboBox<String> restaurantjComboBox;
    private javax.swing.JButton searchjButton;
    private javax.swing.JLabel specialInstructionsjLabel;
    private javax.swing.JTextField specialInstructionsjTextField;
    private javax.swing.JButton submitjButton;
    private javax.swing.JLabel totalSpentCostjLabel;
    private javax.swing.JLabel totalSpentHeaderjLabel;
    private javax.swing.JLabel totalcountHeaderjLabel;
    private javax.swing.JLabel totalcountjLabel;
    // End of variables declaration//GEN-END:variables
}
