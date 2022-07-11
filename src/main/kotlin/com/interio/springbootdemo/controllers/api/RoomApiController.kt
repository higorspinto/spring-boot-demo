package com.interio.springbootdemo.controllers.api

import com.interio.springbootdemo.models.Room
import com.interio.springbootdemo.repositories.RoomRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/rooms")
class RoomApiController(
    @Autowired
    private val roomRepository: RoomRepository
) {
    @GetMapping
    fun getRooms(): Iterable<Room> {
        return roomRepository.findAll()
    }
}