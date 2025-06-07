package com.staystack.backend.service;


import com.staystack.backend.dto.HotelDto;
import com.staystack.backend.dto.HotelPriceDto;
import com.staystack.backend.dto.HotelSearchRequest;
import com.staystack.backend.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);

}
