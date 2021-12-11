package com.informatorio.startupweb.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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




    /*@ElementCollection
    @CollectionTable(name = "tags")
    private List<String> tags = new ArrayList<>();*/

    //private List<Tags> tags;

    /*@OneToMany(mappedBy = "emprendimientos")
    @JsonIgnore
    private List<Voto> votos = new ArrayList<>();*/

    


    public Emprendimiento() {
    }

    

    public Emprendimiento(String nombre, String descripcion, String contenido) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contenido = contenido;
    }



    public Emprendimiento(Long id, String nombre, String descripcion, String contenido, LocalDate fechaDeAlta,
            Double objetivo, Boolean publicado, String url, List<Tag> tags) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contenido = contenido;
        this.fechaDeAlta = fechaDeAlta;
        this.objetivo = objetivo;
        this.publicado = publicado;
        this.url = url;
        this.tags = tags;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
}
