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
@Table(name = "centering_and_edging", catalog = "drdo", schema = "")
@NamedQueries({
    @NamedQuery(name = "CenteringAndEdging.findAll", query = "SELECT c FROM CenteringAndEdging c"),
    @NamedQuery(name = "CenteringAndEdging.findBySno", query = "SELECT c FROM CenteringAndEdging c WHERE c.sno = :sno"),
    @NamedQuery(name = "CenteringAndEdging.findByProjectName", query = "SELECT c FROM CenteringAndEdging c WHERE c.projectName = :projectName"),
    @NamedQuery(name = "CenteringAndEdging.findByComponent", query = "SELECT c FROM CenteringAndEdging c WHERE c.component = :component"),
    @NamedQuery(name = "CenteringAndEdging.findByMode", query = "SELECT c FROM CenteringAndEdging c WHERE c.mode = :mode"),
    @NamedQuery(name = "CenteringAndEdging.findByCenteringStartDate", query = "SELECT c FROM CenteringAndEdging c WHERE c.centeringStartDate = :centeringStartDate"),
    @NamedQuery(name = "CenteringAndEdging.findByCenteringEndDate", query = "SELECT c FROM CenteringAndEdging c WHERE c.centeringEndDate = :centeringEndDate"),
    @NamedQuery(name = "CenteringAndEdging.findByTInCentering", query = "SELECT c FROM CenteringAndEdging c WHERE c.tInCentering = :tInCentering"),
    @NamedQuery(name = "CenteringAndEdging.findByEdgingStartDate", query = "SELECT c FROM CenteringAndEdging c WHERE c.edgingStartDate = :edgingStartDate"),
    @NamedQuery(name = "CenteringAndEdging.findByEdgingEndDate", query = "SELECT c FROM CenteringAndEdging c WHERE c.edgingEndDate = :edgingEndDate"),
    @NamedQuery(name = "CenteringAndEdging.findByTInEdging", query = "SELECT c FROM CenteringAndEdging c WHERE c.tInEdging = :tInEdging"),
    @NamedQuery(name = "CenteringAndEdging.findByDiaCenteringToolSpecified", query = "SELECT c FROM CenteringAndEdging c WHERE c.diaCenteringToolSpecified = :diaCenteringToolSpecified"),
    @NamedQuery(name = "CenteringAndEdging.findByDiaCenteringToolMeasured", query = "SELECT c FROM CenteringAndEdging c WHERE c.diaCenteringToolMeasured = :diaCenteringToolMeasured"),
    @NamedQuery(name = "CenteringAndEdging.findBySurfaceSpecified", query = "SELECT c FROM CenteringAndEdging c WHERE c.surfaceSpecified = :surfaceSpecified"),
    @NamedQuery(name = "CenteringAndEdging.findBySurfaceMeasured", query = "SELECT c FROM CenteringAndEdging c WHERE c.surfaceMeasured = :surfaceMeasured")})
