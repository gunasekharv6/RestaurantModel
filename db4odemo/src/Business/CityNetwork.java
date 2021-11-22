/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class CityNetwork extends ModificationInfo{
    
    private CityName cityName;
        
    private RestaurantDirectory restaurantDirectory = new RestaurantDirectory();
    
    private DeliveryManDirectory deliveryManDirectory = new DeliveryManDirectory();

    public CityNetwork(CityName cityName, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.cityName = cityName;
        this.restaurantDirectory = restaurantDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public CityNetwork(CityName cityName, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.cityName = cityName;
    }
    
    public CityName getCityName() {
        return cityName;
    }

    public void setCityName(CityName cityName) {
        this.cityName = cityName;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
}
