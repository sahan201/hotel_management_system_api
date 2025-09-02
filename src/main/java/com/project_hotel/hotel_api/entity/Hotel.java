package com.project_hotel.hotel_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @Column(name = "hotel_id", nullable = false, unique = true, length = 255)
    private String hotelId;

    @Column(name = "hotel_name", nullable = false, length = 255)
    private String hotelName;

    @Column(name = "star_rating", nullable = false)
    private int starRating;

    @Column(name = "description")
    @Lob
    private Blob description;
    // Lob => long object
    // Blob =>  can store multi media files.

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "active_status", nullable = false)
    private boolean activeStatus;

    @Column(name= "starting_from", nullable = false, precision = 8, scale = 2)
    private BigDecimal startingFrom;
}
