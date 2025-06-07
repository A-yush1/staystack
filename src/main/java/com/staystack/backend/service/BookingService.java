package com.staystack.backend.service;

import com.staystack.backend.dto.BookingDto;
import com.staystack.backend.dto.BookingRequest;
import com.staystack.backend.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
