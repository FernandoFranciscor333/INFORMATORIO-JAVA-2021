package com.informatorio.startupweb.repository;

import java.util.List;

import com.informatorio.startupweb.entity.Voto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VotoRepository extends JpaRepository<Voto, Long> {

    List<Voto> findByUsuarioId(Long usuarioId);

    /*@Query("SELECT e FROM Emprendimiento e join fetch e.tags t WHERE t.usuarioId LIKE %:tag%")
    List<Voto> findVoteByUsuario(@Param("usuarioId") Long id);*/
    
}
