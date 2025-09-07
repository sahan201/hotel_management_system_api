package com.project_hotel.hotel_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name= "address")
public class Address {

    @Id
    @Column(name = "address_id", nullable = false)
    private String addressId;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "longitude", nullable = false, precision = 8, scale = 2)
    private BigDecimal longitude;

    @Column(name = "latitude", nullable = false, precision = 8, scale = 2)
    private BigDecimal latitude;

    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

}
