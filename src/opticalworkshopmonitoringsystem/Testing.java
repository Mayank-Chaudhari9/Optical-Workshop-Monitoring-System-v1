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
@Table(name = "testing", catalog = "drdo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Testing.findAll", query = "SELECT t FROM Testing t"),
    @NamedQuery(name = "Testing.findByProject", query = "SELECT t FROM Testing t WHERE t.project = :project"),
    @NamedQuery(name = "Testing.findByComponent", query = "SELECT t FROM Testing t WHERE t.component = :component"),
    @NamedQuery(name = "Testing.findByLROCspecified", query = "SELECT t FROM Testing t WHERE t.lROCspecified = :lROCspecified"),
    @NamedQuery(name = "Testing.findByLROCmeasured", query = "SELECT t FROM Testing t WHERE t.lROCmeasured = :lROCmeasured"),
    @NamedQuery(name = "Testing.findByLFocallengthspecified", query = "SELECT t FROM Testing t WHERE t.lFocallengthspecified = :lFocallengthspecified"),
    @NamedQuery(name = "Testing.findByLFocallenghtmeasured", query = "SELECT t FROM Testing t WHERE t.lFocallenghtmeasured = :lFocallenghtmeasured"),
    @NamedQuery(name = "Testing.findByLcenteringspecified", query = "SELECT t FROM Testing t WHERE t.lcenteringspecified = :lcenteringspecified"),
    @NamedQuery(name = "Testing.findByLCenteringmeasured", query = "SELECT t FROM Testing t WHERE t.lCenteringmeasured = :lCenteringmeasured"),
    @NamedQuery(name = "Testing.findByLTransmissionspecified", query = "SELECT t FROM Testing t WHERE t.lTransmissionspecified = :lTransmissionspecified"),
    @NamedQuery(name = "Testing.findByLTransmissionmeasured", query = "SELECT t FROM Testing t WHERE t.lTransmissionmeasured = :lTransmissionmeasured"),
    @NamedQuery(name = "Testing.findByPParallelismspecified", query = "SELECT t FROM Testing t WHERE t.pParallelismspecified = :pParallelismspecified"),
    @NamedQuery(name = "Testing.findByPParallelismmeasured", query = "SELECT t FROM Testing t WHERE t.pParallelismmeasured = :pParallelismmeasured"),
    @NamedQuery(name = "Testing.findByPFlatnessspecified", query = "SELECT t FROM Testing t WHERE t.pFlatnessspecified = :pFlatnessspecified"),
    @NamedQuery(name = "Testing.findByPFlatnessmeasured", query = "SELECT t FROM Testing t WHERE t.pFlatnessmeasured = :pFlatnessmeasured"),
    @NamedQuery(name = "Testing.findByPTransmissionspecified", query = "SELECT t FROM Testing t WHERE t.pTransmissionspecified = :pTransmissionspecified"),
    @NamedQuery(name = "Testing.findByPTransmissionmeasured", query = "SELECT t FROM Testing t WHERE t.pTransmissionmeasured = :pTransmissionmeasured"),
    @NamedQuery(name = "Testing.findByPAnglespecified", query = "SELECT t FROM Testing t WHERE t.pAnglespecified = :pAnglespecified"),
    @NamedQuery(name = "Testing.findByPAnglemeasured", query = "SELECT t FROM Testing t WHERE t.pAnglemeasured = :pAnglemeasured"),
    @NamedQuery(name = "Testing.findBySFocallengthspecified", query = "SELECT t FROM Testing t WHERE t.sFocallengthspecified = :sFocallengthspecified"),
    @NamedQuery(name = "Testing.findBySFocallengthmeasured", query = "SELECT t FROM Testing t WHERE t.sFocallengthmeasured = :sFocallengthmeasured"),
    @NamedQuery(name = "Testing.findBySTransmissionspecified", query = "SELECT t FROM Testing t WHERE t.sTransmissionspecified = :sTransmissionspecified"),
    @NamedQuery(name = "Testing.findBySTransmissonmeasured", query = "SELECT t FROM Testing t WHERE t.sTransmissonmeasured = :sTransmissonmeasured"),
    @NamedQuery(name = "Testing.findBySFieldofViewspecified", query = "SELECT t FROM Testing t WHERE t.sFieldofViewspecified = :sFieldofViewspecified"),
    @NamedQuery(name = "Testing.findBySFieldofViewmeasured", query = "SELECT t FROM Testing t WHERE t.sFieldofViewmeasured = :sFieldofViewmeasured"),
    @NamedQuery(name = "Testing.findBySResolutionspecified", query = "SELECT t FROM Testing t WHERE t.sResolutionspecified = :sResolutionspecified"),
    @NamedQuery(name = "Testing.findBySResolutionmeasured", query = "SELECT t FROM Testing t WHERE t.sResolutionmeasured = :sResolutionmeasured"),
    @NamedQuery(name = "Testing.findBySDiaopticspecified", query = "SELECT t FROM Testing t WHERE t.sDiaopticspecified = :sDiaopticspecified"),
    @NamedQuery(name = "Testing.findBySDiaopticmeasured", query = "SELECT t FROM Testing t WHERE t.sDiaopticmeasured = :sDiaopticmeasured"),
    @NamedQuery(name = "Testing.findByMTFspecified", query = "SELECT t FROM Testing t WHERE t.mTFspecified = :mTFspecified"),
    @NamedQuery(name = "Testing.findByMTFmeasured", query = "SELECT t FROM Testing t WHERE t.mTFmeasured = :mTFmeasured"),
    @NamedQuery(name = "Testing.findBySno", query = "SELECT t FROM Testing t WHERE t.sno = :sno"),
    @NamedQuery(name = "Testing.findByTestingTime", query = "SELECT t FROM Testing t WHERE t.testingTime = :testingTime"),
    @NamedQuery(name = "Testing.findByStartDate", query = "SELECT t FROM Testing t WHERE t.startDate = :startDate"),
    @NamedQuery(name = "Testing.findByEndDate", query = "SELECT t FROM Testing t WHERE t.endDate = :endDate"),
    @NamedQuery(name = "Testing.findByTimeTaken", query = "SELECT t FROM Testing t WHERE t.timeTaken = :timeTaken")})
