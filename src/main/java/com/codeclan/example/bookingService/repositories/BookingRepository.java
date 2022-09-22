package com.codeclan.example.bookingService.repositories;

import com.codeclan.example.bookingService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
