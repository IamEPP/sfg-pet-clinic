package br.com.iamepp.sfgpetclinic.services.map

import br.com.iamepp.sfgpetclinic.services.CrudService

abstract class AbstractMapService<Entity, Identifier> : CrudService<Entity, Identifier> {

    protected val map: MutableMap<Identifier, Entity> = HashMap()

    override fun findAll() = map.values.toSet()


    override fun findById(id: Identifier) = map[id]

    override fun save(id: Identifier, entity: Entity): Entity {
        map[id] = entity
        return entity
    }

    override fun delete(entity: Entity) {
        map.entries.removeIf { k -> k.value!! == entity }
    }

    override fun deleteById(id: Identifier) {
        map.remove(id)
    }
}