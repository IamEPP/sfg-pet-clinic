package br.com.iamepp.sfgpetclinic.model

import java.time.LocalDate

data class Pet(
        val petType: PetType,
        val owner: Owner,
        val birthDate: LocalDate)

