package com.droissor.thymeleafdemo.services

import com.droissor.thymeleafdemo.domain.Author
import com.droissor.thymeleafdemo.domain.Product
import com.droissor.thymeleafdemo.domain.ProductCategory
import java.math.BigDecimal
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl : ProductService{

    private val productMap: MutableMap<Int, Product> = mutableMapOf()

    init {
        loadProducts()
    }

    override fun getProduct(id: Int): Product {
        return productMap[id] ?: throw NoSuchElementException()
    }

    override fun listProducts(): List<Product> {
        return productMap.values.toList()
    }

    private fun loadProducts() {
        val john = Author(
            id = 1,
            firstName = "John",
            lastName = "Thompson",
            image = "instructor_jt.jpg"
        )

        val springIntroCat = ProductCategory(
            id = 1,
            category = "Spring Introduction"
        )

        val springCoreCat = ProductCategory(
            id = 2,
            category = "Spring Core"
        )

        val springBootCat = ProductCategory(
            id = 3,
            category = "Spring Boot"
        )

        val thymeleafCat = ProductCategory(
            id = 4,
            category = "Thymeleaf"
        )


        val productMap = mutableMapOf<Int, Product>()
        val springIntro = Product(
            id = 1,
            courseName = "Introduction to Spring",
            courseSubtitle = "Start Learning Spring!",
            author = john,
            courseDescription = COURSE_DESCRIPTION,
            price = BigDecimal("0"),
            imageUrl = "SpringIntroThumb.png",
            productCategories = listOf(springIntroCat, springBootCat)
        )
        productMap[1] = springIntro

        val springCoreUltimate = Product(
            id = 2,
            courseName = "Spring Core Ultimate",
            courseSubtitle = "Ultimate Bundle of Spring Core!",
            author = john,
            courseDescription =  COURSE_DESCRIPTION,
            price = BigDecimal("199"),
            imageUrl = "SpringCoreUltimateThumb.png",
            productCategories = listOf(springCoreCat, springBootCat)
        )
        productMap[2] = springCoreUltimate

        val thymeleaf = Product(
            id = 3,
            courseName = "Thymeleaf",
            courseSubtitle = "Thymeleaf and Spring!",
            author = john,
            courseDescription =  COURSE_DESCRIPTION,
            price = BigDecimal("199"),
            imageUrl = "ThymeleafThumb.png",
            productCategories = listOf(thymeleafCat)
        )
        productMap[3] = thymeleaf
    }

    companion object {
        const val COURSE_DESCRIPTION = """Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework
                    My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java
                    You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use."""
    }

}