/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Organization;
import Business.Role.RestaurantManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant{// extends Organization{
    private String restaurantName;
    private CustomerDirectory custDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    
//    private ArrayList<Role> roles;

    public Restaurant(String name, CustomerDirectory custDirectory) {
        this.restaurantName = name;
        this.custDirectory = custDirectory;
//        this.roles = new ArrayList();
//        this.roles.add(new RestaurantManagerRole());
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public CustomerDirectory getCustDirectory() {
        return custDirectory;
    }

    public void setCustDirectory(CustomerDirectory custDirectory) {
        this.custDirectory = custDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    
//    public ArrayList<Role> getSupportedRole() {
//        return this.roles;
//    }
    
    
    
}
