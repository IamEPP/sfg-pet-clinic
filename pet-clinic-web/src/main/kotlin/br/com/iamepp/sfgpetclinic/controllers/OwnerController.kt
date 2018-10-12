package br.com.iamepp.sfgpetclinic.controllers

import br.com.iamepp.sfgpetclinic.services.OwnerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/owners")
@Controller
class OwnerController(val ownerService: OwnerService) {

    @RequestMapping("", "/index", "/index.html")
    fun listAll(model: Model): String {
        model.addAttribute("owners", ownerService.findAll())
        return "owners/index"
    }
}