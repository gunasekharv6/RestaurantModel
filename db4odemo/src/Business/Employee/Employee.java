/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Restaurant.Restaurant;
import Business.Role.RestaurantManagerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class Employee{// extends UserAccount{
    
    private String name;
    private UserAccount useraccount;
    private Restaurant restaurant;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
        useraccount = new UserAccount();
        useraccount.setEmployee(this);
    }
    
    public Employee(String name) {
        this.name = name;
        id = count;
        count++;
        useraccount = new UserAccount();
    }
    
    public Employee(String name, String username, String password, Role role) {
        id = count;
        count++;
        useraccount = new UserAccount(username, password, role);
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
