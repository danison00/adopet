package com.adopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.PetToAdopt;

public interface PetForAdoptRepository extends JpaRepository<PetToAdopt, Long> {
    
}
