package com.project_hotel.hotel_api.repo;

import com.project_hotel.hotel_api.entity.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilitiesRepo extends JpaRepository<Facilities, Long> {
}
