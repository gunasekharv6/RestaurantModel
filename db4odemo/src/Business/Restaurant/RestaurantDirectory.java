/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private static List<Restaurant> restaurantList = new ArrayList<Restaurant>();

    public static boolean addRestaurant(Restaurant restaurant){
        if(checkIfRestaurantnameIsUnique(restaurant.getRestaurantName())){
            restaurantList.add(restaurant);
            JOptionPane.showMessageDialog(null, "Restaurant is added successfully");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Error!\nRestaurant is already present in the Restaurant directory");
            return false;
        }        
    }
    
    
    public static List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public static void setRestaurantList(List<Restaurant> restaurantList) {
        RestaurantDirectory.restaurantList = restaurantList;
    }
    
    public static boolean checkIfRestaurantnameIsUnique(String restaurantname){
        for (Restaurant ra : restaurantList){
            if (ra.getRestaurantName().equals(restaurantname))
                return false;
        }
        return true;
    }
    
}
