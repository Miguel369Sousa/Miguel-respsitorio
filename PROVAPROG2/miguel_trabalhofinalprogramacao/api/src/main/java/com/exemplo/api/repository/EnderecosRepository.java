package com.exemplo.api.repository;

import com.exemplo.api.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecosRepository extends JpaRepository<Endereco, Long>{

    Endereco findById(long id);

}
