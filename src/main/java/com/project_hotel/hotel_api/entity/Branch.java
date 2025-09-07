package com.project_hotel.hotel_api.entity;

import com.project_hotel.hotel_api.enums.BranchType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @Column(name = "branch_id", nullable = false, length = 255)
    private String branchId;

    @Column(name = "room_count", nullable = false)
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_type", nullable = false, length = 255)
    private BranchType branchType;

    @Column(name = "branch_name", nullable = false)
    private String branchName;

    @ManyToOne()
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @OneToOne()
    private Address address;

    @OneToMany(mappedBy = "branch")
    private List<Room> rooms;

}
