package org.atuluttam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

//        Session s1 = sessionFactory.openSession();
//        Transaction t1 = s1.beginTransaction();
//
//        Laptop laptop = new Laptop();
//        laptop.setBrand("Dell");
//        Person person = new Person();
//        person.setName("ABC");
//        person.setLaptop(laptop);
//        s1.persist(person);
//
//        t1.commit();
//        s1.close();

//        Session s2 = sessionFactory.openSession();
//        Transaction t2 = s2.beginTransaction();
//        Person p = s2.find(Person.class, 1);
//        s2.remove(p);
//        t2.commit();
//        s2.close();

    }
}