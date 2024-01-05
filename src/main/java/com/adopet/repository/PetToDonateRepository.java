package com.adopet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adopet.model.entity.Human;
import com.adopet.model.entity.PetToDonate;

public interface PetToDonateRepository extends JpaRepository<PetToDonate, Long> {

    List<PetToDonate> findByHuman(Human human);
    
}
