package com.interio.springbootdemo.controllers.web

import com.interio.springbootdemo.services.ReservationService
import com.interio.springbootdemo.utils.DateUtils
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/room_reservations")
class RoomReservationWebController(
    private val dateUtils: DateUtils,
    private val reservationService: ReservationService
) {

    @GetMapping
    fun getReservations(@RequestParam(value = "date", required = false) dateString: String?, model: Model) : String {
        val roomReservations = reservationService.getRoomReservationsForDate(dateUtils.createDateFromString(dateString))
        model.addAttribute("roomReservations", roomReservations)
        return "room_reservations"
    }
}