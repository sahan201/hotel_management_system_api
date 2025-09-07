package com.project_hotel.hotel_api.repo;

import com.project_hotel.hotel_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, String> {
}
