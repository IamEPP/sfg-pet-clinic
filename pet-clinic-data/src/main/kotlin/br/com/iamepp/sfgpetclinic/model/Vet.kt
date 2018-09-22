package br.com.iamepp.sfgpetclinic.model

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "vets")
class Vet(firstName: String, lastName: String) : Person(firstName, lastName) {
    constructor() : this(firstName = "", lastName = "")
}
