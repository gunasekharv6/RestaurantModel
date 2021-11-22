/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.RestaurantEmployee;
import Business.Restaurant.Restaurant;
import Business.SysAdmin.SysAdmin;

/**
 *
 * @author gunav
 */
public class Validator {
    
    public static boolean checkUserNameAlreadyExists(EcoSystem ecoSystem, String userName) {
        
        for(SysAdmin sysAdmin:ecoSystem.getSysAdminDirectory().getSysAdmins()) {
            if(sysAdmin.getUserName().contentEquals(userName)){
                return true;
            }
        }
        
        for(Customer customer:ecoSystem.getCustomerDirectory().getCustomers()) {
            if(customer.getUserName().contentEquals(userName)) {
                return true;
            }
        }
        
        for(CityNetwork cityNetwork:ecoSystem.getCityNetworks()) {
            for(DeliveryMan deliveryMan:cityNetwork.getDeliveryManDirectory().getDeliveryMan()){
                if(deliveryMan.getUserName().contentEquals(userName)){
                    return true;
                }
            }
            
            for(Restaurant restaurant:cityNetwork.getRestaurantDirectory().getRestaurants()) {
                for(RestaurantEmployee restaurantEmployee:restaurant.getRestaurantEmployeeDirectory().getEmployeeList()) {
                    if(restaurantEmployee.getUserName().contentEquals(userName)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
    
    public static boolean checkEmailAlreadyExists(EcoSystem ecoSystem, String email) {
        
        for(SysAdmin sysAdmin:ecoSystem.getSysAdminDirectory().getSysAdmins()) {
            if(sysAdmin.getEmail().contentEquals(email)){
                return true;
            }
        }
        
        for(Customer customer:ecoSystem.getCustomerDirectory().getCustomers()) {
            if(customer.getEmail().contentEquals(email)) {
                return true;
            }
        }
        
        for(CityNetwork cityNetwork:ecoSystem.getCityNetworks()) {
            for(DeliveryMan deliveryMan:cityNetwork.getDeliveryManDirectory().getDeliveryMan()){
                if(deliveryMan.getEmail().contentEquals(email)){
                    return true;
                }
            }
            
            for(Restaurant restaurant:cityNetwork.getRestaurantDirectory().getRestaurants()) {
                for(RestaurantEmployee restaurantEmployee:restaurant.getRestaurantEmployeeDirectory().getEmployeeList()) {
                    if(restaurantEmployee.getEmail().contentEquals(email)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public static boolean checkPhoneNoAlreadyExists(EcoSystem ecoSystem, String phoneNo) {
        
        for(SysAdmin sysAdmin:ecoSystem.getSysAdminDirectory().getSysAdmins()) {
            if(sysAdmin.getPhoneNo().contentEquals(phoneNo)){
                return true;
            }
        }
        
        for(Customer customer:ecoSystem.getCustomerDirectory().getCustomers()) {
            if(customer.getPhoneNo().contentEquals(phoneNo)) {
                return true;
            }
        }
        
        for(CityNetwork cityNetwork:ecoSystem.getCityNetworks()) {
            for(DeliveryMan deliveryMan:cityNetwork.getDeliveryManDirectory().getDeliveryMan()){
                if(deliveryMan.getPhoneNo().contentEquals(phoneNo)){
                    return true;
                }
            }
            
            for(Restaurant restaurant:cityNetwork.getRestaurantDirectory().getRestaurants()) {
                for(RestaurantEmployee restaurantEmployee:restaurant.getRestaurantEmployeeDirectory().getEmployeeList()) {
                    if(restaurantEmployee.getPhoneNo().contentEquals(phoneNo)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }    
    
}
