package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by root on 9/11/15.
 */
@Entity
@Table(name="cat")
public class Cat {

    @Id
    @GeneratedValue(generator="idIncrementor")
    @GenericGenerator(name="idIncrementor" , strategy="increment")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "fur")
    private String fur;
    @Column(name = "weight")
    private int weight;
    @Column(name = "age")
    private int age;

    public Cat(){};

    public Cat(int id, String name, String fur, int weight, int age) {
        this.id = id;
        this.name = name;
        this.fur = fur;
        this.weight = weight;
        this.age = age;
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

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
