/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author fhuertas
 */
public class ClientDTO {

    private int id;
    private String name;
    private int document;
    private String lastname;
    private float purchasevalue;
    private String role;
    
    public ClientDTO() {
    }
    
     public ClientDTO(int id, String name, int document, String lastname, float purchasevalue, String role) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.lastname = lastname;
        this.purchasevalue = purchasevalue;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getPurchasevalue() {
        return purchasevalue;
    }

    public void setPurchasevalue(float purchasevalue) {
        this.purchasevalue = purchasevalue;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
