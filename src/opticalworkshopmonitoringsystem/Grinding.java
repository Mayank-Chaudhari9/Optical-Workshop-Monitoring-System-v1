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
@Table(name = "grinding", catalog = "drdo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Grinding.findAll", query = "SELECT g FROM Grinding g"),
    @NamedQuery(name = "Grinding.findBySerialNo", query = "SELECT g FROM Grinding g WHERE g.serialNo = :serialNo"),
    @NamedQuery(name = "Grinding.findByProjectName", query = "SELECT g FROM Grinding g WHERE g.projectName = :projectName"),
    @NamedQuery(name = "Grinding.findByComponent", query = "SELECT g FROM Grinding g WHERE g.component = :component"),
    @NamedQuery(name = "Grinding.findByPdc", query = "SELECT g FROM Grinding g WHERE g.pdc = :pdc"),
    @NamedQuery(name = "Grinding.findByMaterial", query = "SELECT g FROM Grinding g WHERE g.material = :material"),
    @NamedQuery(name = "Grinding.findByTestplateRadius", query = "SELECT g FROM Grinding g WHERE g.testplateRadius = :testplateRadius"),
    @NamedQuery(name = "Grinding.findByTestplateDiameter", query = "SELECT g FROM Grinding g WHERE g.testplateDiameter = :testplateDiameter"),
    @NamedQuery(name = "Grinding.findByTestplateVaxRadius", query = "SELECT g FROM Grinding g WHERE g.testplateVaxRadius = :testplateVaxRadius"),
    @NamedQuery(name = "Grinding.findByTestplateCaveRadius", query = "SELECT g FROM Grinding g WHERE g.testplateCaveRadius = :testplateCaveRadius"),
    @NamedQuery(name = "Grinding.findBySlicingMachineUsed", query = "SELECT g FROM Grinding g WHERE g.slicingMachineUsed = :slicingMachineUsed"),
    @NamedQuery(name = "Grinding.findBySlicingStatus", query = "SELECT g FROM Grinding g WHERE g.slicingStatus = :slicingStatus"),
    @NamedQuery(name = "Grinding.findBySlicingstartdate", query = "SELECT g FROM Grinding g WHERE g.slicingstartdate = :slicingstartdate"),
    @NamedQuery(name = "Grinding.findBySlicingenddate", query = "SELECT g FROM Grinding g WHERE g.slicingenddate = :slicingenddate"),
    @NamedQuery(name = "Grinding.findBySlicingtimetaken", query = "SELECT g FROM Grinding g WHERE g.slicingtimetaken = :slicingtimetaken"),
    @NamedQuery(name = "Grinding.findByCurveGenerationMachine", query = "SELECT g FROM Grinding g WHERE g.curveGenerationMachine = :curveGenerationMachine"),
    @NamedQuery(name = "Grinding.findByCurveGenerationTool", query = "SELECT g FROM Grinding g WHERE g.curveGenerationTool = :curveGenerationTool"),
    @NamedQuery(name = "Grinding.findByCurveGenerationStatus", query = "SELECT g FROM Grinding g WHERE g.curveGenerationStatus = :curveGenerationStatus"),
    @NamedQuery(name = "Grinding.findByCgsdate", query = "SELECT g FROM Grinding g WHERE g.cgsdate = :cgsdate"),
    @NamedQuery(name = "Grinding.findByCgedate", query = "SELECT g FROM Grinding g WHERE g.cgedate = :cgedate"),
    @NamedQuery(name = "Grinding.findByCgttaken", query = "SELECT g FROM Grinding g WHERE g.cgttaken = :cgttaken"),
    @NamedQuery(name = "Grinding.findByTrepeingTool", query = "SELECT g FROM Grinding g WHERE g.trepeingTool = :trepeingTool"),
    @NamedQuery(name = "Grinding.findByTrepeningStatus", query = "SELECT g FROM Grinding g WHERE g.trepeningStatus = :trepeningStatus"),
    @NamedQuery(name = "Grinding.findByTsdate", query = "SELECT g FROM Grinding g WHERE g.tsdate = :tsdate"),
    @NamedQuery(name = "Grinding.findByTedate", query = "SELECT g FROM Grinding g WHERE g.tedate = :tedate"),
    @NamedQuery(name = "Grinding.findByTttaken", query = "SELECT g FROM Grinding g WHERE g.tttaken = :tttaken"),
    @NamedQuery(name = "Grinding.findByIrocs", query = "SELECT g FROM Grinding g WHERE g.irocs = :irocs"),
    @NamedQuery(name = "Grinding.findByIrocm", query = "SELECT g FROM Grinding g WHERE g.irocm = :irocm"),
    @NamedQuery(name = "Grinding.findByIcentralthicknesss", query = "SELECT g FROM Grinding g WHERE g.icentralthicknesss = :icentralthicknesss"),
    @NamedQuery(name = "Grinding.findByIcentralthicknessm", query = "SELECT g FROM Grinding g WHERE g.icentralthicknessm = :icentralthicknessm"),
    @NamedQuery(name = "Grinding.findByISurfaceDetailss", query = "SELECT g FROM Grinding g WHERE g.iSurfaceDetailss = :iSurfaceDetailss"),
    @NamedQuery(name = "Grinding.findByISurfaceDetailsm", query = "SELECT g FROM Grinding g WHERE g.iSurfaceDetailsm = :iSurfaceDetailsm"),
    @NamedQuery(name = "Grinding.findByIa1s", query = "SELECT g FROM Grinding g WHERE g.ia1s = :ia1s"),
    @NamedQuery(name = "Grinding.findByIa1m", query = "SELECT g FROM Grinding g WHERE g.ia1m = :ia1m"),
    @NamedQuery(name = "Grinding.findByIa2s", query = "SELECT g FROM Grinding g WHERE g.ia2s = :ia2s"),
    @NamedQuery(name = "Grinding.findByIa2m", query = "SELECT g FROM Grinding g WHERE g.ia2m = :ia2m"),
    @NamedQuery(name = "Grinding.findByIa3s", query = "SELECT g FROM Grinding g WHERE g.ia3s = :ia3s"),
    @NamedQuery(name = "Grinding.findByIa3m", query = "SELECT g FROM Grinding g WHERE g.ia3m = :ia3m"),
    @NamedQuery(name = "Grinding.findByIa4s", query = "SELECT g FROM Grinding g WHERE g.ia4s = :ia4s"),
    @NamedQuery(name = "Grinding.findByIa4m", query = "SELECT g FROM Grinding g WHERE g.ia4m = :ia4m"),
    @NamedQuery(name = "Grinding.findByIa5s", query = "SELECT g FROM Grinding g WHERE g.ia5s = :ia5s"),
    @NamedQuery(name = "Grinding.findByIa5m", query = "SELECT g FROM Grinding g WHERE g.ia5m = :ia5m"),
    @NamedQuery(name = "Grinding.findByIa6s", query = "SELECT g FROM Grinding g WHERE g.ia6s = :ia6s"),
    @NamedQuery(name = "Grinding.findByIa6m", query = "SELECT g FROM Grinding g WHERE g.ia6m = :ia6m"),
    @NamedQuery(name = "Grinding.findByIstartdate", query = "SELECT g FROM Grinding g WHERE g.istartdate = :istartdate"),
    @NamedQuery(name = "Grinding.findByIenddate", query = "SELECT g FROM Grinding g WHERE g.ienddate = :ienddate"),
    @NamedQuery(name = "Grinding.findByIttaken", query = "SELECT g FROM Grinding g WHERE g.ittaken = :ittaken"),
    @NamedQuery(name = "Grinding.findByTotalGrindingTime", query = "SELECT g FROM Grinding g WHERE g.totalGrindingTime = :totalGrindingTime"),
    @NamedQuery(name = "Grinding.findByGsMachine", query = "SELECT g FROM Grinding g WHERE g.gsMachine = :gsMachine"),
    @NamedQuery(name = "Grinding.findByGsTool", query = "SELECT g FROM Grinding g WHERE g.gsTool = :gsTool"),
    @NamedQuery(name = "Grinding.findByGsProcessing", query = "SELECT g FROM Grinding g WHERE g.gsProcessing = :gsProcessing"),
    @NamedQuery(name = "Grinding.findByGsStatus", query = "SELECT g FROM Grinding g WHERE g.gsStatus = :gsStatus"),
    @NamedQuery(name = "Grinding.findByGsStart", query = "SELECT g FROM Grinding g WHERE g.gsStart = :gsStart"),
    @NamedQuery(name = "Grinding.findByGsEnd", query = "SELECT g FROM Grinding g WHERE g.gsEnd = :gsEnd"),
    @NamedQuery(name = "Grinding.findByGsTime", query = "SELECT g FROM Grinding g WHERE g.gsTime = :gsTime")})
