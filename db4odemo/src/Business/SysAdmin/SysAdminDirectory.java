/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SysAdmin;

import Business.ModificationInfo;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class SysAdminDirectory extends ModificationInfo{
    
    private List<SysAdmin> sysAdmins = new ArrayList<>();

    public SysAdminDirectory(List<SysAdmin> sysAdmins, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.sysAdmins = sysAdmins;
    }
    
    public SysAdminDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
         super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public List<SysAdmin> getSysAdmins() {
        return sysAdmins;
    }

    public void setSysAdmins(List<SysAdmin> sysAdmins) {
        this.sysAdmins = sysAdmins;
    }
    
    public void createSysAdmin(String name, String phoneNo, String email, String userName, String password, Role role, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        
        getSysAdmins().add(new SysAdmin(name,phoneNo,email,userName,password,role,createdDate,lastUpdatedDate,createdBy,modifiedBy));
        
    }
    
    public SysAdmin isUserSysAdmin(String userName, String password){
        
        if(!getSysAdmins().isEmpty()){
            for(SysAdmin sysAdmin:getSysAdmins()){
                if(sysAdmin.getUserName().equals(userName) && sysAdmin.getPassword().equals(password)){
                    return sysAdmin;
                }
            }
        }
        return null;
    }
}
