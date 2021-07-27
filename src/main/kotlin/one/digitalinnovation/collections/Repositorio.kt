package one.digitalinnovation.collections

import java.rmi.server.ObjID

class Repositorio<T>  {
    private val map = mutableMapOf<String, T>()

    fun remove(id: String) = map.remove(id)

    fun create(id: String, value: T){
        map[id] = value
    }
    fun findById( id: String) = map[id]

    fun findAll() = map.values
 }