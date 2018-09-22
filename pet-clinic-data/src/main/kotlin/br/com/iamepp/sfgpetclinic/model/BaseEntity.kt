package br.com.iamepp.sfgpetclinic.model

import java.util.*
import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    val isNew: Boolean
        get() = Objects.nonNull(id)

    constructor(id: Long?) : this() {
        this.id = id
    }
}