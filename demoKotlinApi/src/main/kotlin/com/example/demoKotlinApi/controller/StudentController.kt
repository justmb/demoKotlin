package com.example.demoKotlinApi.controller

import com.example.demoKotlinApi.model.Student
import com.example.demoKotlinApi.service.StudentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController(val studentService: StudentService) {


    @GetMapping("/getAll")
    fun getAll() : ResponseEntity<List<Student>> {
        return ResponseEntity.ok().body(studentService.getAll())
    }

}