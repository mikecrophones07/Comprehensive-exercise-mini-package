package com.minipackage.minipackage.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Packages {
    @Id
    @Column(unique = true)
    @NotNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long packageNumber;

    Integer weight;
    String status;
    String bookingTime;

    public Long getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Long packageNumber) {
        this.packageNumber = packageNumber;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }
}
