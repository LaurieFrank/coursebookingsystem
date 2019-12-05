package com.codeclan.example.Course.Booking.System.repositories.customersRepositries;

import com.codeclan.example.Course.Booking.System.models.Course;
import com.codeclan.example.Course.Booking.System.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomisedCustomerRepositoryImpl implements CustomisedCustomerRepository{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Course> findAllCoursesByCustomer(Long id){
        List<Course> result = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Course.class);
        criteria.createAlias("bookings", "booking");
        criteria.add(Restrictions.eq("booking.customer.id", id));
        result = criteria.list();
        return result;
    }
}
