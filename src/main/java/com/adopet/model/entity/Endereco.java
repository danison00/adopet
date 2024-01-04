package com.adopet.model.entity;

import lombok.Data;

@Data
public class Endereco {

    private Long id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    
}
