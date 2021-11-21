/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import OrderDirectory.Order;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Customer{ //extends UserAccount{
    private String customerName;
    private String phoneNumber;
//    private String Address;
    private Restaurant restaurant;
    private List<Restaurant> restaurantList;
    private UserAccount useraccount;
    private List<Order> orderList;

    public Customer(String customerName, String phoneNumber, Restaurant restaurant, String username, String password) {
        
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
//        this.Address = Address;
        this.restaurantList = new ArrayList<Restaurant>();
        useraccount = new UserAccount(username, password, new CustomerRole());
        useraccount.setCustomer(this);
        this.orderList = new ArrayList<Order>();
        this.restaurant = restaurant;
        this.restaurantList = new ArrayList<Restaurant>();
    }
    
    public Customer(String customerName, String phoneNumber, String username, String password) {
        
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        useraccount = new UserAccount(username, password, new CustomerRole());
        useraccount.setCustomer(this);
        this.orderList = new ArrayList<Order>();
        this.restaurantList = new ArrayList<Restaurant>();
    }
    
    public void addOrder(Order order){
        this.orderList.add(order);
    }
    
    public Order createOrder(){
        Order order = new Order();
        orderList.add(order);
        return order;
    }
    
    public void deleteOrder(Order order){
        this.orderList.remove(order);
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Role getRole() {
        return useraccount.getRole(); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    
    
//    public Restaurant getRestaurant() {
//        return restaurant;
//    }
//
//    public void setRestaurant(Restaurant restaurant) {
//        this.restaurant = restaurant;
//    } 

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
    
    @Override
    public String toString() {
        return this.customerName; //To change body of generated methods, choose Tools | Templates.
    }
}
