package com.example.maleksecurity.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_compte;

    private Long solde ;

    @ManyToOne(optional = false)
    //@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Temporal(value=TemporalType.TIME)

    private Date date_creation;

    public Compte(Long solde, User user, Date date_creation) {
        this.solde = solde;
        this.user = user;
        this.date_creation = date_creation;
    }

    public Compte() {
    }

    public Long getSolde() {
        return solde;
    }

    public void setSolde(Long solde) {
        this.solde = solde;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
