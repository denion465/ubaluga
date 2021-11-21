package com.ubaluga.backend.service;

import com.ubaluga.backend.model.Imovel;
import com.ubaluga.backend.repository.ImovelRespository;

import org.springframework.stereotype.Service;

@Service
public class ImovelService {

  private final ImovelRespository imovelRespository;

  public ImovelService(ImovelRespository imovelRespository) {
    this.imovelRespository = imovelRespository;
  }

  public Imovel salvar(Imovel imovel) {

    return imovelRespository.save(imovel);
  }
}
