package com.example.demoKotlinApi.service

import com.example.demoKotlinApi.model.Student

interface StudentService {
    fun getAll() : List<Student>
}