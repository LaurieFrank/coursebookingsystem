package com.codeclan.example.Course.Booking.System.repositories;


import com.codeclan.example.Course.Booking.System.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findAllByDate(String date);
}
