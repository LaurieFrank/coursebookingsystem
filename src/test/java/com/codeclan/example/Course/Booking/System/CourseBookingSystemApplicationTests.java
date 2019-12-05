package com.codeclan.example.Course.Booking.System;

import com.codeclan.example.Course.Booking.System.models.Course;
import com.codeclan.example.Course.Booking.System.models.Customer;
import com.codeclan.example.Course.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Course.Booking.System.repositories.coursesRepositories.CourseRepository;
import com.codeclan.example.Course.Booking.System.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindAllCourseByRating(){
		List<Course> foundCourses = courseRepository.findAllCourseByRating(4);
		assertEquals(1, foundCourses.size());
		assertEquals("Intro to Networking", foundCourses.get(0).getName());
	}

	@Test
	public void canFindAllCustomersByCourse(){
		List<Customer> foundCustomers = courseRepository.findAllCustomersByCourse(1L);
		assertEquals(2, foundCustomers.size());
	}

}
