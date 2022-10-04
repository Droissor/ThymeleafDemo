package com.droissor.thymeleafdemo.controller

import com.droissor.thymeleafdemo.services.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/product")
class ProductController(
    val productService: ProductService
) {

    @GetMapping
    fun getProduct(): String = "redirect:/"

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Int, model: Model): String {

        model.addAttribute("product", productService.getProduct(id));

        return "product";
    }
}