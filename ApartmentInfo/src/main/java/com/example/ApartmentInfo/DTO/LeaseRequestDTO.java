package com.example.ApartmentInfo.DTO;

import lombok.NonNull;

import java.util.Date;

public class LeaseRequestDTO {
    private int pid;

    private String uname;
    private String uphone;
    private String uemail;
    private String password;
    private double rent;

    private Date startdate;
    private Date enddate;

    public LeaseRequestDTO(int pid, String uname, String uphone, String uemail, String password, double rent, Date startdate, Date enddate) {
        this.pid = pid;
        this.uname = uname;
        this.uphone = uphone;
        this.uemail = uemail;
        this.password = password;
        this.rent = rent;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}
