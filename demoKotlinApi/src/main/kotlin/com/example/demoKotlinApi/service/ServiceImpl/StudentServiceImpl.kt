package com.example.demoKotlinApi.service.ServiceImpl

import com.example.demoKotlinApi.model.Student
import com.example.demoKotlinApi.repository.StudentRepository
import com.example.demoKotlinApi.service.StudentService
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(val studentRepository: StudentRepository) : StudentService {

    override fun getAll(): List<Student> {
        return studentRepository.findAll()
    }

}