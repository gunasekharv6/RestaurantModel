/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.MasterUserAccountDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory custDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private UserAccountDirectory orgUserAccountDirectory;
    
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        employeeDirectory.getEmployeeList().add(new Employee());
        custDirectory = new CustomerDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
//        orgUserAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    
    public static List<String> getRolesList(){
        List<String> availableRoles = new ArrayList<String>();
        for(Type type : Type.values()){
            availableRoles.add(type.getValue());
        }return availableRoles;
//        return Stream.of(Type.values()).map(Type::name).collect(Collectors.toList());
    }
//    public abstract ArrayList<Role> getSupportedRole();
//    
////    public UserAccountDirectory getUserAccountDirectory() {
////        return orgUserAccountDirectory;
////    }

    public CustomerDirectory getCustDirectory() {
        return custDirectory;
    }

    public void setCustDirectory(CustomerDirectory custDirectory) {
        this.custDirectory = custDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    
    
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public UserAccountDirectory getOrgUserAccountDirectory() {
        return orgUserAccountDirectory;
    }

    public void setOrgUserAccountDirectory(UserAccountDirectory orgUserAccountDirectory) {
        this.orgUserAccountDirectory = orgUserAccountDirectory;
    }
    
    
}
