package br.com.iamepp.sfgpetclinic.model

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "vets")
class Vet(id: Long?, firstName: String, lastName: String) : Person(id, firstName, lastName) {
    constructor() : this(id = 0L, firstName = "", lastName = "")
    override fun toString(): String {
        return "Vet() ${super.toString()}"
    }
}
