package com.adopet.model.dto;

import java.io.Serializable;

public record PetDto(
        Long id,
        String nome,
        String especie,
        String imgPath,
        String sexo,
        Integer idade,
        Boolean castrado,
        Boolean cuidadosEspeciais,
        String caracteristicas,
        String descricao
) implements Serializable {}
