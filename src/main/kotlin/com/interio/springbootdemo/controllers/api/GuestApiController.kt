package com.interio.springbootdemo.controllers.api

import com.interio.springbootdemo.models.Guest
import com.interio.springbootdemo.repositories.GuestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/guests")
class GuestApiController(
    @Autowired
    private val guestRepository: GuestRepository
) {
    @GetMapping
    fun getGuests(): Iterable<Guest> {
        return guestRepository.findAll()
    }
}