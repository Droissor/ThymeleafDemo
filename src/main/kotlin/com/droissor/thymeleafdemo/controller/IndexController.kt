package com.droissor.thymeleafdemo.controller

import com.droissor.thymeleafdemo.services.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController(val productService : ProductService) {

    @RequestMapping("/")
    fun getIndex(model: Model): String {

        model.addAttribute("products", productService.listProducts())

        return "index"
    }

}