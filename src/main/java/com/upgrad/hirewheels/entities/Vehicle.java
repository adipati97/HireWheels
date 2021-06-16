package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @Column(name = "vehicle_id")
    private int id;

    @Column(name = "vehicle_model", nullable = false, length = 50)
    private String model;

    @Column(name = "vehicle_number", nullable = false, length = 10)
    private String number;

    @Column(name = "vehicle_subcategory_id")
    private int subcategoryId;

    @Column(name = "color", nullable = false, length = 50)
    private String color;

    @Column(name = "location_id", nullable = false)
    private int locationId;

    @Column(name = "fuel_type_id", nullable = false)
    private int fuelTypeId;

    @Column(name = "availability_status", nullable = false)
    private int availabilityStatus;

    @Column(name = "vehicle_image_url", nullable = false, length = 500)
    private String imageUrl;

    public int getVehicleId() {
        return id;
    }

    public void setVehicleId(int id) {
        this.id = id;
    }

    public String getVehicleModel() {
        return model;
    }

    public void setVehicleModel(String model) {
        this.model = model;
    }

    public String getVehicleNumber() {
        return number;
    }

    public void setVehicleNumber(String number) {
        this.number = number;
    }

    public int getVehicleSubcategoryId() {
        return subcategoryId;
    }

    public void setVehicleSubcategoryId(int subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public int getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleImageUrl() {
        return imageUrl;
    }

    public void setVehicleImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Vehicle(
        int id,
        String model,
        String number,
        int subcategoryId,
        String color,
        int locationId,
        int fuelTypeId,
        int availabilityStatus,
        String imageUrl
    ) {
        this.id = id;
        this.model = model;
        this.number = number;
        this.subcategoryId = subcategoryId;
        this.color = color;
        this.locationId = locationId;
        this.fuelTypeId = fuelTypeId;
        this.availabilityStatus = availabilityStatus;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return
            "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", subcategoryId=" + subcategoryId +
                ", color='" + color + '\'' +
                ", locationId=" + locationId +
                ", fuelTypeId=" + fuelTypeId +
                ", availabilityStatus=" + availabilityStatus +
                ", imageUrl='" + imageUrl + '\'' +
            '}';
    }
}
