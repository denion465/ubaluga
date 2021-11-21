package com.ubaluga.backend.repository;

import com.ubaluga.backend.model.Imovel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRespository extends JpaRepository<Imovel, Integer> {}
