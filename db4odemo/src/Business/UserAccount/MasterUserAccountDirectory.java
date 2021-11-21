/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.RestaurantManagerRole;
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
    private EcoSystem system;

    public MasterUserAccountDirectory(EcoSystem system) {
        this.system = system;
        this.masterUserAccountList = new ArrayList();
        this.masterUserAccountList.add(new UserAccount("sysadmin", "sysadmin", new SystemAdminRole()));
        this.masterUserAccountList.add(new UserAccount("user1", "user1", new CustomerRole()));
        
        UserAccount restrntMngraccount =  new UserAccount("rest1", "rest1", new RestaurantManagerRole());
        this.masterUserAccountList.add(restrntMngraccount);
        Restaurant rt = system.getRestaurantDirectory().getRestaurantList().get(0);//new Restaurant("Mela");//
        Employee emp = new Employee(restrntMngraccount, rt);
        
        DeliveryMan deliveryman =  new DeliveryMan("akash", "delv1", "delv1");
        this.masterUserAccountList.add(deliveryman.getUseraccount());
        deliveryman.setRestaurant(rt);
//        this.system.getDeliveryManDirectory().getDeliveryManList().add(deliveryman);
        
//        Employee employee = new Employee(restrntMngraccount, "Mela");
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
