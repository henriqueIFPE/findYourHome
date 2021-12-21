package com.ifpe.PP2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpe.PP2.dados.MascoteDAO;
import com.ifpe.PP2.models.Mascote;

@Service
public class MascoteServices {
	
	@Autowired
	private MascoteDAO mascoteDAO;

	public <S extends Mascote> S salve(S entity) {
		return mascoteDAO.save(entity);
	}

	public List<Mascote> encontrarTudo() {
		return mascoteDAO.findAll();
	}

	public Optional<Mascote> encontrarPorId(Integer id) {
		return mascoteDAO.findById(id);
	}

	public boolean existsById(Integer id) {
		return mascoteDAO.existsById(id);
	}

	public long count() {
		return mascoteDAO.count();
	}

	public void deletarPorId(Integer id) {
		mascoteDAO.deleteById(id);
	}

	public void deletar(Mascote entity) {
		mascoteDAO.delete(entity);
	}
	
	

}
