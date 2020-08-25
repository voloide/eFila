package org.celllife.idart.database.hibernate;

import org.celllife.idart.misc.iDARTUtil;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "sync_openmrs_patient")
public class SyncOpenmrsPatient {
    @Id
    @GeneratedValue
    private Integer id;
    private String cellphone;
    private Date dateofbirth;
    private int clinic;
    private String firstnames;
    private String homephone;
    private String lastname;
    private String patientid;
    private String province;
    private Character sex;
    private Character syncstatus;
    private String workphone;
    private String address1;
    private String address2;
    private String address3;
    private String nextofkinname;
    private String nextofkinphone;
    private String race;
    private String uuidopenmrs;
    private String syncuuid ;

    public SyncOpenmrsPatient() {
        super();
        this.syncuuid = UUID.randomUUID().toString();
    }

    public String getFullAddress() {
        return ((address1 == null || "".equals(address1)) ? "" : address1)
                + ((address2 == null || "".equals(address2)) ? "" : "; "
                + address2)
                + ((address3 == null || "".equals(address3)) ? "" : "; "
                + address3);
    }

    /**
     * Method getAge.
     *
     * @return int
     */
    public int getAge() {
        return getAgeAt(null);
    }

    public int getAgeAt(Date date) {
        return iDARTUtil.getAgeAt(getDateofbirth() == null ? new Date()
                : getDateofbirth(), date);
    }

    /**
     * Method getClinic.
     *
     * @return Clinic
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurrentclinic() {
        return clinic;
    }

    public char getSyncstatus(){
        return syncstatus;
    }

    public void setSyncstatus(char syncstatus) {
        this.syncstatus = syncstatus;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getClinic() {
        return clinic;
    }

    public void setClinic(int clinic) {
        this.clinic = clinic;
    }

    public String getFirstnames() {
        return firstnames;
    }

    public void setFirstnames(String firstnames) {
        this.firstnames = firstnames;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getWorkphone() {
        return workphone;
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getNextofkinname() {
        return nextofkinname;
    }

    public void setNextofkinname(String nextofkinname) {
        this.nextofkinname = nextofkinname;
    }

    public String getNextofkinphone() {
        return nextofkinphone;
    }

    public void setNextofkinphone(String nextofkinphone) {
        this.nextofkinphone = nextofkinphone;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getUuid() {
        return uuidopenmrs;
    }

    public void setUuid(String uuid) {
        this.uuidopenmrs = uuid;
    }

    public String getSyncuuid() {
        return syncuuid;
    }

    public void setSyncuuid(String syncuuid) {
        this.syncuuid = syncuuid;
    }

    @Override
    public String toString() {
        return getFirstnames() + " " + getLastname() + " - "+ getPatientid();
    }

}
