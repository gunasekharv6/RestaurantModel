/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Restaurant;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import OrderDirectory.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String deliveryManName;
    private String phoneNumber;
    private String Address;
    private Restaurant restaurant;
    private UserAccount useraccount;
    private int id;
    private static int count = 1;
    private ArrayList<Order> orderList;

    public DeliveryMan(String name, String username, String password, Restaurant restaurant) {
        id = count;
        count++;
        this.deliveryManName = name;
        this.phoneNumber = "";
//        this.Address = Address;
        this.restaurant = restaurant;
        useraccount = new UserAccount(username, password, new DeliverManRole());
        useraccount.setDeliverman(this);
        orderList = new ArrayList<Order>();
    }
    
    
    public DeliveryMan(String name, String username, String password) {
        id = count;
        count++;
        this.deliveryManName = name;
        this.phoneNumber = "";
//        this.Address = Address;
        useraccount = new UserAccount(username, password, new DeliverManRole());
        useraccount.setDeliverman(this);
        orderList = new ArrayList<Order>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void addOrder(Order order){
        this.orderList.add(order);
        order.setDeliveryMan(this);
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
        
    
    public String getDeliveryManName() {
        return this.deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


//    public Role getRole() {
//        return useraccount.getRole(); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public String getPassword() {
//        return useraccount.getPassword(); //To change body of generated methods, choose Tools | Templates.
//    }
//
//
//    public String getUsername() {
//        return useraccount.getUsername(); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    @Override
    public String toString() {
        return getDeliveryManName();
    }
    
    
}
