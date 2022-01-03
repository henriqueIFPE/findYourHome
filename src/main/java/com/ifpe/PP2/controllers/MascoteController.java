package com.ifpe.PP2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ifpe.PP2.models.Mascote;
import com.ifpe.PP2.services.MascoteServices;

@Controller
public class MascoteController {

	@Autowired
	private MascoteServices mascoteService;
	
	
	@GetMapping("/user/lista_adocao")
	public String listaMascotes( ModelMap model){
		model.addAttribute("mascote", this.mascoteService.encontrarTudo());
		return "Adocao";
	}
	
	@PostMapping("/user/salvar_mascote")
	public String salvarMascote(Mascote mascote) {
		
		 this.salvarMascote(mascote);
		 return "redirect:/user/lista_adocao";
	}
}
