package com.mycompany.hibernateinsersion;


import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

@Entity
@Table(name="employee")
public class Employee {
@Id
private int empid;
private int salary;
private String empname;

    public Employee() {
    }


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    @Override
    public String toString() {
        return "employee{" + "empid=" + empid + ", salary=" + salary + ", empname=" + empname + '}';
    }

}
