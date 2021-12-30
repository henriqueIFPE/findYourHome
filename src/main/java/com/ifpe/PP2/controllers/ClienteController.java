package com.ifpe.PP2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.ifpe.PP2.models.Cliente;
import com.ifpe.PP2.services.ClienteServices;

@Controller
public class ClienteController {

	private ClienteServices clienteServices;
	
	@PostMapping("/cadastrar_cliente")
	public Cliente cadastrarClienteObj(Cliente cliente) {
		return clienteServices.salvar(cliente);
	}
}
