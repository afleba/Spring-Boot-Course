package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	

}
