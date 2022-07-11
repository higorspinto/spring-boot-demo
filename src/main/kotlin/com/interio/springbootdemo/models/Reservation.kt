package com.interio.springbootdemo.models

import java.sql.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="RESERVATION")
class Reservation(
    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val reservationId: Int,
    @Column(name="ROOM_ID")
    val roomId: Int,
    @Column(name="GUEST_ID")
    val guestId: Int,
    @Column(name="RES_DATE")
    val reservationDate: Date
) {
}