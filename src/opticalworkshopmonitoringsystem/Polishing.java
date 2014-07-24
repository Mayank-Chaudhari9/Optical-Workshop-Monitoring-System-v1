/*
    Optical Workshop Monitoring System is a desktop application to fulfill the workflow control requirement at IRDE (DRDO) Dehradun.
    Copyright (C) 2014  Mayank Chaudhari (devil15)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

   For any query mail me at m.charly3015@gmail.com 
 */

package opticalworkshopmonitoringsystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author devil15
 */
@Entity
@Table(name = "polishing", catalog = "drdo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Polishing.findAll", query = "SELECT p FROM Polishing p"),
    @NamedQuery(name = "Polishing.findBySerial", query = "SELECT p FROM Polishing p WHERE p.serial = :serial"),
    @NamedQuery(name = "Polishing.findByProject", query = "SELECT p FROM Polishing p WHERE p.project = :project"),
    @NamedQuery(name = "Polishing.findByComponent", query = "SELECT p FROM Polishing p WHERE p.component = :component"),
    @NamedQuery(name = "Polishing.findByPdc", query = "SELECT p FROM Polishing p WHERE p.pdc = :pdc"),
    @NamedQuery(name = "Polishing.findByPTool", query = "SELECT p FROM Polishing p WHERE p.pTool = :pTool"),
    @NamedQuery(name = "Polishing.findByPStatus", query = "SELECT p FROM Polishing p WHERE p.pStatus = :pStatus"),
    @NamedQuery(name = "Polishing.findByPDueDate", query = "SELECT p FROM Polishing p WHERE p.pDueDate = :pDueDate"),
    @NamedQuery(name = "Polishing.findByPStartDate", query = "SELECT p FROM Polishing p WHERE p.pStartDate = :pStartDate"),
    @NamedQuery(name = "Polishing.findByPEndDate", query = "SELECT p FROM Polishing p WHERE p.pEndDate = :pEndDate"),
    @NamedQuery(name = "Polishing.findByPTime", query = "SELECT p FROM Polishing p WHERE p.pTime = :pTime"),
    @NamedQuery(name = "Polishing.findByMUsed", query = "SELECT p FROM Polishing p WHERE p.mUsed = :mUsed"),
    @NamedQuery(name = "Polishing.findByMTestplateR", query = "SELECT p FROM Polishing p WHERE p.mTestplateR = :mTestplateR"),
    @NamedQuery(name = "Polishing.findByMTestplateD", query = "SELECT p FROM Polishing p WHERE p.mTestplateD = :mTestplateD"),
    @NamedQuery(name = "Polishing.findByMTestplateVex", query = "SELECT p FROM Polishing p WHERE p.mTestplateVex = :mTestplateVex"),
    @NamedQuery(name = "Polishing.findByMTestplateCave", query = "SELECT p FROM Polishing p WHERE p.mTestplateCave = :mTestplateCave"),
    @NamedQuery(name = "Polishing.findByIterationNo", query = "SELECT p FROM Polishing p WHERE p.iterationNo = :iterationNo"),
    @NamedQuery(name = "Polishing.findByIStatus", query = "SELECT p FROM Polishing p WHERE p.iStatus = :iStatus"),
    @NamedQuery(name = "Polishing.findByInspectionR", query = "SELECT p FROM Polishing p WHERE p.inspectionR = :inspectionR"),
    @NamedQuery(name = "Polishing.findByInspectionSurface", query = "SELECT p FROM Polishing p WHERE p.inspectionSurface = :inspectionSurface"),
    @NamedQuery(name = "Polishing.findByInspectionStartDate", query = "SELECT p FROM Polishing p WHERE p.inspectionStartDate = :inspectionStartDate"),
    @NamedQuery(name = "Polishing.findByInspectionEndDate", query = "SELECT p FROM Polishing p WHERE p.inspectionEndDate = :inspectionEndDate"),
    @NamedQuery(name = "Polishing.findByInspectionTime", query = "SELECT p FROM Polishing p WHERE p.inspectionTime = :inspectionTime"),
    @NamedQuery(name = "Polishing.findByTotalPolishingTime", query = "SELECT p FROM Polishing p WHERE p.totalPolishingTime = :totalPolishingTime")})
