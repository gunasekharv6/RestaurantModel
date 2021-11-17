/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer{ //extends UserAccount{
    private String customerName;
    private String phoneNumber;
//    private String Address;
    private Restaurant restaurant;
    private UserAccount useraccount;

    public Customer(String customerName, String phoneNumber, Restaurant restaurant, String username, String password) {
        
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
//        this.Address = Address;
        this.restaurant = restaurant;
        useraccount = new UserAccount(username, password, new CustomerRole());
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


//    public String getPassword() {
//        return useraccount.getPassword(); //To change body of generated methods, choose Tools | Templates.
//    }
//
//
//    public String getUsername() {
//        return useraccount.getUsername(); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    
    
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
        return this.customerName; //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
}
