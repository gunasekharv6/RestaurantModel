/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class RestaurantEmployeeDirectory {
    
    private List<RestaurantEmployee> employeeList = new ArrayList<>();

    public RestaurantEmployeeDirectory() {
    }
    
    public List<RestaurantEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<RestaurantEmployee> employeeList) {
        this.employeeList = employeeList;
    }

}