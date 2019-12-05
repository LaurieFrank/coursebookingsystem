package com.codeclan.example.Course.Booking.System.repositories.coursesRepositories;

import com.codeclan.example.Course.Booking.System.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CustomisedCourseRepository {
    List<Course> findAllCourseByRating (int rating);

}


