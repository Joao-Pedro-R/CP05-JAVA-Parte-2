package com.fiap.brinquedos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LPController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
