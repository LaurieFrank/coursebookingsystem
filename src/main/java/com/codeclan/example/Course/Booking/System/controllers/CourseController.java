package com.codeclan.example.Course.Booking.System.controllers;

import com.codeclan.example.Course.Booking.System.models.Course;
import com.codeclan.example.Course.Booking.System.repositories.coursesRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getAllCourseByRating(@PathVariable int rating){
        return courseRepository.findAllCourseByRating(rating);
    }
}
