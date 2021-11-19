/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

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

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CustomerAreaJPanel(userProcessContainer, account, business);
    }
    
    
}
