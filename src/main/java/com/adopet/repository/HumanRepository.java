package com.adopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adopet.model.entity.Human;

public interface HumanRepository  extends JpaRepository<Human, Long>{
    
}
