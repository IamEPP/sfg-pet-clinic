package br.com.iamepp.sfgpetclinic.services.inmemory

import br.com.iamepp.sfgpetclinic.model.Owner
import br.com.iamepp.sfgpetclinic.model.Pet
import br.com.iamepp.sfgpetclinic.model.Vet
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InMemoryDatasourceHelperProducer {
    @Bean
    @Qualifier("inMemoryOwnerRepository")
    fun ownerInMemoryDataSource(): InMemoryGenericRepository<Owner, Long> {
        return MapBasedInMemoryGenericRepository()
    }

    @Bean
    @Qualifier("inMemoryPetRepository")
    fun petInMemoryDataSource(): InMemoryGenericRepository<Pet, Long> {
        return MapBasedInMemoryGenericRepository()
    }

    @Bean
    @Qualifier("inMemoryVetRepository")
    fun vetInMemoryDataSource(): InMemoryGenericRepository<Vet, Long> {

        return MapBasedInMemoryGenericRepository()
    }
}
