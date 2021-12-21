package com.ifpe.PP2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpe.PP2.dados.ClienteDAO;
import com.ifpe.PP2.models.Cliente;

@Service
public class ClienteServices {
	
	@Autowired
	private ClienteDAO clienteDAO;

	public <S extends Cliente> S salvar(S entity) {
		return clienteDAO.save(entity);
	}

	public List<Cliente> encontrarTudo() {
		return clienteDAO.findAll();
	}

	public Optional<Cliente> encontrarPorId(Integer id) {
		return clienteDAO.findById(id);
	}

	public boolean existsById(Integer id) {
		return clienteDAO.existsById(id);
	}

	public void teletarPorId(Integer id) {
		clienteDAO.deleteById(id);
	}

	public void deletar(Cliente entity) {
		clienteDAO.delete(entity);
	}
	
	
	

}
