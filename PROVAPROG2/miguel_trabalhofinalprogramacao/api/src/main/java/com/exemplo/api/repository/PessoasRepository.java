package com.exemplo.api.repository;

import com.exemplo.api.models.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoasRepository extends JpaRepository<Pessoas, Long>{

    Pessoas findById(long id);

}
