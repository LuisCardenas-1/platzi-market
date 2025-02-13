package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping ("/Hola")
    public String saludar (){
        return "Tu vida es tu vida conócela mientras la tengas tú eres maravilloso los dioses esperan para deleitarse en tí.";
    }
}
