package br.com.iamepp.sfgpetclinic.model

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "pet_types")
data class PetType(val name: String) : BaseEntity()