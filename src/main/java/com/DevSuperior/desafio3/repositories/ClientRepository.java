package com.DevSuperior.desafio3.repositories;

import com.DevSuperior.desafio3.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
