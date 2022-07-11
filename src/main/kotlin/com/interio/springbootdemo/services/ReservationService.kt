package com.interio.springbootdemo.services

import com.interio.springbootdemo.domain.RoomReservation
import com.interio.springbootdemo.repositories.GuestRepository
import com.interio.springbootdemo.repositories.ReservationRepository
import com.interio.springbootdemo.repositories.RoomRepository
import org.springframework.stereotype.Service
import java.util.Date

@Service
class ReservationService(
    val roomRepository: RoomRepository,
    val guestRepository: GuestRepository,
    val reservationRepository: ReservationRepository
) {

    fun getRoomReservationsForDate(date: Date): List<RoomReservation>? {
        var roomReservations = mutableListOf<RoomReservation>()
        val reservations = reservationRepository.findReservationByReservationDate(date)
        reservations.forEach {
            val room = roomRepository.findById(it.roomId).get()
            val guest = guestRepository.findById(it.guestId).get()
            roomReservations.add(RoomReservation(
                roomId = room.roomId,
                guestId = guest.guestId,
                roomName = room.roomName,
                roomNumber = room.roomNumber,
                firstName = guest.firstName,
                lastName = guest.lastName,
                date = date
            ))
        }
        return roomReservations
    }
}