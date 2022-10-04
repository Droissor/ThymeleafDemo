package com.droissor.thymeleafdemo.services

import com.droissor.thymeleafdemo.domain.Product

interface ProductService {

    fun getProduct(id: Int): Product

    fun listProducts(): List<Product>
}