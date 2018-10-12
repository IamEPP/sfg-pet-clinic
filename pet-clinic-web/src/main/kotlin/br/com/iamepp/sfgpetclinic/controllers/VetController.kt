package br.com.iamepp.sfgpetclinic.controllers

import br.com.iamepp.sfgpetclinic.services.VetService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/vets")
@Controller
class VetController(val vetService: VetService) {

    @RequestMapping("", "/index", "/index.html")
    fun listAll(model: Model): String {
        model.addAttribute("vets", vetService.findAll())
        return "vets/index"
    }
}