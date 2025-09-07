package com.project_hotel.hotel_api.repo;

import com.project_hotel.hotel_api.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel, String> {
}
