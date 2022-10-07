package com.droissor.thymeleafdemo.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class CheckoutRequest(

    @field:NotEmpty
    @field:Size(min = 2, max = 50)
    val name: String? = null,

    @field:NotEmpty
    @field:Size(min = 2, max = 50)
    val address: String? = null,

    @field:NotEmpty
    @field:Size(min = 2, max = 50)
    val city: String? = null,

    @field:NotEmpty
    @field:Size(min = 2, max = 2)
    val state: String? = null,

    @field:NotEmpty
    @field:Size(min = 5, max = 50)
    val zipCode: String? = null
)