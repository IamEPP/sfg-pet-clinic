package br.com.iamepp.sfgpetclinic.services.inmemory

import br.com.iamepp.sfgpetclinic.services.CrudService
import java.util.function.Predicate

interface InMemoryGenericRepository<E, ID> {

    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    fun findAll(): Set<E>

    /**
     * Retrieves an entity by its id.
     *
     * @param id must not be {@literal null}.
     * @return the entity with the given id or null if none found
     */
    fun findById(id: ID): E?

    /**
     * Delete an given entity.
     *
     * @param entity must not be {@literal null}.
     */

    fun delete(entity: E)

    /**
     * Delete an entity by its id.
     *
     * @param id must not be {@literal null}.
     */
    fun deleteById(id: ID)


    /**
     * Retrieves all entities with a given predicate.
     *
     * @param predicate must not be {@literal null}.
     * @return the entities with the given predicate or null if none found
     * @throws IllegalArgumentException if the predicate is null
     */

    fun findAllByPredicate(predicate: Predicate<E>): Set<E>

    /**
     * Saves an entity with a given ID and return the saved instance to be used
     * by it's clients for further operations.
     * @param id must not be {@literal null}
     * @param entity must not be {@literal null}
     */
    fun save(id: ID, entity: E): E
}
