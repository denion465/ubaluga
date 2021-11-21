package com.ubaluga.backend.controller;

import java.util.List;
import java.util.Optional;

import com.ubaluga.backend.model.Imovel;
import com.ubaluga.backend.repository.ImovelRespository;
import com.ubaluga.backend.service.ImovelService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

  private final ImovelRespository imovelRespository;

  private final ImovelService imovelService;

  public ImovelController(ImovelRespository imovelRespository, ImovelService imovelService) {
    this.imovelRespository = imovelRespository;
    this.imovelService = imovelService;
  }

  @GetMapping
  public List<Imovel> listar() {
    return imovelRespository.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Imovel> buscar(@PathVariable Integer id) {
    Optional<Imovel> imovel = imovelRespository.findById(id);

    if (imovel.isPresent()) {
      return ResponseEntity.ok(imovel.get());
    }
    return ResponseEntity.notFound().build();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Imovel adicionar(@RequestBody Imovel imovel) {
    return imovelService.salvar(imovel);
  }
}
