package br.com.iamepp.sfgpetclinic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing


@SpringBootApplication
@EnableJpaAuditing
class SfgPetClinicApplication

fun main(args: Array<String>) {
    runApplication<SfgPetClinicApplication>(*args)
    
}
