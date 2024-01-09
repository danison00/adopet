package com.adopet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.Human;

public interface HumanRepository extends JpaRepository<Human, Long> {

    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);

    Optional<Human> findByCpf(String cpf);

}
