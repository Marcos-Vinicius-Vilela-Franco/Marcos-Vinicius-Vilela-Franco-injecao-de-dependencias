package com.example.demo2.services

import com.example.demo2.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger


@Service
class PersonServices {
    private val counter: AtomicLong = AtomicLong()

    private val logger = Logger.getLogger(PersonServices::class.java.name)

    fun findById(id:Long):Person {
        logger.info("Finding one person!")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Leandro"
        person.lastName = "Costa"
        person.address = "Jataí-GO"
        person.gender = "Male"
        return person
    }
}
