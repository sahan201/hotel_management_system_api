package com.project_hotel.hotel_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "room")
public class Room {

    @Id
    @Column(name = "room_id",  nullable = false)
    private String roomId;

    @Column(name = "room_number", nullable = false)
    private String roomNumber;

    @Column(name = "room_type", nullable = false, length = 255)
    private String roomType;

    @Column(name = "bed_count", nullable = false)
    private int bedCount;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;
}
