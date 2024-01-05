package com.adopet.model.dto;

import java.io.Serializable;

public record HumanDto(
        String name,
        Integer age,
        String gender,
        String cpf,
        String telephone,
        String email,
        AddressDto adress
) implements Serializable {}
