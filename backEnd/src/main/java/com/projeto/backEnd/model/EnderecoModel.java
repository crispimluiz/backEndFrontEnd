package com.projeto.backEnd.model;

import com.projeto.backEnd.model.enuns.EnderecoResidencialComercial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "endereco")
public class EnderecoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "logradouro",nullable = false)
    private String logradouro;

    @Column(name = "numero",nullable = false)
    private String numero;

    @Column(name = "bairro",nullable = false)
    private String bairro;

    @Column(name = "cep",nullable = false)
    private String cep;

    //Enum do tipo de endereco
    @Enumerated(EnumType.STRING)
    private EnderecoResidencialComercial residencialComercial;

}
