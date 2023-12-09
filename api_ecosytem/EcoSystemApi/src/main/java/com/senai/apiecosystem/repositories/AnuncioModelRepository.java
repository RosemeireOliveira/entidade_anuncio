package com.senai.apiecosystem.repositories;

import com.senai.apiecosystem.models.AnuncioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnuncioModelRepository extends JpaRepository<AnuncioModel, UUID> {
}