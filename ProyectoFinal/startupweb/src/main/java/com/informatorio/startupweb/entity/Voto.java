package com.informatorio.startupweb.entity;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Getter @Setter
//@Table(name = "votos")
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String generadoPor;
    private Usuario usuario;
    
    @CreationTimestamp
    private LocalDate fechaDeCreacion;

    
}
