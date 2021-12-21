package com.ifpe.PP2.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpe.PP2.dados.PatrocinadorDAO;
import com.ifpe.PP2.models.Patrocinador;

@Service
public class PatrocinadorServices {

	@Autowired
	private PatrocinadorDAO patrocinadorDAO;

	public <S extends Patrocinador> S salve(S entity) {
		return patrocinadorDAO.save(entity);
	}

	public Optional<Patrocinador> encontrarPorId(Integer id) {
		return patrocinadorDAO.findById(id);
	}

	public long count() {
		return patrocinadorDAO.count();
	}

	public void deletarPorId(Integer id) {
		patrocinadorDAO.deleteById(id);
	}

	public void deletar(Patrocinador entity) {
		patrocinadorDAO.delete(entity);
	}

	public void deleteAll() {
		patrocinadorDAO.deleteAll();
	}
	
	
	

	
	

}
