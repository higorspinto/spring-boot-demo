package com.interio.springbootdemo.repositories

import com.interio.springbootdemo.models.Guest
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GuestRepository : CrudRepository<Guest, Int> {
}