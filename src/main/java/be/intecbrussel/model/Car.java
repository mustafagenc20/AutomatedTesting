package be.intecbrussel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String anotherProperty;
    private Integer aThirdProperty;

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

    public String getAnotherProperty() {
        return anotherProperty;
    }

    public void setAnotherProperty(String anotherProperty) {
        this.anotherProperty = anotherProperty;
    }

    public Integer getaThirdProperty() {
        return aThirdProperty;
    }

    public void setaThirdProperty(Integer aThirdProperty) {
        this.aThirdProperty = aThirdProperty;
    }
}
