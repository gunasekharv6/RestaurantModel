/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gunav
 */
public class MasterUserAccountDirectory {
    
    private ArrayList<UserAccount> masterUserAccountList;

    public MasterUserAccountDirectory() {
        this.masterUserAccountList = new ArrayList();
        this.masterUserAccountList.add(new UserAccount("sysadmin", "sysadmin", new SystemAdminRole()));
        this.masterUserAccountList.add(new UserAccount("user1", "user1", new CustomerRole()));
    }
    

//    public UserAccountDirectory() {
//        
//    }

    public ArrayList<UserAccount> getMasterUserAccountList() {
        return this.masterUserAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : this.masterUserAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        if (checkIfUsernameIsUnique(username)){
            UserAccount userAccount = new UserAccount();
            userAccount.setUsername(username);
            userAccount.setPassword(password);
            userAccount.setRole(role);
            this.masterUserAccountList.add(userAccount);
            return userAccount;
        }else{
            JOptionPane.showMessageDialog(null, "Username already exists\nEnter a new username");
            return null;
        }
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : this.masterUserAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
