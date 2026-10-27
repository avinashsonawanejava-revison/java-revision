/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernateembeddedrevision;

import jakarta.persistence.Embeddable;
/**
 *
 * @author Administrator
 */
@Embeddable
public class Address {
    
    
     private String city;
    private String state;
    private String pincode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", state=" + state + ", pincode=" + pincode + '}';
    }
    
    
}
