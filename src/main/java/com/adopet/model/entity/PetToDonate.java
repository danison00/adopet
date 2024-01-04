package com.adopet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class PetToDonate extends Pet {

    @ManyToOne()
    @JoinColumn(name = "human_id_fk")
    private Human human;
    
}