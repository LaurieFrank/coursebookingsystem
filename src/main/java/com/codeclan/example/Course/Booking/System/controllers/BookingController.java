package com.codeclan.example.Course.Booking.System.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    BookingsRepository bookingsRepository;
}
