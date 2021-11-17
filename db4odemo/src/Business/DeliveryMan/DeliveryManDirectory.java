/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private List<DeliveryMan> deliveryManList = new ArrayList<DeliveryMan>();
    
    
    
    public int checkIfDeliveryManExists(DeliveryMan deliveryman){
        for (deliveryman dm : this.deliveryManList){
            if (cu.getCustomerName().equals(customername))
                return this.customerlist.indexOf(cu);
        }
        return -1;
    }
}
