/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author harold
 */
public class CustomerDirectory {//extends UserAccountDirectory{
    private List<Customer> customerlist;

    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }
    
    public boolean addCustomer(Customer customer){
        if(checkIfcustomernameExists(customer.getCustomerName()) == -1){
            customerlist.add(customer);
            //super.createUserAccount(customer.getUsername(), customer.getPassword(), customer.getRole());
            JOptionPane.showMessageDialog(null, "Customer is added successfully");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Error!\nCustomer is already present in the Customer directory");
            return false;
        } 
    }
    
    public boolean deleteCustomer(Customer customer){
        int index = checkIfcustomernameExists(customer.getCustomerName());
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Error!\nCustomer not present in the Customer directory");
            return false;
        }else{
            customerlist.remove(index);
            //super.deleteUserAccount(customer.getUsername());
            JOptionPane.showMessageDialog(null, "Error!\nCustomer deleted successfully");
            return true;
        } 
    }
    
    public int checkIfcustomernameExists(String customername){
        for (Customer cu : this.customerlist){
            if (cu.getCustomerName().equals(customername))
                return this.customerlist.indexOf(cu);
        }
        return -1;
    }

    public List<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(List<Customer> customerlist) {
        this.customerlist = customerlist;
    }
}
