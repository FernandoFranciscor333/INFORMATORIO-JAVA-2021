package com.informatorio.startupweb.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@RequiredArgsConstructor
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreTag;   

    @ManyToMany(mappedBy = "tags")    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ToString.Exclude    
    private List<Emprendimiento> emprendimientos = new ArrayList<>();

    public Tag() {
    }

    public Tag(String nombreTag) {
        this.nombreTag = nombreTag;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTag() {
        return nombreTag;
    }

    public void setNombreTag(String nombreTag) {
        this.nombreTag = nombreTag;
    }

    @JsonIgnore
    public List<Emprendimiento> getEmprendimientos() {
        return emprendimientos;
    }

    public void setEmprendimientos(List<Emprendimiento> emprendimientos) {
        this.emprendimientos = emprendimientos;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Tag tags = (Tag) o;
        return id != null && Objects.equals(id, tags.id);
    }*/

    /*@Override
    public int hashCode() {
        return getClass().hashCode();
    }*/

    
}
