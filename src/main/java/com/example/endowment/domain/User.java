package com.example.endowment.domain;

import java.util.Date;

public class User {
    private Long id;

    private Integer version;

    private String login;

    private String email;

    private String name;

    private String password;

    private String salt;

    private String rands;

    private String company;

    private Long orgId;

    private Boolean isAdmin;

    private Boolean emailVerified;

    private String theme;

    private Date created;

    private Date updated;

    private Long helpFlags1;

    private Date lastSeenAt;

    private Boolean isDisabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRands() {
        return rands;
    }

    public void setRands(String rands) {
        this.rands = rands;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Long getHelpFlags1() {
        return helpFlags1;
    }

    public void setHelpFlags1(Long helpFlags1) {
        this.helpFlags1 = helpFlags1;
    }

    public Date getLastSeenAt() {
        return lastSeenAt;
    }

    public void setLastSeenAt(Date lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", login=").append(login);
        sb.append(", email=").append(email);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", rands=").append(rands);
        sb.append(", company=").append(company);
        sb.append(", orgId=").append(orgId);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", emailVerified=").append(emailVerified);
        sb.append(", theme=").append(theme);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", helpFlags1=").append(helpFlags1);
        sb.append(", lastSeenAt=").append(lastSeenAt);
        sb.append(", isDisabled=").append(isDisabled);
        sb.append("]");
        return sb.toString();
    }
}