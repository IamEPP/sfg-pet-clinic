package br.com.iamepp.sfgpetclinic.services

import br.com.iamepp.sfgpetclinic.model.Owner

interface OwnerService : CrudService<Owner, Long> {
    fun findByLastName(lastName: String): Owner?
}