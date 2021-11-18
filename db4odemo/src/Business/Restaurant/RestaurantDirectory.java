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
    private List<Restaurant> restaurantList = new ArrayList<Restaurant>();

    public boolean addRestaurant(Restaurant restaurant){
        if(checkIfRestaurantnameIsUnique(restaurant.getRestaurantName())){
            restaurantList.add(restaurant);
            //JOptionPane.showMessageDialog(null, "Restaurant is added successfully");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Error!\nRestaurant is already present in the Restaurant directory");
            return false;
        }        
    }
    
    
    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public boolean checkIfRestaurantnameIsUnique(String restaurantname){
        for (Restaurant ra : restaurantList){
            if (ra.getRestaurantName().equals(restaurantname))
                return false;
        }
        return true;
    }
    
    public int checkIfRestaurantExists(String restaurantname){
        for (Restaurant ra : restaurantList){
            if (ra.getRestaurantName().equalsIgnoreCase(restaurantname))
                return restaurantList.indexOf(ra);
        }
        return -1;
    }
    
}
