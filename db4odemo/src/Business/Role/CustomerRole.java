/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.UnnecessaryCustomerAreaJPanel;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    private Customer customer;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        this.customer = new Customer("", "", account.getUsername(), account.getPassword());
        account.setCustomer(customer);
        return new CustomerAreaJPanel(userProcessContainer, account, business);
    }
    
    
}
