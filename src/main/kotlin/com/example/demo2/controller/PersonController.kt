package com.example.demo2.controller


import com.example.demo2.model.Person
import com.example.demo2.services.PersonServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController {

    @Autowired
    private lateinit var  service:PersonServices
    @RequestMapping(value = ["/{id}"], method =[RequestMethod.GET],
    produces = [MediaType.APPLICATION_JSON_VALUE])
    fun exmple(@PathVariable(value = "id") id:Long) : Person{
        return service.findById(id)
    }
}