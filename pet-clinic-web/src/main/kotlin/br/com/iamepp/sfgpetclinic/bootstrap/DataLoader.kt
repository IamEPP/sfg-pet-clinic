package br.com.iamepp.sfgpetclinic.bootstrap

import br.com.iamepp.sfgpetclinic.model.Owner
import br.com.iamepp.sfgpetclinic.model.Vet
import br.com.iamepp.sfgpetclinic.services.OwnerService
import br.com.iamepp.sfgpetclinic.services.VetService
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.util.*

@Component
class DataLoader(
        @Autowired private val ownerService: OwnerService,
        @Autowired private val vetService: VetService) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val faker = Faker(Locale.US)

        val owner1 = Owner(id = 1L, firstName = faker.firstName(), lastName = faker.lastName())
        ownerService.save(owner1)

        val owner2 = Owner(id = 2L, firstName = faker.firstName(), lastName = faker.lastName())
        ownerService.save(owner2)

        val owner3 = Owner(id = 3L, firstName = faker.firstName(), lastName = faker.lastName())
        ownerService.save(owner3)

        val owner4 = Owner(id = 4L, firstName = faker.firstName(), lastName = faker.lastName())
        ownerService.save(owner4)

        val vet1 = Vet(id = 1L, firstName = faker.firstName(), lastName = faker.lastName())
        vetService.save(vet1)

        val vet2 = Vet(id = 2L, firstName = faker.firstName(), lastName = faker.lastName())
        vetService.save(vet2)

        val vet3 = Vet(id = 3L, firstName = faker.firstName(), lastName = faker.lastName())
        vetService.save(vet3)

        val vet4 = Vet(id = 4L, firstName = faker.firstName(), lastName = faker.lastName())
        vetService.save(vet4)

    }
}