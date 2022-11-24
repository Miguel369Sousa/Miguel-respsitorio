package provaprog.miguelsousa.apt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import provaprog.miguelsousa.model.Usuario;
import provaprog.miguelsousa.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record ->ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "api/usuario/salvar")
    public Usuario salvar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }
}
