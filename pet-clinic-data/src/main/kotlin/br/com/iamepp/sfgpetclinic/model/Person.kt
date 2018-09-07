package br.com.iamepp.sfgpetclinic.model

import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class Person : BaseEntity() {
    @Column(name = "first_name")
    var firstName: String = ""
    @Column(name = "last_name")
    var lastName: String = ""
}
