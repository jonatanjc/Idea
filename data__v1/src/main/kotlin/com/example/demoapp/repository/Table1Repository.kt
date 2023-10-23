package com.example.demoapp.repository

import com.example.demoapp.model.Table1
import org.springframework.data.jpa.repository.JpaRepository

interface Table1Repository : JpaRepository<Table1, Long?>{
    fun findById (id: Long?): Table1Repository?
}
//fun findById(id: Long?):Table1?
//fun findById(id: Long?):table1?