package com.example.demo;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "historique")


public class Historique {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="id_historique")
    private Integer idHistorique;

    private String action;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="id_user")
    private User user;

    public Historique() {
    }

    public Historique(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Historique{" +
                "id=" + idHistorique +
                ", action='" + action + '\'' +
                '}';
    }



    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public Integer getIdHistorique() {
        return idHistorique;
    }

    public void setIdHistorique(Integer idHistorique) {
        this.idHistorique = idHistorique;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
