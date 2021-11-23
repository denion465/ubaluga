package com.ubaluga.backend.service;

import com.ubaluga.backend.model.Imovel;
import com.ubaluga.backend.repository.ImovelRespository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImovelService {

  private final ImovelRespository imovelRespository;

  public Imovel salvar(Imovel imovel) {

    return imovelRespository.save(imovel);
  }
}
