package com.adopet.model.entity;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class Pessoa implements Serializable{
    
    private Long id;
    private String nome;
    private Integer idade;
    private String Sexo;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;

    private List<Pet> myPetsToAdoption;
    private List<Pet> myPetsInterestToAdot;
}
