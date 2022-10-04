package com.droissor.thymeleafdemo.domain

import java.math.BigDecimal

class Product(
    val id: Int,
    val courseName: String,
    val courseSubtitle: String,
    val courseDescription: String,
    val author: Author,
    val price: BigDecimal,
    val productCategories: List<ProductCategory> = listOf(),
    val imageUrl: String,
)