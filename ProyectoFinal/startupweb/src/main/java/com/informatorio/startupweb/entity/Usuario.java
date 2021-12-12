package com.informatorio.startupweb.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;

import lombok.NonNull;
import lombok.ToString;

@Entity
//@Getter @Setter
@ToString
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String apellido;

    @Column(unique = true, nullable = false)
    private String email;

    @NonNull
    @ToString.Exclude
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    
    private String password;

    @CreationTimestamp
    private LocalDate fechaDeAlta;

    private String ciudad;
    private String provincia;
    private String pais;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoDeUsuario tipoDeUsuario;

    @OneToMany(mappedBy = "creador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Emprendimiento> emprendimientos = new ArrayList<>();

    public Usuario() {

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public void agregarEmprendimiento(Emprendimiento emprendimiento){
        emprendimientos.add(emprendimiento);
        emprendimiento.setCreador(this);
    }

    public void removerEmprendimiento(Emprendimiento emprendimiento){
        emprendimientos.remove(emprendimiento);
        emprendimiento.setCreador(null);
    }

    

   
    
}
