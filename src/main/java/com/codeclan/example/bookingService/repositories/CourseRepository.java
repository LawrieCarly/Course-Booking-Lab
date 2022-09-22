package com.codeclan.example.bookingService.repositories;

import com.codeclan.example.bookingService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(int rating);

}
