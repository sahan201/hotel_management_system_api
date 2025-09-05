package com.project_hotel.hotel_api.entity;

import jakarta.persistence.*;

import java.util.List;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "room",fetch = FetchType.LAZY)
    private List<Facilities> facilities;

    @OneToMany(mappedBy = "room")
    private List<RoomImages> roomImages;
}