public class Testing implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "Project")
    private String project;
    @Column(name = "Component")
    private String component;
    @Column(name = "L_ROC_specified")
    private String lROCspecified;
    @Column(name = "L_ROC_measured")
    private String lROCmeasured;
    @Column(name = "L_Focal_length_specified")
    private String lFocallengthspecified;
    @Column(name = "L_Focal_lenght_measured")
    private String lFocallenghtmeasured;
    @Column(name = "L_centering_specified")
    private String lcenteringspecified;
    @Column(name = "L_Centering_measured")
    private String lCenteringmeasured;
    @Column(name = "L_Transmission_specified")
    private String lTransmissionspecified;
    @Column(name = "L_Transmission_measured")
    private String lTransmissionmeasured;
    @Column(name = "P_Parallelism_specified")
    private String pParallelismspecified;
    @Column(name = "P_Parallelism_measured")
    private String pParallelismmeasured;
    @Column(name = "P_Flatness_specified")
    private String pFlatnessspecified;
    @Column(name = "P_Flatness_measured")
    private String pFlatnessmeasured;
    @Column(name = "P_Transmission_specified")
    private String pTransmissionspecified;
    @Column(name = "P_Transmission_measured")
    private String pTransmissionmeasured;
    @Column(name = "P_Angle_specified")
    private String pAnglespecified;
    @Column(name = "P_Angle_measured")
    private String pAnglemeasured;
    @Column(name = "S_Focal_length_specified")
    private String sFocallengthspecified;
    @Column(name = "S_Focal_length_measured")
    private String sFocallengthmeasured;
    @Column(name = "S_Transmission_specified")
    private String sTransmissionspecified;
    @Column(name = "S_Transmisson_measured")
    private String sTransmissonmeasured;
    @Column(name = "S_Field_of_View_specified")
    private String sFieldofViewspecified;
    @Column(name = "S_Field_of_View_measured")
    private String sFieldofViewmeasured;
    @Column(name = "S_Resolution_specified")
    private String sResolutionspecified;
    @Column(name = "S_Resolution_measured")
    private String sResolutionmeasured;
    @Column(name = "S_Diaoptic_specified")
    private String sDiaopticspecified;
    @Column(name = "S_Diaoptic_measured")
    private String sDiaopticmeasured;
    @Column(name = "MTF_specified")
    private String mTFspecified;
    @Column(name = "MTF_measured")
    private String mTFmeasured;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Sno")
    private Double sno;
    @Column(name = "testing_time")
    private Integer testingTime;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;
    @Column(name = "time_taken")
    private String timeTaken;

    public Testing() {
    }

    public Testing(Double sno) {
        this.sno = sno;
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

    public String getLROCspecified() {
        return lROCspecified;
    }

    public void setLROCspecified(String lROCspecified) {
        String oldLROCspecified = this.lROCspecified;
        this.lROCspecified = lROCspecified;
        changeSupport.firePropertyChange("LROCspecified", oldLROCspecified, lROCspecified);
    }

    public String getLROCmeasured() {
        return lROCmeasured;
    }

    public void setLROCmeasured(String lROCmeasured) {
        String oldLROCmeasured = this.lROCmeasured;
        this.lROCmeasured = lROCmeasured;
        changeSupport.firePropertyChange("LROCmeasured", oldLROCmeasured, lROCmeasured);
    }

    public String getLFocallengthspecified() {
        return lFocallengthspecified;
    }

    public void setLFocallengthspecified(String lFocallengthspecified) {
        String oldLFocallengthspecified = this.lFocallengthspecified;
        this.lFocallengthspecified = lFocallengthspecified;
        changeSupport.firePropertyChange("LFocallengthspecified", oldLFocallengthspecified, lFocallengthspecified);
    }

    public String getLFocallenghtmeasured() {
        return lFocallenghtmeasured;
    }

    public void setLFocallenghtmeasured(String lFocallenghtmeasured) {
        String oldLFocallenghtmeasured = this.lFocallenghtmeasured;
        this.lFocallenghtmeasured = lFocallenghtmeasured;
        changeSupport.firePropertyChange("LFocallenghtmeasured", oldLFocallenghtmeasured, lFocallenghtmeasured);
    }

    public String getLcenteringspecified() {
        return lcenteringspecified;
    }

    public void setLcenteringspecified(String lcenteringspecified) {
        String oldLcenteringspecified = this.lcenteringspecified;
        this.lcenteringspecified = lcenteringspecified;
        changeSupport.firePropertyChange("lcenteringspecified", oldLcenteringspecified, lcenteringspecified);
    }

    public String getLCenteringmeasured() {
        return lCenteringmeasured;
    }

    public void setLCenteringmeasured(String lCenteringmeasured) {
        String oldLCenteringmeasured = this.lCenteringmeasured;
        this.lCenteringmeasured = lCenteringmeasured;
        changeSupport.firePropertyChange("LCenteringmeasured", oldLCenteringmeasured, lCenteringmeasured);
    }

    public String getLTransmissionspecified() {
        return lTransmissionspecified;
    }

    public void setLTransmissionspecified(String lTransmissionspecified) {
        String oldLTransmissionspecified = this.lTransmissionspecified;
        this.lTransmissionspecified = lTransmissionspecified;
        changeSupport.firePropertyChange("LTransmissionspecified", oldLTransmissionspecified, lTransmissionspecified);
    }

    public String getLTransmissionmeasured() {
        return lTransmissionmeasured;
    }

    public void setLTransmissionmeasured(String lTransmissionmeasured) {
        String oldLTransmissionmeasured = this.lTransmissionmeasured;
        this.lTransmissionmeasured = lTransmissionmeasured;
        changeSupport.firePropertyChange("LTransmissionmeasured", oldLTransmissionmeasured, lTransmissionmeasured);
    }

    public String getPParallelismspecified() {
        return pParallelismspecified;
    }

    public void setPParallelismspecified(String pParallelismspecified) {
        String oldPParallelismspecified = this.pParallelismspecified;
        this.pParallelismspecified = pParallelismspecified;
        changeSupport.firePropertyChange("PParallelismspecified", oldPParallelismspecified, pParallelismspecified);
    }

    public String getPParallelismmeasured() {
        return pParallelismmeasured;
    }

    public void setPParallelismmeasured(String pParallelismmeasured) {
        String oldPParallelismmeasured = this.pParallelismmeasured;
        this.pParallelismmeasured = pParallelismmeasured;
        changeSupport.firePropertyChange("PParallelismmeasured", oldPParallelismmeasured, pParallelismmeasured);
    }

    public String getPFlatnessspecified() {
        return pFlatnessspecified;
    }

    public void setPFlatnessspecified(String pFlatnessspecified) {
        String oldPFlatnessspecified = this.pFlatnessspecified;
        this.pFlatnessspecified = pFlatnessspecified;
        changeSupport.firePropertyChange("PFlatnessspecified", oldPFlatnessspecified, pFlatnessspecified);
    }

    public String getPFlatnessmeasured() {
        return pFlatnessmeasured;
    }

    public void setPFlatnessmeasured(String pFlatnessmeasured) {
        String oldPFlatnessmeasured = this.pFlatnessmeasured;
        this.pFlatnessmeasured = pFlatnessmeasured;
        changeSupport.firePropertyChange("PFlatnessmeasured", oldPFlatnessmeasured, pFlatnessmeasured);
    }

    public String getPTransmissionspecified() {
        return pTransmissionspecified;
    }

    public void setPTransmissionspecified(String pTransmissionspecified) {
        String oldPTransmissionspecified = this.pTransmissionspecified;
        this.pTransmissionspecified = pTransmissionspecified;
        changeSupport.firePropertyChange("PTransmissionspecified", oldPTransmissionspecified, pTransmissionspecified);
    }

    public String getPTransmissionmeasured() {
        return pTransmissionmeasured;
    }

    public void setPTransmissionmeasured(String pTransmissionmeasured) {
        String oldPTransmissionmeasured = this.pTransmissionmeasured;
        this.pTransmissionmeasured = pTransmissionmeasured;
        changeSupport.firePropertyChange("PTransmissionmeasured", oldPTransmissionmeasured, pTransmissionmeasured);
    }

    public String getPAnglespecified() {
        return pAnglespecified;
    }

    public void setPAnglespecified(String pAnglespecified) {
        String oldPAnglespecified = this.pAnglespecified;
        this.pAnglespecified = pAnglespecified;
        changeSupport.firePropertyChange("PAnglespecified", oldPAnglespecified, pAnglespecified);
    }

    public String getPAnglemeasured() {
        return pAnglemeasured;
    }

    public void setPAnglemeasured(String pAnglemeasured) {
        String oldPAnglemeasured = this.pAnglemeasured;
        this.pAnglemeasured = pAnglemeasured;
        changeSupport.firePropertyChange("PAnglemeasured", oldPAnglemeasured, pAnglemeasured);
    }

    public String getSFocallengthspecified() {
        return sFocallengthspecified;
    }

    public void setSFocallengthspecified(String sFocallengthspecified) {
        String oldSFocallengthspecified = this.sFocallengthspecified;
        this.sFocallengthspecified = sFocallengthspecified;
        changeSupport.firePropertyChange("SFocallengthspecified", oldSFocallengthspecified, sFocallengthspecified);
    }

    public String getSFocallengthmeasured() {
        return sFocallengthmeasured;
    }

    public void setSFocallengthmeasured(String sFocallengthmeasured) {
        String oldSFocallengthmeasured = this.sFocallengthmeasured;
        this.sFocallengthmeasured = sFocallengthmeasured;
        changeSupport.firePropertyChange("SFocallengthmeasured", oldSFocallengthmeasured, sFocallengthmeasured);
    }

    public String getSTransmissionspecified() {
        return sTransmissionspecified;
    }

    public void setSTransmissionspecified(String sTransmissionspecified) {
        String oldSTransmissionspecified = this.sTransmissionspecified;
        this.sTransmissionspecified = sTransmissionspecified;
        changeSupport.firePropertyChange("STransmissionspecified", oldSTransmissionspecified, sTransmissionspecified);
    }

    public String getSTransmissonmeasured() {
        return sTransmissonmeasured;
    }

    public void setSTransmissonmeasured(String sTransmissonmeasured) {
        String oldSTransmissonmeasured = this.sTransmissonmeasured;
        this.sTransmissonmeasured = sTransmissonmeasured;
        changeSupport.firePropertyChange("STransmissonmeasured", oldSTransmissonmeasured, sTransmissonmeasured);
    }

    public String getSFieldofViewspecified() {
        return sFieldofViewspecified;
    }

    public void setSFieldofViewspecified(String sFieldofViewspecified) {
        String oldSFieldofViewspecified = this.sFieldofViewspecified;
        this.sFieldofViewspecified = sFieldofViewspecified;
        changeSupport.firePropertyChange("SFieldofViewspecified", oldSFieldofViewspecified, sFieldofViewspecified);
    }

    public String getSFieldofViewmeasured() {
        return sFieldofViewmeasured;
    }

    public void setSFieldofViewmeasured(String sFieldofViewmeasured) {
        String oldSFieldofViewmeasured = this.sFieldofViewmeasured;
        this.sFieldofViewmeasured = sFieldofViewmeasured;
        changeSupport.firePropertyChange("SFieldofViewmeasured", oldSFieldofViewmeasured, sFieldofViewmeasured);
    }

    public String getSResolutionspecified() {
        return sResolutionspecified;
    }

    public void setSResolutionspecified(String sResolutionspecified) {
        String oldSResolutionspecified = this.sResolutionspecified;
        this.sResolutionspecified = sResolutionspecified;
        changeSupport.firePropertyChange("SResolutionspecified", oldSResolutionspecified, sResolutionspecified);
    }

    public String getSResolutionmeasured() {
        return sResolutionmeasured;
    }

    public void setSResolutionmeasured(String sResolutionmeasured) {
        String oldSResolutionmeasured = this.sResolutionmeasured;
        this.sResolutionmeasured = sResolutionmeasured;
        changeSupport.firePropertyChange("SResolutionmeasured", oldSResolutionmeasured, sResolutionmeasured);
    }

    public String getSDiaopticspecified() {
        return sDiaopticspecified;
    }

    public void setSDiaopticspecified(String sDiaopticspecified) {
        String oldSDiaopticspecified = this.sDiaopticspecified;
        this.sDiaopticspecified = sDiaopticspecified;
        changeSupport.firePropertyChange("SDiaopticspecified", oldSDiaopticspecified, sDiaopticspecified);
    }

    public String getSDiaopticmeasured() {
        return sDiaopticmeasured;
    }

    public void setSDiaopticmeasured(String sDiaopticmeasured) {
        String oldSDiaopticmeasured = this.sDiaopticmeasured;
        this.sDiaopticmeasured = sDiaopticmeasured;
        changeSupport.firePropertyChange("SDiaopticmeasured", oldSDiaopticmeasured, sDiaopticmeasured);
    }

    public String getMTFspecified() {
        return mTFspecified;
    }

    public void setMTFspecified(String mTFspecified) {
        String oldMTFspecified = this.mTFspecified;
        this.mTFspecified = mTFspecified;
        changeSupport.firePropertyChange("MTFspecified", oldMTFspecified, mTFspecified);
    }

    public String getMTFmeasured() {
        return mTFmeasured;
    }

    public void setMTFmeasured(String mTFmeasured) {
        String oldMTFmeasured = this.mTFmeasured;
        this.mTFmeasured = mTFmeasured;
        changeSupport.firePropertyChange("MTFmeasured", oldMTFmeasured, mTFmeasured);
    }

    public Double getSno() {
        return sno;
    }

    public void setSno(Double sno) {
        Double oldSno = this.sno;
        this.sno = sno;
        changeSupport.firePropertyChange("sno", oldSno, sno);
    }

    public Integer getTestingTime() {
        return testingTime;
    }

    public void setTestingTime(Integer testingTime) {
        Integer oldTestingTime = this.testingTime;
        this.testingTime = testingTime;
        changeSupport.firePropertyChange("testingTime", oldTestingTime, testingTime);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        String oldStartDate = this.startDate;
        this.startDate = startDate;
        changeSupport.firePropertyChange("startDate", oldStartDate, startDate);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        String oldEndDate = this.endDate;
        this.endDate = endDate;
        changeSupport.firePropertyChange("endDate", oldEndDate, endDate);
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(String timeTaken) {
        String oldTimeTaken = this.timeTaken;
        this.timeTaken = timeTaken;
        changeSupport.firePropertyChange("timeTaken", oldTimeTaken, timeTaken);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sno != null ? sno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Testing)) {
            return false;
        }
        Testing other = (Testing) object;
        if ((this.sno == null && other.sno != null) || (this.sno != null && !this.sno.equals(other.sno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "opticalworkshopmonitoringsystem.Testing[ sno=" + sno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
