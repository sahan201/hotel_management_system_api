package com.project_hotel.hotel_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "room_images")
public class RoomImages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Long id;

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;
}
