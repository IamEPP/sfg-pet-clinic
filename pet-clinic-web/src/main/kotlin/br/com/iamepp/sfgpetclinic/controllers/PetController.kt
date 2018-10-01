package br.com.iamepp.sfgpetclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/pets")
@Controller
class PetController {

    @RequestMapping("", "/index", "/index.html")
    fun listAll(): String = "pets/index"
}