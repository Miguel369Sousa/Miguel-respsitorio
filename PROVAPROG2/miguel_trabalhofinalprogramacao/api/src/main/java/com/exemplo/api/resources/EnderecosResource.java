package com.exemplo.api.resources;

import com.exemplo.api.models.Endereco;
import com.exemplo.api.repository.EnderecosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class EnderecosResource {

    @Autowired
    EnderecosRepository enderecosRepository;

    @GetMapping("/enderecos")
    public List<Endereco> listaEnderecos() {
        return enderecosRepository.findAll();
    }

    @GetMapping("/enderecos/{id}")
    public Endereco listaEnderecosUnico(@PathVariable(value = "id") long id) {
        return enderecosRepository.findById(id);
    }

    @PostMapping("/enderecos")
    public Endereco salvaEnderecos(@RequestBody Endereco endereco) {
        return enderecosRepository.save(endereco);
    }

    @DeleteMapping("/enderecos")
    public void deletaEnderecos(@RequestBody Endereco endereco) {
        enderecosRepository.delete(endereco);
    }

    @PutMapping("/enderecos")
    public Endereco alteraEnderecos(@RequestBody Endereco endereco) {
        return enderecosRepository.save(endereco);
    }


}
