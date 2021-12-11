package com.informatorio.startupweb.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Getter @Setter
//@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detalles;
    private LocalDate fechaDeCreacion;
    private LocalDate fechaDeCierre;
    private String estado;
    private List<Emprendimiento> supscriptores = new ArrayList<>();
    private Double premio;
    
}
