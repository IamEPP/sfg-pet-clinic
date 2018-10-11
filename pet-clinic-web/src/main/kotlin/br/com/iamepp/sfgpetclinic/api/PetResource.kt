package br.com.iamepp.sfgpetclinic.api

import org.springframework.context.annotation.Scope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/pet")
@Scope("session")
class PetResource {


}