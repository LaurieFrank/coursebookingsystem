package com.codeclan.example.Course.Booking.System.components;

import com.codeclan.example.Course.Booking.System.models.Booking;
import com.codeclan.example.Course.Booking.System.models.Course;
import com.codeclan.example.Course.Booking.System.models.Customer;
import com.codeclan.example.Course.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Course.Booking.System.repositories.coursesRepositories.CourseRepository;
import com.codeclan.example.Course.Booking.System.repositories.customersRepositries.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Intro to Networking", "Edinburgh", 4);
        courseRepository.save(course1);

        Customer customer1 = new Customer("John", "Glasgow", 32);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Perciville", "East Linton", 26);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("04/02/20", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("26/10/19", course1, customer2);
        bookingRepository.save(booking2);
    }

}
