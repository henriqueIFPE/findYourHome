package com.ifpe.PP2.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.PP2.models.Patrocinador;

public interface PatrocinadorDAO extends JpaRepository<Patrocinador, Integer> {

}
