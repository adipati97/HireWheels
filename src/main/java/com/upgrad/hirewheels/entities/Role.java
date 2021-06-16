package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_id")
    private int id;

    @Column(name = "role_name", nullable = false, unique = true)
    private String name;

    public int getRoleId() {
        return id;
    }

    public void setRoleId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return name;
    }

    public void setRoleName(String name) {
        this.name = name;
    }

    public Role (int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return
            "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
            '}';
    }
}
