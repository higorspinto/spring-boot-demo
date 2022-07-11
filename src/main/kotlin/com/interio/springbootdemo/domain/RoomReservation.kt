package com.interio.springbootdemo.domain

import java.util.Date

class RoomReservation(
    val roomId: Int,
    val guestId: Int?,
    val roomName: String,
    val roomNumber: String,
    val firstName: String?,
    val lastName: String?,
    val date: Date
) {
}