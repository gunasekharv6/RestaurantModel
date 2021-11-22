/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.ModificationInfo;
import Business.Role.Role;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class UserAccount extends ModificationInfo{
    
    private String name;

    private String phoneNo;
    
    private String email;
    
    private String userName;
    
    private String password;
    
    private Role role;

    public UserAccount(String name, String phoneNo, String email, String userName, String password, Role role, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
