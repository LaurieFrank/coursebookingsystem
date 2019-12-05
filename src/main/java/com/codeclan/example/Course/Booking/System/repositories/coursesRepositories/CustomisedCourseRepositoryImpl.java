package com.codeclan.example.Course.Booking.System.repositories.coursesRepositories;

import com.codeclan.example.Course.Booking.System.models.Booking;
import com.codeclan.example.Course.Booking.System.models.Course;
import com.codeclan.example.Course.Booking.System.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomisedCourseRepositoryImpl implements CustomisedCourseRepository{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Customer> findAllCustomersByCourse(Long id){
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Customer.class);
        criteria.createAlias("bookings", "booking");
        criteria.add(Restrictions.eq("booking.course.id", id));
        result = criteria.list();
        return result;
    }



}
