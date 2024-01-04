package com.adopet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class PetsForAdoption  extends Pet{
    

    @ManyToOne
    @JoinColumn(name = "human_id_fk")
    private Human human; 
}
