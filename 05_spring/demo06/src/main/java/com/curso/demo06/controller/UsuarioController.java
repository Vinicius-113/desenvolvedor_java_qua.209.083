package com.curso.demo06.controller;

import com.curso.demo06.model.Usuario;
import com.curso.demo06.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("usuarios", repository.findAll());
        return "home";
    }

    @GetMapping("/cadastro")
    public String cadastroPage() {
        return "cadastro";
    }

    @PostMapping("/salvarUsuario")
    public String salvarUsuario(Usuario usuario) {

        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        repository.save(usuario);

        return "redirect:/login";
    }
}
