package com.adopet.model.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Human implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60)
    private String name;

    private Integer age;

    @Column(length = 10)
    private String gender;

    @Column(length = 11)
    private String cpf;

    @Column(length = 15)
    private String telephone;

    @Column(length = 50)
    private String email;

    // private Endereco endereco;

    @OneToMany(mappedBy = "human", cascade = CascadeType.ALL)
    private List<PetsForAdoption> petsForAdoption;

    @OneToMany(mappedBy = "human", cascade = CascadeType.ALL)
    private List<PetsToDonate> petsToDonate;
}
