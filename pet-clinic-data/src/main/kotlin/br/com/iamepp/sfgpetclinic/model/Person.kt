package br.com.iamepp.sfgpetclinic.model

import org.hibernate.validator.constraints.NotBlank
import org.jetbrains.annotations.NotNull
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class Person(id: Long? = null,
                      @NotBlank
                      @Column(name = "first_name") var firstName: String = "",
                      @NotBlank
                      @Column(name = "last_name") var lastName: String = "") : BaseEntity(id) {


    constructor(firstName: String, lastName: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
    }


    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }


}
