package com.adopet.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.adopet.model.dto.PetDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private int numInteresses;

    @Lob

    private byte[] imagemByte;

    @ManyToOne()
    @JoinColumn(name = "owner_id_fk")
    private Human owner;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "humans_petsOfInterested", joinColumns = @JoinColumn(name = "pet_id_fk"), inverseJoinColumns = @JoinColumn(name = "human_id_fk"))
    private Set<Human> interestedHumans = new HashSet<Human>();

    public Pet(PetDto petDto, Human human)  {
        this.nome = petDto.nome();
        this.imagemByte = petDto.imagemByte();
        this.especie = petDto.especie();
        this.sexo = petDto.sexo();
        this.idade = petDto.idade();
        this.castrado = petDto.castrado();
        this.cuidadosEspeciais = petDto.cuidadosEspeciais();
        this.caracteristicas = petDto.caracteristicas();
        this.disponivel = true;
        this.numInteresses = 0;
        this.owner = human;
    }

    public PetDto getDto() {
        return new PetDto(
                this.id,
                this.imagemByte,
                this.nome,
                this.especie,
                this.sexo,
                this.idade,
                this.castrado,
                this.cuidadosEspeciais,
                this.caracteristicas);
    }

}
