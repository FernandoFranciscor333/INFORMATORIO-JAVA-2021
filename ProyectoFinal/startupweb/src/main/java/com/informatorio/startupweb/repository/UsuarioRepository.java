package com.informatorio.startupweb.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.informatorio.startupweb.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByNombre(String nombre);

    List<Usuario> findByCiudad(String ciudad);

    @Query("FROM Usuario WHERE fechaDeAlta >= ?1")
    List<Usuario> findByFechaDeAlta(LocalDate fechaDeAlta);
    
    public abstract ArrayList<Usuario> findByTipoDeUsuario(String tipoDeUsuario);

    @Query("SELECT s FROM Usuario s WHERE s.email = ?1")
    Optional<Usuario> findByEmail(String email);
}
