/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernateembeddedrevision;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/**
 *
 * @author Administrator
 */
@Entity
public class Student {
    
    @Id
    private int sid;
    private int marks;
    private String sname;
    private Address a;
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }
    
    
    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", marks=" + marks + ", sname=" + sname + '}';
    }
    
    
}
