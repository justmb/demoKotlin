package com.example.demoKotlinApi.model

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Getter
@Setter
class Student (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Id : Long,
    val name: String,
    val age: Int
    )