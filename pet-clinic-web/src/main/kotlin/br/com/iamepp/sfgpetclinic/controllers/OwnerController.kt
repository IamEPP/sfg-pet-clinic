package br.com.iamepp.sfgpetclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/owners")
@Controller
class OwnerController {

    @RequestMapping("", "/index", "/index.html")
    fun listAll(): String = "owners/index"
}