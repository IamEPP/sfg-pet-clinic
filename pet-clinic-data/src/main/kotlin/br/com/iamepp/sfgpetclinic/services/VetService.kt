package br.com.iamepp.sfgpetclinic.services

import br.com.iamepp.sfgpetclinic.model.Vet

interface VetService : CrudService<Vet, Long> {
    fun findByLastName(lastName: String): Vet
}