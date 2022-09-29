package com.droissor.thymeleafdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ProductController {

    @RequestMapping("/product")
    fun getProduct(): String = "product";

}