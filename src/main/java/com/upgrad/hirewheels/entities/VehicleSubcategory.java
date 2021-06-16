package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_subcategory")
public class VehicleSubcategory {

    @Id
    @GeneratedValue
    @Column(name = "vehicle_subcategory_id")
    private int id;

    @Column(name = "vehicle_subcategory_name", nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "price_per_day", nullable = false)
    private float pricePerDay;

    @Column(name = "vehicle_category_id", nullable = false)
    private int vehicleCategoryId;

    public int getVehicleSubcategoryId() {
        return id;
    }

    public void setVehicleSubcategoryId(int id) {
        this.id = id;
    }

    public String getVehicleSubcategoryName() {
        return name;
    }

    public void setVehicleSubcategoryName(String name) {
        this.name = name;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public VehicleSubcategory(
        int id,
        String name,
        float pricePerDay,
        int vehicleCategoryId
    ) {
        this.id = id;
        this.name = name;
        this.pricePerDay = pricePerDay;
        this.vehicleCategoryId = vehicleCategoryId;
    }

    @Override
    public String toString() {
        return
            "VehicleSubcategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", vehicleCategoryId=" + vehicleCategoryId +
            '}';
    }
}
