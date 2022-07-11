package com.interio.springbootdemo.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="GUEST")
class Guest(
    @Id
    @Column(name="GUEST_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val guestId: Int,
    @Column(name="FIRST_NAME")
    val firstName: String,
    @Column(name="LAST_NAME")
    val lastName: String,
    @Column(name="EMAIL_ADDRESS")
    val email: String,
    @Column(name="ADDRESS")
    val address: String,
    @Column(name="COUNTRY")
    val country: String,
    @Column(name="STATE")
    val state: String,
    @Column(name="PHONE_NUMBER")
    val phoneNumber: String
) {
}