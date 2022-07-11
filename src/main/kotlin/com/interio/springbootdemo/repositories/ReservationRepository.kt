package com.interio.springbootdemo.repositories

import com.interio.springbootdemo.models.Reservation
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.Date

@Repository
interface ReservationRepository : CrudRepository<Reservation, Int> {
    fun findReservationByReservationDate(date: Date): Iterable<Reservation>
}