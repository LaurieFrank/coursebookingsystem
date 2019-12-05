package com.codeclan.example.Course.Booking.System.repositories.coursesRepositories;

import com.codeclan.example.Course.Booking.System.models.Course;
import com.codeclan.example.Course.Booking.System.models.Customer;

import java.util.List;

public interface CustomisedCourseRepository {
    List<Customer> findAllCustomersByCourse (Long id);

}
