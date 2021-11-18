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

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String deliveryManName;
    private String phoneNumber;
//    private String Address;
    private Restaurant restaurant;
    private UserAccount useraccount;

    public DeliveryMan(String name, String username, String password) {
        this.deliveryManName = name;
//        this.phoneNumber = phoneNumber;
//        this.Address = Address;
//        this.restaurant = restaurant;
        useraccount = new UserAccount(username, password, new DeliverManRole());
        useraccount.setDeliverman(this);
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
    
    
}
