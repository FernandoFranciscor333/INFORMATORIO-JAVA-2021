package com.informatorio.startupweb.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
@Table(name="emprendimientos")
public class Emprendimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    private Usuario creador;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "contenido")
    private String contenido;

    @CreationTimestamp
    @Column(name = "publicado_en")
    private LocalDate fechaDeAlta;

    @Column(name = "objetivo")
    private Double objetivo;

    @Column(name = "publicado")
    private Boolean publicado;

    @Column(name = "urls")
    private String url;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "emprendimiento",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Voto> votos = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Evento> eventos;

    /*@JoinTable(
        name = "eventos_emprendimientos",
        joinColumns = {@JoinColumn(name = "emprendimientos",nullable = false)},
        inverseJoinColumns = {@JoinColumn(name = "eventos",nullable = false)}
    )
    @ManyToMany(cascade = {
            CascadeType.PERSIST,//When we save the Emprendimiento entity, the Event entity will also get saved
            CascadeType.MERGE //Cascade the merge operation to all associated entities merge
    })*/



    public Emprendimiento() {
    }

    public void addEvento(Evento evento) {
        if (this.eventos == null) {
            this.eventos = new ArrayList<>();
        }
        this.eventos.add(evento);
    }

    

    public List<Evento> getEventos() {
        return eventos;
    }



    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }



    public List<Voto> getVotos() {
        return votos;
    }
    
    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }




    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Usuario getCreador() {
        return creador;
    }


    public void setCreador(Usuario creador) {
        this.creador = creador;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getContenido() {
        return contenido;
    }


    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }


    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }


    public Double getObjetivo() {
        return objetivo;
    }


    public void setObjetivo(Double objetivo) {
        this.objetivo = objetivo;
    }


    public Boolean getPublicado() {
        return publicado;
    }


    public void setPublicado(Boolean publicado) {
        this.publicado = publicado;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public List<Tag> getTags() {
        return tags;
    }


    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }   

    
    
}
