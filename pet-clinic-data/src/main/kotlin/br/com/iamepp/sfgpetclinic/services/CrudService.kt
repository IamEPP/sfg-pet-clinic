package br.com.iamepp.sfgpetclinic.services

interface CrudService<E, ID> {

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
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    fun findById(id: ID): E?

    /**
     * Saves a given entity. Use the returned instance for further operations
     * as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity must not be {@literal null}.
     * @return the saved entity will never be {@literal null}.
     * @throws IllegalArgumentException if {@code entity} is {@literal null}.
     */
    fun save(entity: E): E

    /**
     * Delete an given entity.
     *
     * @param entity must not be {@literal null}.
     * @throws IllegalArgumentException if {@code entity} is {@literal null}.
     */
    fun delete(entity: E)

    /**
     * Delete an entity by its id.
     *
     * @param id must not be {@literal null}.
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    fun deleteById(id: ID)
}