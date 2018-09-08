package br.com.iamepp.sfgpetclinic.services

interface CrudService<Entity, Identifier> {
    fun findAll(): Set<Entity>
    fun findById(id: Identifier): Entity?
    fun save(id: Identifier, entity: Entity): Entity
    fun delete(entity: Entity)
    fun deleteById(id: Identifier)
}