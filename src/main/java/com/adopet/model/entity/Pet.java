package com.adopet.model.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Pet  implements Serializable{

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
