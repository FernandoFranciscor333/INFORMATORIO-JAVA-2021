package com.informatorio.startupweb.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.informatorio.startupweb.entity.Tag;


public class CreacionEmprendimiento {

    @NotNull
    @Positive
    @JsonProperty(value = "idUsuario")
    private Long idUsuario;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String descripcion;

    private String contenido;

    private Double objetivo;

    private Boolean publicado;

    private String url;

    private List<Tag> tags;    

    public CreacionEmprendimiento() {
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
    
    
}
