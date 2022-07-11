package com.interio.springbootdemo.utils

import org.springframework.stereotype.Service
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date

@Service
class DateUtils {
    val DATE_FORMAT: DateFormat = SimpleDateFormat("yyyy-MM-dd")

    fun createDateFromString(dateString: String?): Date {
        return if(dateString != null){
            try {
                DATE_FORMAT.parse(dateString)
            } catch (exception: ParseException) {
                Date()
            }
        } else {
            Date()
        }
    }
}