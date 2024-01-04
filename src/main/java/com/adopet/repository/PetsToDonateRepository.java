package com.adopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.PetsToDonate;

public interface PetsToDonateRepository extends JpaRepository<PetsToDonate, Long> {
    
}
