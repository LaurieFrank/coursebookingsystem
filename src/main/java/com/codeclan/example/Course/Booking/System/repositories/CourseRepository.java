package com.codeclan.example.Course.Booking.System.repositories;

import com.codeclan.example.Course.Booking.System.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
