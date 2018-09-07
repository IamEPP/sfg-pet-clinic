package br.com.iamepp.sfgpetclinic.services

import br.com.iamepp.sfgpetclinic.model.Owner

interface OwnerService {
    fun findByLastName(lastName: String): Owner
    fun findById(id: Long): Owner
    fun save(owner: Owner): Owner
    fun findAll(): Set<Owner>
}