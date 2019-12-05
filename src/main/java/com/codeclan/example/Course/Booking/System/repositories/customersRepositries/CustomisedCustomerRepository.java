package com.codeclan.example.Course.Booking.System.repositories.customersRepositries;

import com.codeclan.example.Course.Booking.System.models.Course;

import java.util.List;

public interface CustomisedCustomerRepository {
    List<Course> findAllCoursesByCustomer (Long id);
}
