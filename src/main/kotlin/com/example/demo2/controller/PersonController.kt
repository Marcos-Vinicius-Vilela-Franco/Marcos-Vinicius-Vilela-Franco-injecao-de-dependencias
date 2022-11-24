package com.example.demo2.controller

import com.example.demo2.data.vo.v1.PersonVo
import com.example.demo2.services.PersonServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController {

    @Autowired
    private lateinit var  service:PersonServices
    /*
    @GetMapping(value = ["/{id}"],
            produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findId(@PathVariable(value = "id") id:Long) : PersonVo {
        return service.findById(id)
    }
    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAll():List<PersonVo>{
        return  service.findAll()
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@RequestBody PersonVo: PersonVo):PersonVo{
        return  service.create(PersonVo)
    }
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun update(@RequestBody PersonVo: PersonVo):PersonVo{
        return  service.update(PersonVo)
    }

    @DeleteMapping(value = ["/{id}"],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun delete(@PathVariable(value = "id") id:Long):ResponseEntity<*>{
        service.delete(id)
        return ResponseEntity.noContent().build<Any>()
    }*/



}