package com.minipackage.minipackage.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class ReceiverInfo {
    @Id
    @Column(unique = true)
    @NotNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String name;
    String phoneNumber;

    @OneToMany(mappedBy = "receiverInfo")
    List<Packages> packages;

    public List<Packages> getPackages() {
        return packages;
    }

    public void setPackages(List<Packages> packages) {
        this.packages = packages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
