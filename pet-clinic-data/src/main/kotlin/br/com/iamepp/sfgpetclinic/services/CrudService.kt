package br.com.iamepp.sfgpetclinic.services

interface CrudService<Type, ID> {
    fun findAll(): Set<Type>
    fun findById(id: ID): Type?
    fun save(t: Type): Type
    fun delete(t: Type)
    fun deleteById(i: ID)
}