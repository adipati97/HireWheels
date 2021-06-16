package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue
    @Column(name = "location_id")
    private int id;

    @Column(name = "location_name", nullable = false, length = 50)
    private String name;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Column(name = "city_id", nullable = false)
    private int cityId;

    @Column(name = "pincode", nullable = false, length = 6)
    private String pincode;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Location(int id, String name, String address, int cityId, String pincode) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cityId = cityId;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return
            "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cityId=" + cityId +
                ", pincode='" + pincode + '\'' +
            '}';
    }
}
