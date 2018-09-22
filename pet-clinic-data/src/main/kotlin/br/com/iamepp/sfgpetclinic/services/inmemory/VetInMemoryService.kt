package br.com.iamepp.sfgpetclinic.services.inmemory

import br.com.iamepp.sfgpetclinic.model.Vet
import br.com.iamepp.sfgpetclinic.services.VetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class VetInMemoryService(
        @Autowired
        @Qualifier("inMemoryVetRepository")
        private val genericRepository: InMemoryGenericRepository<Vet, Long>,
        private val inMemoryIDManager: InMemoryIDManager<Long>
) : VetService, InMemoryGenericRepository<Vet, Long> by genericRepository {
    override fun save(entity: Vet): Vet {
        if (entity.isNew) entity.id = inMemoryIDManager.getNextKey()
        return genericRepository.save(entity.id!!, entity)
    }
}