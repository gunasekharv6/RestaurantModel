/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerMainJPanel;
import userinterface.DeliveryManRole.DeliveryManMainJPanel;
import userinterface.RestaurantAdminRole.RestaurantAdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author manojreddy
 */
public class JpanelManager {
    
    public static JPanel getMasterPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userLogged){
        
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecoSystem, userLogged);
    }
    
    public static JPanel getRestaurantManagerPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userLogged,
        Restaurant restaurant, CityNetwork cityNetwork) {
        
        return new RestaurantAdminWorkAreaJPanel( userProcessContainer, ecoSystem, userLogged,restaurant,cityNetwork);
    }
    
    public static JPanel getCustomerMainPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userAccount){
        
        return new CustomerMainJPanel(userProcessContainer, ecoSystem, userAccount);
    }
    
    public static JPanel getDeliveryManMainPanel(JPanel userProcessContainer, EcoSystem ecoSystem, CityNetwork cityNetwork, UserAccount userAccount) {
        
        return new DeliveryManMainJPanel(userProcessContainer, ecoSystem,cityNetwork, userAccount);
    }
    
}
