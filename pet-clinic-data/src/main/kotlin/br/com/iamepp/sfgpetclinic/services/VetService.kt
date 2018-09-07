package br.com.iamepp.sfgpetclinic.services

import br.com.iamepp.sfgpetclinic.model.Vet

interface VetService {
    fun findByLastName(lastName: String): Vet
    fun findById(id: Long): Vet
    fun save(vet: Vet): Vet
    fun findAll(): Set<Vet>
}