public class Grinding implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "serial_no")
    private Long serialNo;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "component")
    private String component;
    @Column(name = "pdc")
    private String pdc;
    @Column(name = "material")
    private String material;
    @Column(name = "testplate_radius")
    private String testplateRadius;
    @Column(name = "testplate_diameter")
    private String testplateDiameter;
    @Column(name = "testplate_vax_radius")
    private String testplateVaxRadius;
    @Column(name = "testplate_cave_radius")
    private String testplateCaveRadius;
    @Column(name = "slicing_machine_used")
    private String slicingMachineUsed;
    @Column(name = "slicing_status")
    private String slicingStatus;
    @Column(name = "Slicing_start_date")
    private String slicingstartdate;
    @Column(name = "Slicing_end_date")
    private String slicingenddate;
    @Column(name = "Slicing_time_taken")
    private String slicingtimetaken;
    @Column(name = "curve_generation_machine")
    private String curveGenerationMachine;
    @Column(name = "curve_generation_tool")
    private String curveGenerationTool;
    @Column(name = "curve_generation_status")
    private String curveGenerationStatus;
    @Column(name = "C_g_s_date")
    private String cgsdate;
    @Column(name = "C_g_e_date")
    private String cgedate;
    @Column(name = "C_g_t_taken")
    private String cgttaken;
    @Column(name = "trepeing_tool")
    private String trepeingTool;
    @Column(name = "trepening_status")
    private String trepeningStatus;
    @Column(name = "T_s_date")
    private String tsdate;
    @Column(name = "T_e_date")
    private String tedate;
    @Column(name = "T_t_taken")
    private String tttaken;
    @Column(name = "I_roc_s")
    private String irocs;
    @Column(name = "I_roc_m")
    private String irocm;
    @Column(name = "I_central_thickness_s")
    private String icentralthicknesss;
    @Column(name = "I_central_thickness_m")
    private String icentralthicknessm;
    @Column(name = "I_Surface_Details_s")
    private String iSurfaceDetailss;
    @Column(name = "I_Surface_Details_m")
    private String iSurfaceDetailsm;
    @Column(name = "IA1S")
    private String ia1s;
    @Column(name = "IA1M")
    private String ia1m;
    @Column(name = "IA2S")
    private String ia2s;
    @Column(name = "IA2M")
    private String ia2m;
    @Column(name = "IA3S")
    private String ia3s;
    @Column(name = "IA3M")
    private String ia3m;
    @Column(name = "IA4S")
    private String ia4s;
    @Column(name = "IA4M")
    private String ia4m;
    @Column(name = "IA5S")
    private String ia5s;
    @Column(name = "IA5M")
    private String ia5m;
    @Column(name = "IA6S")
    private String ia6s;
    @Column(name = "IA6M")
    private String ia6m;
    @Column(name = "I_start_date")
    private String istartdate;
    @Column(name = "I_end_date")
    private String ienddate;
    @Column(name = "I_t_taken")
    private String ittaken;
    @Column(name = "total_grinding_time")
    private Integer totalGrindingTime;
    @Column(name = "gs_machine")
    private String gsMachine;
    @Column(name = "gs_tool")
    private String gsTool;
    @Column(name = "gs_processing")
    private String gsProcessing;
    @Column(name = "gs_status")
    private String gsStatus;
    @Column(name = "gs_start")
    private String gsStart;
    @Column(name = "gs_end")
    private String gsEnd;
    @Column(name = "gs_time")
    private String gsTime;

    public Grinding() {
    }

    public Grinding(Long serialNo) {
        this.serialNo = serialNo;
    }

    public Long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Long serialNo) {
        Long oldSerialNo = this.serialNo;
        this.serialNo = serialNo;
        changeSupport.firePropertyChange("serialNo", oldSerialNo, serialNo);
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

    public String getPdc() {
        return pdc;
    }

    public void setPdc(String pdc) {
        String oldPdc = this.pdc;
        this.pdc = pdc;
        changeSupport.firePropertyChange("pdc", oldPdc, pdc);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        String oldMaterial = this.material;
        this.material = material;
        changeSupport.firePropertyChange("material", oldMaterial, material);
    }

    public String getTestplateRadius() {
        return testplateRadius;
    }

    public void setTestplateRadius(String testplateRadius) {
        String oldTestplateRadius = this.testplateRadius;
        this.testplateRadius = testplateRadius;
        changeSupport.firePropertyChange("testplateRadius", oldTestplateRadius, testplateRadius);
    }

    public String getTestplateDiameter() {
        return testplateDiameter;
    }

    public void setTestplateDiameter(String testplateDiameter) {
        String oldTestplateDiameter = this.testplateDiameter;
        this.testplateDiameter = testplateDiameter;
        changeSupport.firePropertyChange("testplateDiameter", oldTestplateDiameter, testplateDiameter);
    }

    public String getTestplateVaxRadius() {
        return testplateVaxRadius;
    }

    public void setTestplateVaxRadius(String testplateVaxRadius) {
        String oldTestplateVaxRadius = this.testplateVaxRadius;
        this.testplateVaxRadius = testplateVaxRadius;
        changeSupport.firePropertyChange("testplateVaxRadius", oldTestplateVaxRadius, testplateVaxRadius);
    }

    public String getTestplateCaveRadius() {
        return testplateCaveRadius;
    }

    public void setTestplateCaveRadius(String testplateCaveRadius) {
        String oldTestplateCaveRadius = this.testplateCaveRadius;
        this.testplateCaveRadius = testplateCaveRadius;
        changeSupport.firePropertyChange("testplateCaveRadius", oldTestplateCaveRadius, testplateCaveRadius);
    }

    public String getSlicingMachineUsed() {
        return slicingMachineUsed;
    }

    public void setSlicingMachineUsed(String slicingMachineUsed) {
        String oldSlicingMachineUsed = this.slicingMachineUsed;
        this.slicingMachineUsed = slicingMachineUsed;
        changeSupport.firePropertyChange("slicingMachineUsed", oldSlicingMachineUsed, slicingMachineUsed);
    }

    public String getSlicingStatus() {
        return slicingStatus;
    }

    public void setSlicingStatus(String slicingStatus) {
        String oldSlicingStatus = this.slicingStatus;
        this.slicingStatus = slicingStatus;
        changeSupport.firePropertyChange("slicingStatus", oldSlicingStatus, slicingStatus);
    }

    public String getSlicingstartdate() {
        return slicingstartdate;
    }

    public void setSlicingstartdate(String slicingstartdate) {
        String oldSlicingstartdate = this.slicingstartdate;
        this.slicingstartdate = slicingstartdate;
        changeSupport.firePropertyChange("slicingstartdate", oldSlicingstartdate, slicingstartdate);
    }

    public String getSlicingenddate() {
        return slicingenddate;
    }

    public void setSlicingenddate(String slicingenddate) {
        String oldSlicingenddate = this.slicingenddate;
        this.slicingenddate = slicingenddate;
        changeSupport.firePropertyChange("slicingenddate", oldSlicingenddate, slicingenddate);
    }

    public String getSlicingtimetaken() {
        return slicingtimetaken;
    }

    public void setSlicingtimetaken(String slicingtimetaken) {
        String oldSlicingtimetaken = this.slicingtimetaken;
        this.slicingtimetaken = slicingtimetaken;
        changeSupport.firePropertyChange("slicingtimetaken", oldSlicingtimetaken, slicingtimetaken);
    }

    public String getCurveGenerationMachine() {
        return curveGenerationMachine;
    }

    public void setCurveGenerationMachine(String curveGenerationMachine) {
        String oldCurveGenerationMachine = this.curveGenerationMachine;
        this.curveGenerationMachine = curveGenerationMachine;
        changeSupport.firePropertyChange("curveGenerationMachine", oldCurveGenerationMachine, curveGenerationMachine);
    }

    public String getCurveGenerationTool() {
        return curveGenerationTool;
    }

    public void setCurveGenerationTool(String curveGenerationTool) {
        String oldCurveGenerationTool = this.curveGenerationTool;
        this.curveGenerationTool = curveGenerationTool;
        changeSupport.firePropertyChange("curveGenerationTool", oldCurveGenerationTool, curveGenerationTool);
    }

    public String getCurveGenerationStatus() {
        return curveGenerationStatus;
    }

    public void setCurveGenerationStatus(String curveGenerationStatus) {
        String oldCurveGenerationStatus = this.curveGenerationStatus;
        this.curveGenerationStatus = curveGenerationStatus;
        changeSupport.firePropertyChange("curveGenerationStatus", oldCurveGenerationStatus, curveGenerationStatus);
    }

    public String getCgsdate() {
        return cgsdate;
    }

    public void setCgsdate(String cgsdate) {
        String oldCgsdate = this.cgsdate;
        this.cgsdate = cgsdate;
        changeSupport.firePropertyChange("cgsdate", oldCgsdate, cgsdate);
    }

    public String getCgedate() {
        return cgedate;
    }

    public void setCgedate(String cgedate) {
        String oldCgedate = this.cgedate;
        this.cgedate = cgedate;
        changeSupport.firePropertyChange("cgedate", oldCgedate, cgedate);
    }

    public String getCgttaken() {
        return cgttaken;
    }

    public void setCgttaken(String cgttaken) {
        String oldCgttaken = this.cgttaken;
        this.cgttaken = cgttaken;
        changeSupport.firePropertyChange("cgttaken", oldCgttaken, cgttaken);
    }

    public String getTrepeingTool() {
        return trepeingTool;
    }

    public void setTrepeingTool(String trepeingTool) {
        String oldTrepeingTool = this.trepeingTool;
        this.trepeingTool = trepeingTool;
        changeSupport.firePropertyChange("trepeingTool", oldTrepeingTool, trepeingTool);
    }

    public String getTrepeningStatus() {
        return trepeningStatus;
    }

    public void setTrepeningStatus(String trepeningStatus) {
        String oldTrepeningStatus = this.trepeningStatus;
        this.trepeningStatus = trepeningStatus;
        changeSupport.firePropertyChange("trepeningStatus", oldTrepeningStatus, trepeningStatus);
    }

    public String getTsdate() {
        return tsdate;
    }

    public void setTsdate(String tsdate) {
        String oldTsdate = this.tsdate;
        this.tsdate = tsdate;
        changeSupport.firePropertyChange("tsdate", oldTsdate, tsdate);
    }

    public String getTedate() {
        return tedate;
    }

    public void setTedate(String tedate) {
        String oldTedate = this.tedate;
        this.tedate = tedate;
        changeSupport.firePropertyChange("tedate", oldTedate, tedate);
    }

    public String getTttaken() {
        return tttaken;
    }

    public void setTttaken(String tttaken) {
        String oldTttaken = this.tttaken;
        this.tttaken = tttaken;
        changeSupport.firePropertyChange("tttaken", oldTttaken, tttaken);
    }

    public String getIrocs() {
        return irocs;
    }

    public void setIrocs(String irocs) {
        String oldIrocs = this.irocs;
        this.irocs = irocs;
        changeSupport.firePropertyChange("irocs", oldIrocs, irocs);
    }

    public String getIrocm() {
        return irocm;
    }

    public void setIrocm(String irocm) {
        String oldIrocm = this.irocm;
        this.irocm = irocm;
        changeSupport.firePropertyChange("irocm", oldIrocm, irocm);
    }

    public String getIcentralthicknesss() {
        return icentralthicknesss;
    }

    public void setIcentralthicknesss(String icentralthicknesss) {
        String oldIcentralthicknesss = this.icentralthicknesss;
        this.icentralthicknesss = icentralthicknesss;
        changeSupport.firePropertyChange("icentralthicknesss", oldIcentralthicknesss, icentralthicknesss);
    }

    public String getIcentralthicknessm() {
        return icentralthicknessm;
    }

    public void setIcentralthicknessm(String icentralthicknessm) {
        String oldIcentralthicknessm = this.icentralthicknessm;
        this.icentralthicknessm = icentralthicknessm;
        changeSupport.firePropertyChange("icentralthicknessm", oldIcentralthicknessm, icentralthicknessm);
    }

    public String getISurfaceDetailss() {
        return iSurfaceDetailss;
    }

    public void setISurfaceDetailss(String iSurfaceDetailss) {
        String oldISurfaceDetailss = this.iSurfaceDetailss;
        this.iSurfaceDetailss = iSurfaceDetailss;
        changeSupport.firePropertyChange("ISurfaceDetailss", oldISurfaceDetailss, iSurfaceDetailss);
    }

    public String getISurfaceDetailsm() {
        return iSurfaceDetailsm;
    }

    public void setISurfaceDetailsm(String iSurfaceDetailsm) {
        String oldISurfaceDetailsm = this.iSurfaceDetailsm;
        this.iSurfaceDetailsm = iSurfaceDetailsm;
        changeSupport.firePropertyChange("ISurfaceDetailsm", oldISurfaceDetailsm, iSurfaceDetailsm);
    }

    public String getIa1s() {
        return ia1s;
    }

    public void setIa1s(String ia1s) {
        String oldIa1s = this.ia1s;
        this.ia1s = ia1s;
        changeSupport.firePropertyChange("ia1s", oldIa1s, ia1s);
    }

    public String getIa1m() {
        return ia1m;
    }

    public void setIa1m(String ia1m) {
        String oldIa1m = this.ia1m;
        this.ia1m = ia1m;
        changeSupport.firePropertyChange("ia1m", oldIa1m, ia1m);
    }

    public String getIa2s() {
        return ia2s;
    }

    public void setIa2s(String ia2s) {
        String oldIa2s = this.ia2s;
        this.ia2s = ia2s;
        changeSupport.firePropertyChange("ia2s", oldIa2s, ia2s);
    }

    public String getIa2m() {
        return ia2m;
    }

    public void setIa2m(String ia2m) {
        String oldIa2m = this.ia2m;
        this.ia2m = ia2m;
        changeSupport.firePropertyChange("ia2m", oldIa2m, ia2m);
    }

    public String getIa3s() {
        return ia3s;
    }

    public void setIa3s(String ia3s) {
        String oldIa3s = this.ia3s;
        this.ia3s = ia3s;
        changeSupport.firePropertyChange("ia3s", oldIa3s, ia3s);
    }

    public String getIa3m() {
        return ia3m;
    }

    public void setIa3m(String ia3m) {
        String oldIa3m = this.ia3m;
        this.ia3m = ia3m;
        changeSupport.firePropertyChange("ia3m", oldIa3m, ia3m);
    }

    public String getIa4s() {
        return ia4s;
    }

    public void setIa4s(String ia4s) {
        String oldIa4s = this.ia4s;
        this.ia4s = ia4s;
        changeSupport.firePropertyChange("ia4s", oldIa4s, ia4s);
    }

    public String getIa4m() {
        return ia4m;
    }

    public void setIa4m(String ia4m) {
        String oldIa4m = this.ia4m;
        this.ia4m = ia4m;
        changeSupport.firePropertyChange("ia4m", oldIa4m, ia4m);
    }

    public String getIa5s() {
        return ia5s;
    }

    public void setIa5s(String ia5s) {
        String oldIa5s = this.ia5s;
        this.ia5s = ia5s;
        changeSupport.firePropertyChange("ia5s", oldIa5s, ia5s);
    }

    public String getIa5m() {
        return ia5m;
    }

    public void setIa5m(String ia5m) {
        String oldIa5m = this.ia5m;
        this.ia5m = ia5m;
        changeSupport.firePropertyChange("ia5m", oldIa5m, ia5m);
    }

    public String getIa6s() {
        return ia6s;
    }

    public void setIa6s(String ia6s) {
        String oldIa6s = this.ia6s;
        this.ia6s = ia6s;
        changeSupport.firePropertyChange("ia6s", oldIa6s, ia6s);
    }

    public String getIa6m() {
        return ia6m;
    }

    public void setIa6m(String ia6m) {
        String oldIa6m = this.ia6m;
        this.ia6m = ia6m;
        changeSupport.firePropertyChange("ia6m", oldIa6m, ia6m);
    }

    public String getIstartdate() {
        return istartdate;
    }

    public void setIstartdate(String istartdate) {
        String oldIstartdate = this.istartdate;
        this.istartdate = istartdate;
        changeSupport.firePropertyChange("istartdate", oldIstartdate, istartdate);
    }

    public String getIenddate() {
        return ienddate;
    }

    public void setIenddate(String ienddate) {
        String oldIenddate = this.ienddate;
        this.ienddate = ienddate;
        changeSupport.firePropertyChange("ienddate", oldIenddate, ienddate);
    }

    public String getIttaken() {
        return ittaken;
    }

    public void setIttaken(String ittaken) {
        String oldIttaken = this.ittaken;
        this.ittaken = ittaken;
        changeSupport.firePropertyChange("ittaken", oldIttaken, ittaken);
    }

    public Integer getTotalGrindingTime() {
        return totalGrindingTime;
    }

    public void setTotalGrindingTime(Integer totalGrindingTime) {
        Integer oldTotalGrindingTime = this.totalGrindingTime;
        this.totalGrindingTime = totalGrindingTime;
        changeSupport.firePropertyChange("totalGrindingTime", oldTotalGrindingTime, totalGrindingTime);
    }

    public String getGsMachine() {
        return gsMachine;
    }

    public void setGsMachine(String gsMachine) {
        String oldGsMachine = this.gsMachine;
        this.gsMachine = gsMachine;
        changeSupport.firePropertyChange("gsMachine", oldGsMachine, gsMachine);
    }

    public String getGsTool() {
        return gsTool;
    }

    public void setGsTool(String gsTool) {
        String oldGsTool = this.gsTool;
        this.gsTool = gsTool;
        changeSupport.firePropertyChange("gsTool", oldGsTool, gsTool);
    }

    public String getGsProcessing() {
        return gsProcessing;
    }

    public void setGsProcessing(String gsProcessing) {
        String oldGsProcessing = this.gsProcessing;
        this.gsProcessing = gsProcessing;
        changeSupport.firePropertyChange("gsProcessing", oldGsProcessing, gsProcessing);
    }

    public String getGsStatus() {
        return gsStatus;
    }

    public void setGsStatus(String gsStatus) {
        String oldGsStatus = this.gsStatus;
        this.gsStatus = gsStatus;
        changeSupport.firePropertyChange("gsStatus", oldGsStatus, gsStatus);
    }

    public String getGsStart() {
        return gsStart;
    }

    public void setGsStart(String gsStart) {
        String oldGsStart = this.gsStart;
        this.gsStart = gsStart;
        changeSupport.firePropertyChange("gsStart", oldGsStart, gsStart);
    }

    public String getGsEnd() {
        return gsEnd;
    }

    public void setGsEnd(String gsEnd) {
        String oldGsEnd = this.gsEnd;
        this.gsEnd = gsEnd;
        changeSupport.firePropertyChange("gsEnd", oldGsEnd, gsEnd);
    }

    public String getGsTime() {
        return gsTime;
    }

    public void setGsTime(String gsTime) {
        String oldGsTime = this.gsTime;
        this.gsTime = gsTime;
        changeSupport.firePropertyChange("gsTime", oldGsTime, gsTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serialNo != null ? serialNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grinding)) {
            return false;
        }
        Grinding other = (Grinding) object;
        if ((this.serialNo == null && other.serialNo != null) || (this.serialNo != null && !this.serialNo.equals(other.serialNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "opticalworkshopmonitoringsystem.Grinding[ serialNo=" + serialNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
