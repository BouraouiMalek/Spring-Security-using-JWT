package com.example.maleksecurity.Request;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.Set;

public class SignupRequest {

    private String username;


    private String email;

    private Set<String> role;


    private String password;

    private String adresse;

    private int tel;

    @Temporal(value= TemporalType.DATE)

    private Date date_naissance;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public int getTel() {
        return tel;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}

