package com.interio.springbootdemo.controllers.api

import com.interio.springbootdemo.models.Reservation
import com.interio.springbootdemo.repositories.ReservationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/reservations")
class ReservationApiController(
    @Autowired
    private val reservationRepository: ReservationRepository
) {

    @GetMapping
    fun getReservations() : Iterable<Reservation> {
        return reservationRepository.findAll()
    }
}