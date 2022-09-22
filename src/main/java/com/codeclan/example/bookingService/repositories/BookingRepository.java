package com.codeclan.example.bookingService.repositories;

import com.codeclan.example.bookingService.models.Booking;
import com.codeclan.example.bookingService.models.Course;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByDate(LocalDate date);

    List<Course> findByCourse(Course course);

}
