package com.codeclan.example.bookingService.controllers;

import com.codeclan.example.bookingService.repositories.BookingRepository;
import com.codeclan.example.bookingService.repositories.CourseRepository;
import com.codeclan.example.bookingService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity getAllBookingsAndFilters(
            @RequestParam(required = false, name = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam(required = false, name = "course") String course,
            @RequestParam(required = false, name = "customer") String customer
    ) {

        // if we have the date int then do the date query
        if (date != null) {
            return new ResponseEntity(bookingRepository.findByDate(date), HttpStatus.OK);
        }

        return new ResponseEntity(bookingRepository.findAll(), HttpStatus.OK);
    }
}
