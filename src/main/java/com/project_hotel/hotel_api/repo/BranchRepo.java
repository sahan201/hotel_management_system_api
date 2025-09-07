package com.project_hotel.hotel_api.repo;

import com.project_hotel.hotel_api.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch, String> {
}
