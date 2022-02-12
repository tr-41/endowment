package com.example.endowment.domain;

public class Euser {
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", idnumber=").append(idnumber);
        sb.append(", address=").append(address);
        sb.append(", account=").append(account);
        sb.append(", disability=").append(disability);
        sb.append(", familyplanning=").append(familyplanning);
        sb.append(", poverty=").append(poverty);
        sb.append("]");
        return sb.toString();
    }
}