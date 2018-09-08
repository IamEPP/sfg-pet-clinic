package br.com.iamepp.sfgpetclinic.services.map

import br.com.iamepp.sfgpetclinic.model.Owner
import br.com.iamepp.sfgpetclinic.services.OwnerService

class OwnerMapService : AbstractMapService<Owner, Long>(), OwnerService {
    override fun findByLastName(lastName: String): Owner? = super.map.entries
            .stream()
            .filter { k -> k.value.lastName == lastName }
            .map { k -> k.value }
            .findFirst()
            .orElse(null)

}