/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Order;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class DeliveryMan extends UserAccount{
    
    private List<Order> orders = new ArrayList<>();

    public DeliveryMan(String name, String phoneNo, String email, String userName, String password, Role role, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(name, phoneNo, email, userName, password, role, createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
