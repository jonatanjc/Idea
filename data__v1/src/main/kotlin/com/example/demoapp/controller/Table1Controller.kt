package com.example.demoapp.controller

import com.example.demoapp.model.Table1
import com.example.demoapp.service.Table1Service
import jakarta.persistence.Table
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/table1")
class Table1Controller {
    @Autowired
    lateinit var table1Service: Table1Service

    @GetMapping
    fun list ():List<Table1>{
        return table1Service.list()
    }
}
//@RestController
//fun save (@RequestBody table1:Table1):ResponseEntity<Table1>{
//    return ResponseEntity(table1Service.save(table1), HttpStatus.OK)
//}
//@PutMapping
//fun update (@RequestBody table1:Table1):ResponseEntity<Table1>{
//    return ResponseEntity(Table1Service.update(table1), HttpStatus.OK)
//}
//@PatchMapping
//fun updateName (@RequestBody table1:Table1):ResponseEntity<Table1>{
//    return ResponseEntity(table1Service.updateTotal(table1), HttpStatus.OK)
//}
//@GetMapping("/{id}")
//fun listById (@PathVariable("id") id: Long): ResponseEntity<*>{
//    return ResponseEntity(table1Service.listById (id), HttpStatus.OK)
//
//}
//@DeleteMapping("/delete/{id}")
//fun delete (@PathVariable("id") id: Long):Boolean?{
//    return Table1Service.delete(id)
//}
