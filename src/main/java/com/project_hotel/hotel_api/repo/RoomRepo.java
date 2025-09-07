package com.project_hotel.hotel_api.repo;

import com.project_hotel.hotel_api.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room, String> {
}
