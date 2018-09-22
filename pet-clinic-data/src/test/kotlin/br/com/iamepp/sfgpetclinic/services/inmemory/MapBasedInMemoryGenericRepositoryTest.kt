package br.com.iamepp.sfgpetclinic.services.inmemory

import br.com.iamepp.sfgpetclinic.model.Owner
import org.junit.After
import org.junit.Before
import org.junit.Test
import  org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*

class MapBasedInMemoryGenericRepositoryTest {
    private lateinit var mapBasedInMemoryGenericRepository:
            MapBasedInMemoryGenericRepository<Owner, Long?>
    private val allOwners: MutableMap<String, Owner> = HashMap()

    @Before
    fun setUp() {
        mapBasedInMemoryGenericRepository = MapBasedInMemoryGenericRepository()
        val john = Owner(1L, "John", "Doe")

        val luke = Owner(2L, "Luke", "Kage")

        val bruce = Owner(3L, "Bruce", "Wayne")

        allOwners[john.firstName] = john
        allOwners[luke.firstName] = luke
        allOwners[bruce.firstName] = bruce
    }

    @After
    fun tearDown() {
    }

    @Test
    fun findAll() {


    }

    @Test
    fun givenThatANewOwnerIsSavedMustFindHimByID() {
        val owner = Owner(1L, "John", "Doe")
        mapBasedInMemoryGenericRepository.save(owner.id, owner)
        val found = mapBasedInMemoryGenericRepository.findById(1L)
        val notFound = mapBasedInMemoryGenericRepository.findById(1L)
        assertThat(found, `is`(notNullValue()))
        assertThat(notFound, `is`(nullValue()))
    }

    @Test
    fun save() {
    }

    @Test
    fun delete() {
    }

    @Test
    fun deleteById() {
    }

    @Test
    fun findAllByPredicate() {
    }
}