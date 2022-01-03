package com.ifpe.PP2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/admin/perfil")
	public String adminHome() {
		return "admin/admPerfil";
	}
	
	@GetMapping("/admin/doacao")
	public String adminDoacao() {
		return "admin/AdmAdocao";
	}
	
	@GetMapping("/admin/adocao")
	public String adminAdocao() {
		return "admin/AdmAdocao";
	}
	
	@GetMapping("/admin/users")
	public String adminManutencaoUsuario() {
		return "admin/AdmManutencaoUsuario.html";
	}
	
}
