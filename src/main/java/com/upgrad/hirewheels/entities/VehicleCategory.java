package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_category")
public class VehicleCategory {

    @Id
    @GeneratedValue
    @Column(name = "vehicle_category_id")
    private int id;

    @Column(name = "vehicle_category_name", nullable = false, unique = true, length = 50)
    private String name;

    public int getVehicleCategoryId() {
        return id;
    }

    public void setVehicleCategoryId(int id) {
        this.id = id;
    }

    public String getVehicleCategoryName() {
        return name;
    }

    public void setVehicleCategoryName(String name) {
        this.name = name;
    }

    public VehicleCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return
            "VehicleCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
            '}';
    }
}
