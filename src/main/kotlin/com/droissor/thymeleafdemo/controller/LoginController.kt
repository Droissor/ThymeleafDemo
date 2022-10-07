package com.droissor.thymeleafdemo.controller

import com.droissor.thymeleafdemo.dto.LoginRequest
import javax.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class LoginController {

    @GetMapping("/login")
    fun loginForm(model: Model): String {
        model.addAttribute("loginRequest", LoginRequest())
        return "loginform"
    }

    @PostMapping(value = ["/login"])
    fun login(loginCommand: @Valid LoginRequest, bindingResult: BindingResult): String =
        if (bindingResult.hasErrors()) "loginform" else "redirect:/"
}