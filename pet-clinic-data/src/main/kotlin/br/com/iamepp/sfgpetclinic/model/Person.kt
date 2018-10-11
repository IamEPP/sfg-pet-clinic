package br.com.iamepp.sfgpetclinic.model

import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class Person(id: Long? = null) : BaseEntity(id) {
    @Column(name = "first_name")
    var firstName: String = ""
    @Column(name = "last_name")
    var lastName: String = ""


    constructor(firstName: String, lastName: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
    }

    constructor(id: Long?, firstName: String, lastName: String) : this(id) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName')"
    }
}
