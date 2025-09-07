package com.project_hotel.hotel_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facilities")
public class Facilities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;


}
