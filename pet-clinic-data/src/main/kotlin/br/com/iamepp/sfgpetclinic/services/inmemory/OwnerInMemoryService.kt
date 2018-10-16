package br.com.iamepp.sfgpetclinic.services.inmemory

import br.com.iamepp.sfgpetclinic.model.Owner
import br.com.iamepp.sfgpetclinic.services.OwnerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import java.util.function.Predicate
import java.util.stream.Collectors

@Service
class OwnerInMemoryService(
        @Autowired
        @Qualifier("inMemoryOwnerRepository")
        private val genericRepository: InMemoryGenericRepository<Owner, Long>,
        private val inMemoryIDManager: InMemoryIDManager<Long>
) : OwnerService, InMemoryGenericRepository<Owner, Long> by genericRepository {

    override fun save(entity: Owner): Owner {
        if (entity.isNew)
            entity.id = inMemoryIDManager.getNextKey()
        return genericRepository.save(entity.id!!, entity)
    }

    override fun findByLastName(lastName: String): Set<Owner> =
            genericRepository
                    .findAllByPredicate(Predicate { o -> o.lastName == lastName })
                    .stream()
                    .collect(Collectors.toSet())
}