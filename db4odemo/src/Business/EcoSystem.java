/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.SysAdmin.SysAdminDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class EcoSystem {
    
    private static EcoSystem ecoSystem;
    
    private List<CityNetwork> cityNetworks = new ArrayList<>();
    
    private SysAdminDirectory sysAdminDirectory;
    
    private CustomerDirectory customerDirectory;
    
    public static EcoSystem getInstance() {
        if(ecoSystem==null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {
    }

    public List<CityNetwork> getCityNetworks() {
        return cityNetworks;
    }

    public void setCityNetworks(List<CityNetwork> cityNetworks) {
        this.cityNetworks = cityNetworks;
    }

    public SysAdminDirectory getSysAdminDirectory() {
        return sysAdminDirectory;
    }

    public void setSysAdminDirectory(SysAdminDirectory sysAdminDirectory) {
        this.sysAdminDirectory = sysAdminDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
}
