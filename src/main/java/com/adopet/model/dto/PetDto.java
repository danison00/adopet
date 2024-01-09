package com.adopet.model.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public record PetDto(
        Long id,
        byte[] imagemByte,
        String nome,
        String especie,
        String sexo,
        Integer idade,
        Boolean castrado,
        Boolean cuidadosEspeciais,
        String caracteristicas) implements Serializable {}