public class Polishing implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "serial")
    private Double serial;
    @Column(name = "project")
    private String project;
    @Column(name = "component")
    private String component;
    @Column(name = "pdc")
    private String pdc;
    @Column(name = "p_tool")
    private String pTool;
    @Column(name = "p_status")
    private String pStatus;
    @Column(name = "p_due_date")
    private String pDueDate;
    @Column(name = "p_start_date")
    private String pStartDate;
    @Column(name = "p_end_date")
    private String pEndDate;
    @Column(name = "p_time")
    private String pTime;
    @Column(name = "m_used")
    private String mUsed;
    @Column(name = "m_testplate_r")
    private String mTestplateR;
    @Column(name = "m_testplate_d")
    private String mTestplateD;
    @Column(name = "m_testplate_vex")
    private String mTestplateVex;
    @Column(name = "m_testplate_cave")
    private String mTestplateCave;
    @Column(name = "iteration_no")
    private String iterationNo;
    @Column(name = "i_status")
    private String iStatus;
    @Column(name = "inspection_r")
    private String inspectionR;
    @Column(name = "inspection_surface")
    private String inspectionSurface;
    @Column(name = "inspection_start_date")
    private String inspectionStartDate;
    @Column(name = "inspection_end_date")
    private String inspectionEndDate;
    @Column(name = "inspection_time")
    private String inspectionTime;
    @Column(name = "total_polishing_time")
    private Integer totalPolishingTime;

    public Polishing() {
    }

    public Polishing(Double serial) {
        this.serial = serial;
    }

    public Double getSerial() {
        return serial;
    }

    public void setSerial(Double serial) {
        Double oldSerial = this.serial;
        this.serial = serial;
        changeSupport.firePropertyChange("serial", oldSerial, serial);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        String oldProject = this.project;
        this.project = project;
        changeSupport.firePropertyChange("project", oldProject, project);
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        String oldComponent = this.component;
        this.component = component;
        changeSupport.firePropertyChange("component", oldComponent, component);
    }

    public String getPdc() {
        return pdc;
    }

    public void setPdc(String pdc) {
        String oldPdc = this.pdc;
        this.pdc = pdc;
        changeSupport.firePropertyChange("pdc", oldPdc, pdc);
    }

    public String getPTool() {
        return pTool;
    }

    public void setPTool(String pTool) {
        String oldPTool = this.pTool;
        this.pTool = pTool;
        changeSupport.firePropertyChange("PTool", oldPTool, pTool);
    }

    public String getPStatus() {
        return pStatus;
    }

    public void setPStatus(String pStatus) {
        String oldPStatus = this.pStatus;
        this.pStatus = pStatus;
        changeSupport.firePropertyChange("PStatus", oldPStatus, pStatus);
    }

    public String getPDueDate() {
        return pDueDate;
    }

    public void setPDueDate(String pDueDate) {
        String oldPDueDate = this.pDueDate;
        this.pDueDate = pDueDate;
        changeSupport.firePropertyChange("PDueDate", oldPDueDate, pDueDate);
    }

    public String getPStartDate() {
        return pStartDate;
    }

    public void setPStartDate(String pStartDate) {
        String oldPStartDate = this.pStartDate;
        this.pStartDate = pStartDate;
        changeSupport.firePropertyChange("PStartDate", oldPStartDate, pStartDate);
    }

    public String getPEndDate() {
        return pEndDate;
    }

    public void setPEndDate(String pEndDate) {
        String oldPEndDate = this.pEndDate;
        this.pEndDate = pEndDate;
        changeSupport.firePropertyChange("PEndDate", oldPEndDate, pEndDate);
    }

    public String getPTime() {
        return pTime;
    }

    public void setPTime(String pTime) {
        String oldPTime = this.pTime;
        this.pTime = pTime;
        changeSupport.firePropertyChange("PTime", oldPTime, pTime);
    }

    public String getMUsed() {
        return mUsed;
    }

    public void setMUsed(String mUsed) {
        String oldMUsed = this.mUsed;
        this.mUsed = mUsed;
        changeSupport.firePropertyChange("MUsed", oldMUsed, mUsed);
    }

    public String getMTestplateR() {
        return mTestplateR;
    }

    public void setMTestplateR(String mTestplateR) {
        String oldMTestplateR = this.mTestplateR;
        this.mTestplateR = mTestplateR;
        changeSupport.firePropertyChange("MTestplateR", oldMTestplateR, mTestplateR);
    }

    public String getMTestplateD() {
        return mTestplateD;
    }

    public void setMTestplateD(String mTestplateD) {
        String oldMTestplateD = this.mTestplateD;
        this.mTestplateD = mTestplateD;
        changeSupport.firePropertyChange("MTestplateD", oldMTestplateD, mTestplateD);
    }

    public String getMTestplateVex() {
        return mTestplateVex;
    }

    public void setMTestplateVex(String mTestplateVex) {
        String oldMTestplateVex = this.mTestplateVex;
        this.mTestplateVex = mTestplateVex;
        changeSupport.firePropertyChange("MTestplateVex", oldMTestplateVex, mTestplateVex);
    }

    public String getMTestplateCave() {
        return mTestplateCave;
    }

    public void setMTestplateCave(String mTestplateCave) {
        String oldMTestplateCave = this.mTestplateCave;
        this.mTestplateCave = mTestplateCave;
        changeSupport.firePropertyChange("MTestplateCave", oldMTestplateCave, mTestplateCave);
    }

    public String getIterationNo() {
        return iterationNo;
    }

    public void setIterationNo(String iterationNo) {
        String oldIterationNo = this.iterationNo;
        this.iterationNo = iterationNo;
        changeSupport.firePropertyChange("iterationNo", oldIterationNo, iterationNo);
    }

    public String getIStatus() {
        return iStatus;
    }

    public void setIStatus(String iStatus) {
        String oldIStatus = this.iStatus;
        this.iStatus = iStatus;
        changeSupport.firePropertyChange("IStatus", oldIStatus, iStatus);
    }

    public String getInspectionR() {
        return inspectionR;
    }

    public void setInspectionR(String inspectionR) {
        String oldInspectionR = this.inspectionR;
        this.inspectionR = inspectionR;
        changeSupport.firePropertyChange("inspectionR", oldInspectionR, inspectionR);
    }

    public String getInspectionSurface() {
        return inspectionSurface;
    }

    public void setInspectionSurface(String inspectionSurface) {
        String oldInspectionSurface = this.inspectionSurface;
        this.inspectionSurface = inspectionSurface;
        changeSupport.firePropertyChange("inspectionSurface", oldInspectionSurface, inspectionSurface);
    }

    public String getInspectionStartDate() {
        return inspectionStartDate;
    }

    public void setInspectionStartDate(String inspectionStartDate) {
        String oldInspectionStartDate = this.inspectionStartDate;
        this.inspectionStartDate = inspectionStartDate;
        changeSupport.firePropertyChange("inspectionStartDate", oldInspectionStartDate, inspectionStartDate);
    }

    public String getInspectionEndDate() {
        return inspectionEndDate;
    }

    public void setInspectionEndDate(String inspectionEndDate) {
        String oldInspectionEndDate = this.inspectionEndDate;
        this.inspectionEndDate = inspectionEndDate;
        changeSupport.firePropertyChange("inspectionEndDate", oldInspectionEndDate, inspectionEndDate);
    }

    public String getInspectionTime() {
        return inspectionTime;
    }

    public void setInspectionTime(String inspectionTime) {
        String oldInspectionTime = this.inspectionTime;
        this.inspectionTime = inspectionTime;
        changeSupport.firePropertyChange("inspectionTime", oldInspectionTime, inspectionTime);
    }

    public Integer getTotalPolishingTime() {
        return totalPolishingTime;
    }

    public void setTotalPolishingTime(Integer totalPolishingTime) {
        Integer oldTotalPolishingTime = this.totalPolishingTime;
        this.totalPolishingTime = totalPolishingTime;
        changeSupport.firePropertyChange("totalPolishingTime", oldTotalPolishingTime, totalPolishingTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serial != null ? serial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polishing)) {
            return false;
        }
        Polishing other = (Polishing) object;
        if ((this.serial == null && other.serial != null) || (this.serial != null && !this.serial.equals(other.serial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "opticalworkshopmonitoringsystem.Polishing[ serial=" + serial + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
