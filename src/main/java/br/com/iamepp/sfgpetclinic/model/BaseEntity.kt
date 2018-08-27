package br.com.iamepp.sfgpetclinic.model

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    val isNew: Boolean
        get() = Objects.nonNull(id)
}


@MappedSuperclass
abstract class AuditedEntity : BaseEntity() {
    @Version
    var version: Long = 0

    @CreatedDate
    val createdAt: LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    var lastUpdated: LocalDateTime = LocalDateTime.now()

    @CreatedBy
    var createdBy: String = ""

    @LastModifiedBy
    var updatedBy: String = ""
}