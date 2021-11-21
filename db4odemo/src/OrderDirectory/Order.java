/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderDirectory;


import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Item;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import static java.lang.Integer.toString;
import java.util.ArrayList;

/**
 *
 * @author braya
 */
public class Order {
    private int orderId;
    private static int counter=1;
    private Restaurant restaurant;
    private String status;
    private DeliveryMan deliveryMan;
    private UserAccount deliveryManUseraccount;
    private int customerId;
    private int deliveryManId;
    private Customer customer;
    private ArrayList<Item> itemsList;
    private String customerNotes;
    private String feedback;
    
    public Order() {
        orderId = counter;
        ++counter;
        itemsList=new ArrayList<Item>();
        status = "N/A";
    }
    
    
    public String getOrderPrice(){
        int price = 0;
        for (Item i : itemsList){
            price = price + i.getPrice();
        }
        return String.valueOf(price);
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getDeliveryManId() {
        return deliveryManId;
    }

    public void setDeliveryManId(int deliveryManId) {
        this.deliveryManId = deliveryManId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    public UserAccount getDeliveryManUseraccount() {
        return deliveryManUseraccount;
    }


    public void setDeliveryManUseraccount(UserAccount deliveryManUseraccount) {
        this.deliveryManUseraccount = deliveryManUseraccount;
    }

    
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.addOrder(this);
    }

      
      
    public ArrayList<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        restaurant.addOrder(this);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
        deliveryMan.addOrder(this);
    }


    public Item addItem(){
        Item item = new Item(); 
        itemsList.add(item);
        return item;
    } 
      
      public void deleteItem(Item item){
        itemsList.remove(item); 
    }
    @Override
    public String toString() {
        return Integer.toString(this.orderId);
    }
}
