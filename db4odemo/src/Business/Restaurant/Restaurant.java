/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Organization;
import Business.Role.RestaurantManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant extends Organization{
//    private String restaurantName;
    private String address;

    private String cuisineType;
    
    private ArrayList<Role> supportedRoles;

    public Restaurant(String name, String managerName) {
        super(name);
        super.getEmployeeDirectory().getEmployeeList().add(0, new Employee(managerName));
        supportedRoles = new ArrayList();
        this.supportedRoles.add(new RestaurantManagerRole());
//        this.restaurantName = name;
//        this.roles
    }
    
    public Employee getManager(){
        return super.getEmployeeDirectory().getEmployeeList().get(0);
    }
    
    public void setManager(Employee manager){
        super.getEmployeeDirectory().getEmployeeList().set(0, manager);
    }

    public String getRestaurantName() {
        return super.getName();
    }

    public void setRestaurantName(String restaurantName) {
        super.setName(restaurantName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Role> getSupportedRoles() {
        return supportedRoles;
    }

    public void setSupportedRoles(ArrayList<Role> supportedRoles) {
        this.supportedRoles = supportedRoles;
    }
    
    

    @Override
    public CustomerDirectory getCustDirectory() {
        return super.getCustDirectory();
    }

    @Override
    public void setCustDirectory(CustomerDirectory custDirectory) {
        super.setCustDirectory(custDirectory);
    }

    @Override
    public DeliveryManDirectory getDeliveryManDirectory() {
        return super.getDeliveryManDirectory();
    }

    @Override
    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        super.setDeliveryManDirectory(deliveryManDirectory);
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }    
}
