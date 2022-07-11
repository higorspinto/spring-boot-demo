package com.interio.springbootdemo.repositories

import com.interio.springbootdemo.models.Room
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RoomRepository : CrudRepository<Room, Int> {
}