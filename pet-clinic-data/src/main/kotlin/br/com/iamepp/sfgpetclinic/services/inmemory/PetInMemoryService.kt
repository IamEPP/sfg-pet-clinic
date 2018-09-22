package br.com.iamepp.sfgpetclinic.services.inmemory

import br.com.iamepp.sfgpetclinic.model.Pet
import br.com.iamepp.sfgpetclinic.services.PetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class PetInMemoryService(
        @Autowired
        @Qualifier("inMemoryPetRepository")
        private val inMemoryGenericRepository: InMemoryGenericRepository<Pet, Long>,
        private val inMemoryIDManager: InMemoryIDManager<Long>) :
        PetService, InMemoryGenericRepository<Pet, Long> by inMemoryGenericRepository {

    override fun save(entity: Pet): Pet {
        if (entity.isNew) entity.id = inMemoryIDManager.getNextKey()
        return inMemoryGenericRepository.save(entity.id!!, entity)
    }
}