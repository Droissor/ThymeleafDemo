package com.droissor.thymeleafdemo.dto

import javax.validation.constraints.NotEmpty

data class LoginRequest(

    @field:NotEmpty
    val username: String? = null,

    @field:NotEmpty
    val password: String? = null
)