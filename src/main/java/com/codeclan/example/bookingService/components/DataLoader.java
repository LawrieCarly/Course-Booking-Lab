package com.codeclan.example.bookingService.components;

import com.codeclan.example.bookingService.models.Booking;
import com.codeclan.example.bookingService.models.Course;
import com.codeclan.example.bookingService.models.Customer;
import com.codeclan.example.bookingService.repositories.BookingRepository;
import com.codeclan.example.bookingService.repositories.CourseRepository;
import com.codeclan.example.bookingService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    LocalDate date1 = LocalDate.of(2022, Month.SEPTEMBER, 22);

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        Course course = new Course("Python", "Edinburgh", 5);
        courseRepository.save(course);

        Customer customer = new Customer("John", "Edinburgh", 30);
        customerRepository.save(customer);

        Booking booking = new Booking(date1, course, customer);
        bookingRepository.save(booking);


    }
}


