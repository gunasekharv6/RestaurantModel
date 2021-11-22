/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author gunav
 */
public class ModificationInfo {
    
    private Date createdDate;
    
    private Date lastUpdatedDate;
    
    private String createdBy;
    
    private String modifiedBy;

    public ModificationInfo(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }
    
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
