package org.atuluttam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PersonDAO
{
    //CRUD Operations on Person Entity
    public void insertPerson(SessionFactory sf)
    {
        Session s1 = sf.openSession();
        Transaction t1 = s1.beginTransaction();
        Person p = new Person();
        p.setName("ABC");
        Laptop l1 = new Laptop();
        l1.setBrand("Dell");
        p.setLaptop(l1);
        s1.persist(p);
        t1.commit();
        s1.close();
        System.out.println("Person object saved!!!");
    }
    public void updatePerson(SessionFactory sf, int pid)
    {
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Person oldPerson = s.find(Person.class, pid);
        if(oldPerson != null)
        {
            oldPerson.setName("ABC CDE");
            s.merge(oldPerson);
            t.commit();
            System.out.println("Person object updated!!!");
        }
        else
        {
            System.out.println("Person object not found for update!!!");
        }
        s.close();
    }
    public void deleteAPerson(SessionFactory sf, int pid)
    {
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Person oldPerson = s.find(Person.class, pid);
        if(oldPerson != null)
        {
            s.remove(oldPerson);
            t.commit();
            System.out.println("Person object deleted!!!");
        }
        else
        {
            System.out.println("Person object not found for deletion!!!");
        }
        s.close();
    }

    public void getAPerson(SessionFactory sf, int pid)
    {
        Session s = sf.openSession();
      //  Transaction t = s.beginTransaction();
        Person oldPerson = s.find(Person.class, pid);
        if(oldPerson != null)
        {
            System.out.println("Person Details!!!");
            System.out.println(oldPerson);
            System.out.println(oldPerson.getLaptop());
        }
        else
        {
            System.out.println("Person object not found!!!");
        }
        s.close();
    }

    public void getAllPerson(SessionFactory sf)
    {
        Session s = sf.openSession();
        Query q = s.createQuery("from Person");

        System.out.println("All Person Details!!!");
        List<Person> ls = q.getResultList();

        for(Person p :ls)
        {
            System.out.println(p);
            System.out.println(p.getLaptop());
        }
        s.close();
    }



}
