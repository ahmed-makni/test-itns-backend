package com.itns.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
@Document
public class Propect implements Serializable {

    @Id
    private String id;
    private String titre;
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    private Date rappel;
    private String linkedIn;
    private String Observations;

    @DBRef
    private Society society;

    public Propect() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRappel() {
        return rappel;
    }

    public void setRappel(Date rappel) {
        this.rappel = rappel;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getObservations() {
        return Observations;
    }

    public void setObservations(String observations) {
        Observations = observations;
    }

    public Society getSociety() {
        return society;
    }

    public void setSociety(Society society) {
        this.society = society;
    }

    @Override
    public String toString() {
        return "Propect{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", rappel=" + rappel +
                ", linkedIn='" + linkedIn + '\'' +
                ", Observations='" + Observations + '\'' +
                ", society=" + society +
                '}';
    }
}
