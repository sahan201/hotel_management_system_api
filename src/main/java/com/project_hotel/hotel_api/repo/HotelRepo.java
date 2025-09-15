package com.project_hotel.hotel_api.repo;

import com.project_hotel.hotel_api.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HotelRepo extends JpaRepository<Hotel, String> {// String means primary key of Hotel is String
    @Query(value = "SELECT * FROM hotel WHERE hotel_name LIKE CONCAT('%', ?1, '%') AND active_status=true ", nativeQuery = true)
    public Page<Hotel> searchAllHotels(String searchText, Pageable pageable);
    // this is a method. returns a paginated result.
    //Spring automatically handles pagination with the Pageable parameter.

    @Query(value = "SELECT COUNT(*) FROM hotel WHERE hotel_name LIKE CONCAT('%', ?1, '%') AND active_status=true ", nativeQuery = true)
    public long countAllHotels(String searchText);
    //Similar query as above, but instead of returning hotels, it returns the number of matching hotels.

}
