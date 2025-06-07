package com.staystack.backend.service;

import com.staystack.backend.dto.HotelDto;
import com.staystack.backend.dto.HotelInfoDto;


public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);
    HotelInfoDto getHotelInfoById(Long hotelId);
}