public class CenteringAndEdging implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Sno")
    private Double sno;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "component")
    private String component;
    @Column(name = "mode")
    private String mode;
    @Column(name = "centering_start_date")
    private String centeringStartDate;
    @Column(name = "centering_end_date")
    private String centeringEndDate;
    @Column(name = "t_in_centering")
    private String tInCentering;
    @Column(name = "edging_start_date")
    private String edgingStartDate;
    @Column(name = "edging_end_date")
    private String edgingEndDate;
    @Column(name = "t_in_edging")
    private String tInEdging;
    @Column(name = "dia_centering_tool_specified")
    private String diaCenteringToolSpecified;
    @Column(name = "dia_centering_tool_measured")
    private String diaCenteringToolMeasured;
    @Column(name = "surface_specified")
    private String surfaceSpecified;
    @Column(name = "surface_measured")
    private String surfaceMeasured;

    public CenteringAndEdging() {
    }

    public CenteringAndEdging(Double sno) {
        this.sno = sno;
    }

    public Double getSno() {
        return sno;
    }

    public void setSno(Double sno) {
        Double oldSno = this.sno;
        this.sno = sno;
        changeSupport.firePropertyChange("sno", oldSno, sno);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        String oldProjectName = this.projectName;
        this.projectName = projectName;
        changeSupport.firePropertyChange("projectName", oldProjectName, projectName);
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        String oldComponent = this.component;
        this.component = component;
        changeSupport.firePropertyChange("component", oldComponent, component);
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        String oldMode = this.mode;
        this.mode = mode;
        changeSupport.firePropertyChange("mode", oldMode, mode);
    }

    public String getCenteringStartDate() {
        return centeringStartDate;
    }

    public void setCenteringStartDate(String centeringStartDate) {
        String oldCenteringStartDate = this.centeringStartDate;
        this.centeringStartDate = centeringStartDate;
        changeSupport.firePropertyChange("centeringStartDate", oldCenteringStartDate, centeringStartDate);
    }

    public String getCenteringEndDate() {
        return centeringEndDate;
    }

    public void setCenteringEndDate(String centeringEndDate) {
        String oldCenteringEndDate = this.centeringEndDate;
        this.centeringEndDate = centeringEndDate;
        changeSupport.firePropertyChange("centeringEndDate", oldCenteringEndDate, centeringEndDate);
    }

    public String getTInCentering() {
        return tInCentering;
    }

    public void setTInCentering(String tInCentering) {
        String oldTInCentering = this.tInCentering;
        this.tInCentering = tInCentering;
        changeSupport.firePropertyChange("TInCentering", oldTInCentering, tInCentering);
    }

    public String getEdgingStartDate() {
        return edgingStartDate;
    }

    public void setEdgingStartDate(String edgingStartDate) {
        String oldEdgingStartDate = this.edgingStartDate;
        this.edgingStartDate = edgingStartDate;
        changeSupport.firePropertyChange("edgingStartDate", oldEdgingStartDate, edgingStartDate);
    }

    public String getEdgingEndDate() {
        return edgingEndDate;
    }

    public void setEdgingEndDate(String edgingEndDate) {
        String oldEdgingEndDate = this.edgingEndDate;
        this.edgingEndDate = edgingEndDate;
        changeSupport.firePropertyChange("edgingEndDate", oldEdgingEndDate, edgingEndDate);
    }

    public String getTInEdging() {
        return tInEdging;
    }

    public void setTInEdging(String tInEdging) {
        String oldTInEdging = this.tInEdging;
        this.tInEdging = tInEdging;
        changeSupport.firePropertyChange("TInEdging", oldTInEdging, tInEdging);
    }

    public String getDiaCenteringToolSpecified() {
        return diaCenteringToolSpecified;
    }

    public void setDiaCenteringToolSpecified(String diaCenteringToolSpecified) {
        String oldDiaCenteringToolSpecified = this.diaCenteringToolSpecified;
        this.diaCenteringToolSpecified = diaCenteringToolSpecified;
        changeSupport.firePropertyChange("diaCenteringToolSpecified", oldDiaCenteringToolSpecified, diaCenteringToolSpecified);
    }

    public String getDiaCenteringToolMeasured() {
        return diaCenteringToolMeasured;
    }

    public void setDiaCenteringToolMeasured(String diaCenteringToolMeasured) {
        String oldDiaCenteringToolMeasured = this.diaCenteringToolMeasured;
        this.diaCenteringToolMeasured = diaCenteringToolMeasured;
        changeSupport.firePropertyChange("diaCenteringToolMeasured", oldDiaCenteringToolMeasured, diaCenteringToolMeasured);
    }

    public String getSurfaceSpecified() {
        return surfaceSpecified;
    }

    public void setSurfaceSpecified(String surfaceSpecified) {
        String oldSurfaceSpecified = this.surfaceSpecified;
        this.surfaceSpecified = surfaceSpecified;
        changeSupport.firePropertyChange("surfaceSpecified", oldSurfaceSpecified, surfaceSpecified);
    }

    public String getSurfaceMeasured() {
        return surfaceMeasured;
    }

    public void setSurfaceMeasured(String surfaceMeasured) {
        String oldSurfaceMeasured = this.surfaceMeasured;
        this.surfaceMeasured = surfaceMeasured;
        changeSupport.firePropertyChange("surfaceMeasured", oldSurfaceMeasured, surfaceMeasured);
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
        if (!(object instanceof CenteringAndEdging)) {
            return false;
        }
        CenteringAndEdging other = (CenteringAndEdging) object;
        if ((this.sno == null && other.sno != null) || (this.sno != null && !this.sno.equals(other.sno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "opticalworkshopmonitoringsystem.CenteringAndEdging[ sno=" + sno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
