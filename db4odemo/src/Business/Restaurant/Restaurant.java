/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.RestaurantEmployeeDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunav
 */
public class Restaurant {
    
    private String restaurantName;
    
    private String phoneNo;
    
    private String address;
    
    private String email;
    
    private List<MenuItem> menuItems = new ArrayList<>();
    
    private RestaurantEmployeeDirectory restaurantEmployeeDirectory = new RestaurantEmployeeDirectory();
    
    private List<Order> orders = new ArrayList<>();

    public Restaurant(String restaurantName, String phoneNo, String address, String email) {
        this.restaurantName = restaurantName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public RestaurantEmployeeDirectory getRestaurantEmployeeDirectory() {
        return restaurantEmployeeDirectory;
    }

    public void setRestaurantEmployeeDirectory(RestaurantEmployeeDirectory restaurantEmployeeDirectory) {
        this.restaurantEmployeeDirectory = restaurantEmployeeDirectory;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getRestaurantName(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
