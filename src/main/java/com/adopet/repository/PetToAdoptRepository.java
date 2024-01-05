package com.adopet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adopet.model.entity.Human;
import com.adopet.model.entity.PetToAdopt;

public interface PetToAdoptRepository extends JpaRepository<PetToAdopt, Long> {

    List<PetToAdopt> findByHuman(Human human);
    
}
