package com.example.maleksecurity.Response;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private String adresse;

    private int tel;
    @Temporal(value= TemporalType.DATE)
    
    private Date date_naissance;

    private List<String> roles;

    public JwtResponse(String token, Long id, String username, String email, String adresse, int tel, Date date_naissance, List<String> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.adresse = adresse;
        this.tel = tel;
        this.date_naissance = date_naissance;
        this.roles = roles;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
