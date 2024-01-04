package com.adopet.model.entity;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especie;
    private String imgPath;
    private String sexo;
    private Integer idade;
    private Boolean castrado;
    private Boolean cuidadosEspeciais;
    private String caracteristicas;
    private String descricao;
    private Boolean disponivel;
    private Integer numInteresses;
}
