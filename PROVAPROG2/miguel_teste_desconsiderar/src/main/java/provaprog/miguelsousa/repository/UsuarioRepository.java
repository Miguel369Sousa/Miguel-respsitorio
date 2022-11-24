package provaprog.miguelsousa.repository;

import org.springframework.data.repository.CrudRepository;
import provaprog.miguelsousa.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
