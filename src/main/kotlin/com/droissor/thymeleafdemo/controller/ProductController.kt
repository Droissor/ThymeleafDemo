package com.droissor.thymeleafdemo.controller

import com.droissor.thymeleafdemo.domain.Product
import com.droissor.thymeleafdemo.services.ProductService
import javax.websocket.server.PathParam
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/product")
class ProductController(
    val productService: ProductService
) {

    @GetMapping
    fun getProduct(): List<Product> = productService.listProducts();

    @GetMapping("/{id}")
    fun getProductById(@PathParam(value = "id") id: Int): Product = productService.getProduct(id);
}