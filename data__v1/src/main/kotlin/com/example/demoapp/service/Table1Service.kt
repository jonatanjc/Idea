package com.example.demoapp.service

import com.example.demoapp.model.Table1
import com.example.demoapp.repository.Table1Repository
import com.example.demoapp.table1Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class Table1Service {

    @Autowired
    lateinit var table1Repository: Table1Repository

    fun list():List<Table1>{
        return table1Repository.findAll()
    }
}

//fun updateName(table1Service: Table1): Table1{
//    try{
//        val response = table1Repository.findById(table1.id)
//            ?: throw Exception("ID no existe")
//        response.apply {
//            fullname=table1.fullname //un atributo del modelo
//        }
//        return table1Repository.save(response)
//    }
//    catch (ex:Exception){
//        throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
//    }
//}
//fun listById (id:Long?):Table1?{
//    return table1Repository.findById(id)

//fun delete (id: Long?):Boolean?{
//    try{
//        val response = Table1Repository.findById(id)
//            ?: throw Exception("ID no existe")
//        table1Repository.deleteById(id!!)
//        return true
//    }
//    catch (ex:Exception){
//        throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
//    }
//}