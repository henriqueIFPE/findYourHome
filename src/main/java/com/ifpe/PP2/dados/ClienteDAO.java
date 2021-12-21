package com.ifpe.PP2.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.PP2.models.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer>{

}
