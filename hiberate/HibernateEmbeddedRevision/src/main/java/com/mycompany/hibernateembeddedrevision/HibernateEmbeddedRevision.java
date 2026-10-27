/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hibernateembeddedrevision;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Administrator
 */
public class HibernateEmbeddedRevision {

    public static void main(String[] args) {
      Address a = new Address();
      a.setCity("Pune");
      a.setPincode("41241");
      a.setState("Maharashtra");
         
        Student s = new Student();
        s.setA(a);
        s.setMarks(44);
        s.setSid(9);
        s.setSname("Pant");
        
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate-cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
    
        session.persist(s) ;
        tx.commit();
        System.out.println(s);
    }
}
