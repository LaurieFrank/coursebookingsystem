package com.codeclan.example.Course.Booking.System.repositories;

import com.codeclan.example.Course.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
