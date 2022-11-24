package com.exemplo.api.resources;

import com.exemplo.api.models.Pessoas;
import com.exemplo.api.repository.PessoasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PessoasResource {

    @Autowired
    PessoasRepository pessoasRepository;

    @GetMapping("/pessoas")
    public List<Pessoas> listaPessoas() {
        return pessoasRepository.findAll();
    }

    @GetMapping("/pessoas/{id}")
    public Pessoas listaPessoasUnico(@PathVariable(value = "id") long id) {
        return pessoasRepository.findById(id);
    }

    @PostMapping("/pessoas")
    public Pessoas salvaPessoas(@RequestBody Pessoas pessoas) {
        return pessoasRepository.save(pessoas);
    }

    @DeleteMapping("/pessoas")
    public void deletaPessoas(@RequestBody Pessoas pessoas) {
        pessoasRepository.delete(pessoas);
    }

    @PutMapping("/pessoas")
    public Pessoas alteraPessoas(@RequestBody Pessoas pessoas) {
        return pessoasRepository.save(pessoas);
    }


}
