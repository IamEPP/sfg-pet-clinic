package br.com.iamepp.sfgpetclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {
    @RequestMapping("", "/", "index", "index.html")
    fun index() = "index"

}