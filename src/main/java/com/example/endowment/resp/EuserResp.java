package com.example.endowment.resp;

public class EuserResp {
    private Long id;

    private String name;

    private String idnumber;

    private String address;

    private String account;

    private String disability;

    private String familyplanning;

    private String poverty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getFamilyplanning() {
        return familyplanning;
    }

    public void setFamilyplanning(String familyplanning) {
        this.familyplanning = familyplanning;
    }

    public String getPoverty() {
        return poverty;
    }

    public void setPoverty(String poverty) {
        this.poverty = poverty;
    }

    @Override
    public String toString() {
        return "EuserResp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", address='" + address + '\'' +
                ", account='" + account + '\'' +
                ", disability='" + disability + '\'' +
                ", familyplanning='" + familyplanning + '\'' +
                ", poverty='" + poverty + '\'' +
                '}';
    }
}
