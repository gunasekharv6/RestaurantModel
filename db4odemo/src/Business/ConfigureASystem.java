package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.RestaurantEmployee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.SysAdmin.SysAdminDirectory;
import java.util.Date;

/**
 *
 * @author manojreddy
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        system.setSysAdminDirectory(new SysAdminDirectory(new Date(), new Date(), "root", "root"));
        system.getSysAdminDirectory().createSysAdmin("RootUser", "6174351707", "amireddy.m@northeastern.edu", 
                "rootuser", "rootpassword", Role.SysAdmin, new Date(), new Date(), "root", "root");
        
        system.setCustomerDirectory(new CustomerDirectory());
        system.getCustomerDirectory().getCustomers().add(new Customer("manojreddy", "6174351708", "amireddy.m@customer.com", 
                "manojcustomer", "password", Role.Customer, new Date(), new Date(), "root", "root"));
        
        RestaurantDirectory bostonRestaurantDirectory = new RestaurantDirectory();
        bostonRestaurantDirectory.getRestaurants().add(new Restaurant("Popyes", "6789121234", "360 Huntington Avenue", "popyes@gmail.com"));
        
        bostonRestaurantDirectory.getRestaurants().get(0).getRestaurantEmployeeDirectory().getEmployeeList().add(
            new RestaurantEmployee("manojRestaurant", "6174351808", "amireddy.m@restaurant.com", 
                "manojrestaurant", "password", Role.RestaurantAdmin, new Date(), new Date(), "root", "root"));
        
        DeliveryManDirectory bostonDeliveryManDirectory = new DeliveryManDirectory();
        system.getCityNetworks().add(new CityNetwork(CityName.Boston, bostonRestaurantDirectory, bostonDeliveryManDirectory, 
                new Date(), new Date(), "root", "root"));
        
        return system;
    }
    
}
