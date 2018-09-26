package com.kado.useralert.model;

public class User {


    private Integer userId;
    private String seasameId;
    private String email;
    private String windowsId;
    private String indianaId ;

    public String getIndianaId() {
        return indianaId;
    }

    public void setIndianaId(String indianaId) {
        this.indianaId = indianaId;
    }

    public User() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSeasameId() {
        return seasameId;
    }

    public void setSeasameId(String seasameId) {
        this.seasameId = seasameId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWindowsId() {
        return windowsId;
    }

    public void setWindowsId(String windowsId) {
        this.windowsId = windowsId;
    }
}