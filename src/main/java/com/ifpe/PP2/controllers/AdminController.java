package com.ifpe.PP2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/admin/perfil")
	public String adminHome() {
		return "admin/admPerfil";
	}
	
}
