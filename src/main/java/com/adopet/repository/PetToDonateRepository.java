package com.adopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.PetToDonate;

public interface PetToDonateRepository extends JpaRepository<PetToDonate, Long> {
    
}
