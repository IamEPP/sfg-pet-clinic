package br.com.iamepp.sfgpetclinic.services.inmemory

import org.springframework.stereotype.Component
import java.lang.IllegalArgumentException
import java.util.function.Predicate
import java.util.stream.Collectors


@Component
internal class MapBasedInMemoryGenericRepository<E, K> : InMemoryGenericRepository<E, K> {

    private val objects: MutableMap<K, E> = HashMap()

    override fun findAll() = objects.values.toSet()

    override fun findById(id: K) = objects[id]

    override fun save(id: K, entity: E): E {
        objects[id] = entity
        return entity
    }

    override fun delete(entity: E) {
        objects.entries.removeIf { k -> k.value == entity }
    }

    override fun deleteById(id: K) {
        objects.remove(id)
    }

    final override fun findAllByPredicate(predicate: Predicate<E>):
            Set<E> {

        return this.objects.values
                .parallelStream()
                .filter(predicate)
                .collect(Collectors.toSet())
    }
}