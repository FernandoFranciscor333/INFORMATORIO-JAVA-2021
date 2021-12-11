package com.informatorio.startupweb.repository;

import java.util.ArrayList;
import java.util.List;

import com.informatorio.startupweb.entity.Emprendimiento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long> {

    @Query("FROM Emprendimiento WHERE publicado = 0")
    ArrayList<Emprendimiento> findByNoPublicado();

    @Query("SELECT e FROM Emprendimiento e join fetch e.tags t WHERE t.nombreTag LIKE %:tag%")
    List<Emprendimiento> findByNombreTag(@Param("tag") String tag);

    /*@Query("SELECT s FROM Emprendimiento s JOIN s.tags t WHERE t = LOWER(:tag)")
    List<Emprendimiento> findByTag(@Param("tag") String tag);*/
    
}
