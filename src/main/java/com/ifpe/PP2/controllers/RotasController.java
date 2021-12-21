package com.ifpe.PP2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {

	
	//----------------------------------------------------------NavBar------------------------------------------------//
	
	@GetMapping("/")
	public String Inicio() {
		return "index.html";
	}
	
	@GetMapping("/sobre")
	public String Sobre() {
		return "Sobre";
	}

	@GetMapping("/adocao")
	public String Adocao() {
		return "Adocao.html";
	}
	
	@GetMapping("/colabore")
	public String Colabore() {
		return "Colabore";
	}
	
	
	@GetMapping("/login")
	public String Login() {
		return "Login";
	}
	
	
	//---------------------------------------------------------Login ---------------------------------------------------//
	
	
	@GetMapping("/recuperar_senha")
	public String RecuperarSenha() {
		return "RecuperarSenha";
	}
	
	@GetMapping("/cadastro")
	public String Cadastro() {
		return "Cadastro";
		
	}
	
	//------------------------------------Colabore------------------------------------------------------------//
	
	@GetMapping("/perfil")
	public String Perfil() {
		return "Perfil";
	}
	
	
	@GetMapping("/doe_insumos")
	public String DoeInsumos() {
		return "DoeInsumos";
	}
	
	@GetMapping("/doe_dinheiro")
	public String DoeDinheiro() {
		return "DoeDinheiro";
	}

}
