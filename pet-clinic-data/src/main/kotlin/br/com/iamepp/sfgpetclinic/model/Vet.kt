package br.com.iamepp.sfgpetclinic.model

import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "vets")
class Vet : Person()
