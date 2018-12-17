package com.example.demo;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")

public class User {

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JsonManagedReference

    private List<Historique> historiques;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "contact_nom")
    private String contactNom;

    @Column(name = "contact_prenom")
    private String contactPrenom;

    @Column(name = "contact_pseudo")
    private String contactPseudo;

    @Column(name = "contact_mail")
    private String contactMail;

    @Column(name = "contact_mdp")
    private String contactMdp;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", contactNom='" + contactNom + '\'' +
                ", contactPrenom='" + contactPrenom + '\'' +
                ", contactPseudo='" + contactPseudo + '\'' +
                ", contactMail='" + contactMail + '\'' +
                ", contactMdp='" + contactMdp + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String contactNom, String contactPrenom, String contactPseudo, String contactMail, String contactMdp) {
        this.id = id;
        this.contactNom = contactNom;
        this.contactPrenom = contactPrenom;
        this.contactPseudo = contactPseudo;
        this.contactMail = contactMail;
        this.contactMdp = contactMdp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContactNom() {
        return contactNom;
    }

    public void setContactNom(String contactNom) {
        this.contactNom = contactNom;
    }

    public String getContactPrenom() {
        return contactPrenom;
    }

    public void setContactPrenom(String contactPrenom) {
        this.contactPrenom = contactPrenom;
    }

    public String getContactPseudo() {
        return contactPseudo;
    }

    public void setContactPseudo(String contactPseudo) {
        this.contactPseudo = contactPseudo;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

    public String getContactMdp() {
        return contactMdp;
    }

    public void setContactMdp(String contactMdp) {
        this.contactMdp = contactMdp;
    }

    public List<Historique> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<Historique> historiques) {
        this.historiques = historiques;
    }
}
