package org.atuluttam;

import jakarta.persistence.*;

@Entity
public class Laptop
{
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int lid;
    public String brand;

    @OneToOne(mappedBy = "laptop", cascade = CascadeType.ALL, orphanRemoval = true)
    public Person person;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Laptop() {
    }

    public Laptop(String brand, Person person) {
        this.brand = brand;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }
}
