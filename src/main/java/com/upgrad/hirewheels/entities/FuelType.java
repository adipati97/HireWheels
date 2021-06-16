package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "fuel_type")
public class FuelType {

    @Id
    @GeneratedValue
    @Column(name = "fuel_type_id")
    private int id;

    @Column(name = "fuel_type", nullable = false, length = 50, unique = true)
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FuelType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return
            "FuelType{" +
                "id=" + id +
                ", type='" + type + '\'' +
            '}';
    }
}
