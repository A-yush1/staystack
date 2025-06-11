package com.staystack.backend.service;

import com.staystack.backend.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}