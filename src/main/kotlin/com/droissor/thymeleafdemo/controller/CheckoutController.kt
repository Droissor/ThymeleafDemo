package com.droissor.thymeleafdemo.controller

import com.droissor.thymeleafdemo.dto.CheckoutRequest
import javax.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class CheckoutController {

    @GetMapping("/checkout")
    fun checkoutForm(model: Model): String {
        model.addAttribute("checkoutRequest", CheckoutRequest())
        return "checkoutform"
    }

    @PostMapping(value = ["/checkout"])
    fun checkout(@Valid checkoutCommand: CheckoutRequest, bindingResult: BindingResult): String =
        if (bindingResult.hasErrors()) "checkoutform" else "checkoutcomplete"

}