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
public class Customer extends UserAccount{
    private String customerName;
    private String phoneNumber;
//    private String Address;
    private Restaurant restaurant;

    public Customer(String customerName, String phoneNumber, Restaurant restaurant, String username, String password) {
        super(username, password, new CustomerRole());
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
//        this.Address = Address;
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

    @Override
    public Role getRole() {
        return super.getRole(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        return super.getUsername(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    } 
    
    
    
    
    
    
    
//    public String getAddress() {
//        return Address;
//    }
//
//    public void setAddress(String Address) {
//        this.Address = Address;
//    }

    @Override
    public String toString() {
        return this.customerName; //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
}
