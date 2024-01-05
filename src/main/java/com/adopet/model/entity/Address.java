package com.adopet.model.entity;

import com.adopet.model.dto.AddressDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String street;

    @Column(length = 8)
    private String number;

    @Column(length = 30)
    private String neigthborhood;
    
    @Column(length = 8)
    private String cep;

    @Column(length = 30)
    private String city;

    @Column(length = 30)
    private String state;

    public Address(AddressDto address){
        this.street = address.street();
        this.number = address.number();
        this.neigthborhood = address.neighborhood();
        this.city = address.city();
        this.cep = address.cep();
        this.state = address.state();
    }


}
