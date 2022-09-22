package com.codeclan.example.bookingService.repositories;

import com.codeclan.example.bookingService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
