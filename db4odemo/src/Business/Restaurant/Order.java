/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.CityNetwork;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.RestaurantEmployee;
import Business.ModificationInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class Order extends ModificationInfo{
    
    private List<MenuItem> menuItems = new ArrayList<>();
    
    private String customerInstructions;
    
    private String customerFeedBack;
    
    private String managerFeedback;
    
    private String deliveryPersonFeedback;
    
    private Customer orderedBy;
    
    private RestaurantEmployee assignedBy;
    
    private String address;
    
    private int customerDeliveryRating;
    
    private int deliveryPersonCustomerRating;
    
    private Restaurant restaurant;
    
    private CityNetwork cityNetwork;
    
    private Double totalPrice;
    
    private OrderStatus orderStatus;
    
    private DeliveryMan deliveryMan;

    public Order(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    public Order(String customerInstructions, String customerFeedBack, String managerFeedback, String deliveryPersonFeedback, Customer orderedBy, RestaurantEmployee assignedBy, String address, 
            int customerDeliveryRating, int deliveryPersonCustomerRating, Restaurant restaurant, CityNetwork cityNetwork, OrderStatus orderStatus, Double totalPrice, DeliveryMan deliveryMan,
            Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.customerInstructions = customerInstructions;
        this.customerFeedBack = customerFeedBack;
        this.managerFeedback = managerFeedback;
        this.deliveryPersonFeedback = deliveryPersonFeedback;
        this.orderedBy = orderedBy;
        this.assignedBy = assignedBy;
        this.address = address;
        this.customerDeliveryRating = customerDeliveryRating;
        this.deliveryPersonCustomerRating = deliveryPersonCustomerRating;
        this.restaurant = restaurant;
        this.cityNetwork = cityNetwork;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
        this.deliveryMan = deliveryMan;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getCustomerInstructions() {
        return customerInstructions;
    }

    public void setCustomerInstructions(String customerInstructions) {
        this.customerInstructions = customerInstructions;
    }

    public String getCustomerFeedBack() {
        return customerFeedBack;
    }

    public void setCustomerFeedBack(String customerFeedBack) {
        this.customerFeedBack = customerFeedBack;
    }

    public String getManagerFeedback() {
        return managerFeedback;
    }

    public void setManagerFeedback(String managerFeedback) {
        this.managerFeedback = managerFeedback;
    }

    public String getDeliveryPersonFeedback() {
        return deliveryPersonFeedback;
    }

    public void setDeliveryPersonFeedback(String deliveryPersonFeedback) {
        this.deliveryPersonFeedback = deliveryPersonFeedback;
    }

    public Customer getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(Customer orderedBy) {
        this.orderedBy = orderedBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerDeliveryRating() {
        return customerDeliveryRating;
    }

    public void setCustomerDeliveryRating(int customerDeliveryRating) {
        this.customerDeliveryRating = customerDeliveryRating;
    }

    public int getDeliveryPersonCustomerRating() {
        return deliveryPersonCustomerRating;
    }

    public void setDeliveryPersonCustomerRating(int deliveryPersonCustomerRating) {
        this.deliveryPersonCustomerRating = deliveryPersonCustomerRating;
    }

    public RestaurantEmployee getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(RestaurantEmployee assignedBy) {
        this.assignedBy = assignedBy;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public CityNetwork getCityNetwork() {
        return cityNetwork;
    }

    public void setCityNetwork(CityNetwork cityNetwork) {
        this.cityNetwork = cityNetwork;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    @Override
    public String toString() {
        return String.valueOf(getTotalPrice());
    }
    
}
