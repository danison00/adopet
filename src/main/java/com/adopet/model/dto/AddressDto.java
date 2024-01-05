package com.adopet.model.dto;

import java.io.Serializable;

public record AddressDto(
        String street,
        String number,
        String neighborhood,
        String cep,
        String city,
        String state
) implements Serializable {}

