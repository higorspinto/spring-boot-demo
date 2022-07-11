package com.interio.springbootdemo.controllers.api

import com.interio.springbootdemo.domain.RoomReservation
import com.interio.springbootdemo.services.ReservationService
import com.interio.springbootdemo.utils.DateUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/room_reservations")
class RoomReservationApiController(
    private val reservationService: ReservationService,
    private val dateUtils: DateUtils
) {

    @GetMapping
    fun getRoomReservations(@RequestParam(name="date", required = false) dateString: String?): List<RoomReservation>? {
        return reservationService.getRoomReservationsForDate(dateUtils.createDateFromString(dateString))
    }
}