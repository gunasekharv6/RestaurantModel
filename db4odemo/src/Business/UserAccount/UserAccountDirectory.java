/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList = new ArrayList();
    

//    public UserAccountDirectory() {
//        
//    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : this.userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
//    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
//        UserAccount userAccount = new UserAccount();
//        userAccount.setUsername(username);
//        userAccount.setPassword(password);
//        userAccount.setEmployee(employee);
//        userAccount.setRole(role);
//        this.userAccountList.add(userAccount);
//        return userAccount;
//    }
    public UserAccount createUserAccount(String username, String password, Role role){
        if (checkIfUsernameExists(username)>=0){
            JOptionPane.showMessageDialog(null, "Error!\nUser already exists in the UserAccount directory");
            return null;
        }else{
            UserAccount userAccount = new UserAccount();
            userAccount.setUsername(username);
            userAccount.setPassword(password);
            userAccount.setRole(role);
            this.userAccountList.add(userAccount);
            return userAccount;
        }
    }
    
    public boolean deleteUserAccount(String username){
        int index = checkIfUsernameExists(username);
        
        if (index == -1){
            JOptionPane.showMessageDialog(null, "Error!\nUser doesnt' exist in the UserAccount directory");
            return false;
        }else{
            this.userAccountList.remove(index);
            JOptionPane.showMessageDialog(null, "Error!\nUser deleted successfully");
            return true;
        }
    }
    
    public int checkIfUsernameExists(String username){
        for (UserAccount ua : this.userAccountList){
            if (ua.getUsername().equals(username))
                return this.userAccountList.indexOf(ua);
//                return false;
        }return -1;
//        return true;
    }
}
