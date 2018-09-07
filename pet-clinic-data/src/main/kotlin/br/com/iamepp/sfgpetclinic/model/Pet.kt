package br.com.iamepp.sfgpetclinic.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "pets")
data class Pet(
        @ManyToOne
        @JoinColumn(name = "type_id")
        val petType: PetType,
        @ManyToOne
        @JoinColumn(name = "owner_id")
        val owner: Owner,
        val birthDate: LocalDate) : BaseEntity()

