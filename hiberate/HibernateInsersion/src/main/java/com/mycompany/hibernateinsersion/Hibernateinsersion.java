/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hibernateinsersion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Administrator
 */
public class Hibernateinsersion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Employee e = null;
        e = session.find(Employee.class, 6);
        System.out.println(e);
                
        Transaction tx = session.beginTransaction();
        //e.setEmpname("Rohit sharma");
        //session.merge(e);
        session.remove(e);
        tx.commit();
            
        
        
    }
}
