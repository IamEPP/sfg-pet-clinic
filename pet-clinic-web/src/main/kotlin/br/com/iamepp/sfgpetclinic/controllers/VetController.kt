package br.com.iamepp.sfgpetclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/vets")
@Controller
class VetController {

    @RequestMapping("", "/index", "/index.html")
    fun listAll(): String = "vets/index"
}