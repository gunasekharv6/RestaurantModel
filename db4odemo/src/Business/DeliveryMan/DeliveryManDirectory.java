/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private List<DeliveryMan> deliveryManList = new ArrayList<DeliveryMan>();
    
    
    
    public int checkIfDeliveryManExists(DeliveryMan deliveryman){
        for (DeliveryMan dm : this.deliveryManList){
            if (dm.getDeliveryManName().equalsIgnoreCase(deliveryman.getDeliveryManName())){
                return this.deliveryManList.indexOf(dm);
            }
                
        }
        return -1;
    }
    
    public boolean addDeliveryMan(DeliveryMan deliveryman){
        if(checkIfDeliveryManExists(deliveryman) == -1){
            deliveryManList.add(deliveryman);
            //super.createUserAccount(customer.getUsername(), customer.getPassword(), customer.getRole());
            JOptionPane.showMessageDialog(null, "Deliveryman is added successfully");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Error!\nDeliveryman is already present in the Deliveryman directory");
            return false;
        } 
    }
    
    public boolean deleteDeliveryMan(DeliveryMan deliveryman){
        int index = checkIfDeliveryManExists(deliveryman);
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Error!\nDeliveryman not present in the Deliveryman directory");
            return false;
        }else{
            this.deliveryManList.remove(index);
            //super.deleteUserAccount(customer.getUsername());
            JOptionPane.showMessageDialog(null, "Deliveryman deleted successfully");
            return true;
        } 
    }

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    
}
