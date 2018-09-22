package br.com.iamepp.sfgpetclinic.services.inmemory

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InMemoryIDManagerProducer {
    @Bean
    fun createOwnerInMemoryDataSource(): InMemoryIDManager<Long> {
        return LongInMemoryIDManager
    }
}
