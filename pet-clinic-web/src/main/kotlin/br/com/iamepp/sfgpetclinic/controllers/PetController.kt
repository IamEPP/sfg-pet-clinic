package br.com.iamepp.sfgpetclinic.controllers

import br.com.iamepp.sfgpetclinic.services.PetService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/pets")
@Controller
class PetController(val petService: PetService) {
    @RequestMapping("", "/index", "/index.html")
    fun listAll(model: Model): String {
        model.addAttribute("pets", petService.findAll())
        return "pets/index"
    }
}