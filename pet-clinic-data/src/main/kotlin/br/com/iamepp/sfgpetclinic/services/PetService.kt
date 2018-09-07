package br.com.iamepp.sfgpetclinic.services

import br.com.iamepp.sfgpetclinic.model.Pet

interface PetService {
    fun findById(id: Long): Pet
    fun save(pet: Pet): Pet
    fun findAll(): Set<Pet>
}