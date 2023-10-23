package com.example.demoapp

import com.example.demoapp.repository.Table1Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataV1Application
 @Autowired
 lateinit var table1Repository: Table1Repository
fun main(args: Array<String>) {
	runApplication<DataV1Application>(*args)
}

//fun save(table1:Table1): Table1 {
//	try {
//		return table1Repository.save(table1)
//	} catch (ex: Exception) {
//		throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
//	}
//}
//fun update(table1: Table1): Table1{
//	try {
//		table1Repository.findById(table1.id)
//			?: throw Exception("ID no existe")
//
//		return table1Repository.save(table1)
//	}
//	catch (ex:Exception){
//		throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
//	}
//}