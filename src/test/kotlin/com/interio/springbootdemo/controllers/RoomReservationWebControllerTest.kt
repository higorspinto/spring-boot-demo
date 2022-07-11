package com.interio.springbootdemo.controllers

import com.interio.springbootdemo.domain.RoomReservation
import com.interio.springbootdemo.services.ReservationService
import com.interio.springbootdemo.utils.DateUtils
import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class RoomReservationWebControllerTest(
) {
    @MockBean
    lateinit var reservationService : ReservationService

    @Autowired
    lateinit var mockMVC : MockMvc

    @Autowired
    lateinit var dateUtils: DateUtils

    val mockDate = "2020-01-01"

    private fun mockRoomReservations() : List<RoomReservation> {
        return listOf(
            RoomReservation(
                roomId = 1,
                guestId = 100,
                roomName = "roomName",
                roomNumber = "roomNumber",
                firstName = "firstName",
                lastName = "lastName",
                date = dateUtils.createDateFromString(mockDate)
            )
        )
    }

    @Test
    fun `test getReservations`() {
        whenever(reservationService.getRoomReservationsForDate(any()))
            .thenReturn(mockRoomReservations())

        mockMVC.get("/room_reservations?date=$mockDate").andExpect {
            status { isOk() }
            content { containsString("lastName, firstName") }
        }
    }
}