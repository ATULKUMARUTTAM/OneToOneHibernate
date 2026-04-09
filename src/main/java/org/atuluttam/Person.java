package org.atuluttam;

import jakarta.persistence.*;

@Entity
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int pid;

    public String name;


    @OneToOne(optional = false, cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name = "laptop_id", nullable = false)
    public Laptop laptop;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Person()
    {
    }

    public Person(String name, Laptop laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                '}';
    }
}
