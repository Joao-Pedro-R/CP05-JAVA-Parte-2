package com.fiap.brinquedos.controller;

import com.fiap.brinquedos.model.Brinquedo;
import com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private final BrinquedoRepository repository;

    public BrinquedoController(BrinquedoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "brinquedos";
    }

    @PostMapping
    public String salvar(@ModelAttribute Brinquedo brinquedo) {
        repository.save(brinquedo);
        return "redirect:/brinquedos";
    }

    @GetMapping("/delete/{id}")
    public String deletar(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/brinquedos";
    }
}
