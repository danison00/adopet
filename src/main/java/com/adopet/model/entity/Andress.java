package com.adopet.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Andress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String street;

    @Column(length = 8)
    private String number;

    @Column(length = 30)
    private String neigthborhood;

    @Column(length = 30)
    private String city;

    @Column(length = 30)
    private String state;

}