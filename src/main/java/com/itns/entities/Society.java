package com.itns.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Document
public class Society implements Serializable {


    @Id
    private String id;

    private String nom;
    private String address;
    private String tel1;
    private String tel2;
    private String sector;
    private String activity;
    private String droits;
    private String codePostale;
    private String ville;
    private String notes;
    private String precision;
    private String email;
    private String linkedIn;
    
    @DBRef
    private Collection<Propect> propects=new ArrayList<>();

    public Society() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<Propect> getPropects() {
        return propects;
    }

    public void setPropects(Collection<Propect> propects) {
        this.propects = propects;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDroits() {
        return droits;
    }

    public void setDroits(String droits) {
        this.droits = droits;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    @Override
    public String toString() {
        return "Society{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", address='" + address + '\'' +
                ", tel1='" + tel1 + '\'' +
                ", tel2='" + tel2 + '\'' +
                ", sector='" + sector + '\'' +
                ", activity='" + activity + '\'' +
                ", droits='" + droits + '\'' +
                ", codePostale='" + codePostale + '\'' +
                ", ville='" + ville + '\'' +
                ", notes='" + notes + '\'' +
                ", precision='" + precision + '\'' +
                ", email='" + email + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                '}';
    }
}
