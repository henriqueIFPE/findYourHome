package com.ifpe.PP2.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.PP2.models.Mascote;

public interface MascoteDAO extends JpaRepository<Mascote, Integer>{

}
