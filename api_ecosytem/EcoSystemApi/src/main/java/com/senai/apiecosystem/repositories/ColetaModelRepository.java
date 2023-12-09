package com.senai.apiecosystem.repositories;

import com.senai.apiecosystem.models.ColetaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ColetaModelRepository extends JpaRepository<ColetaModel, UUID> {
}