package com.adopet.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.adopet.model.dto.HumanDto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class Human implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60)
    private String name;

    private Integer age;

    @Column(length = 10)
    private String gender;

    @Column(length = 11, unique = true)
    private String cpf;

    @Column(length = 15)
    private String telephone;

    @Column(length = 50, unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "andress_id_fk")
    private Address andress;
    
    @JsonIgnore
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Pet> pets;

    @JsonIgnore
    @ManyToMany(mappedBy = "interestedHumans", cascade = CascadeType.ALL)
    private Set<Pet> petsOfInterest = new HashSet<Pet>();

    public Human(HumanDto humanDto, Address address) {
        this.name = humanDto.name();
        this.age = humanDto.age();
        this.gender = humanDto.gender();
        this.cpf = humanDto.cpf();
        this.telephone = humanDto.telephone();
        this.email = humanDto.email();
        this.andress = address;
    }

}
