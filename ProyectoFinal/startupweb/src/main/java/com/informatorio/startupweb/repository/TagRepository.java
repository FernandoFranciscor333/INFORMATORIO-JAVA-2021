package com.informatorio.startupweb.repository;

import java.util.ArrayList;
import java.util.HashSet;

import com.informatorio.startupweb.entity.Emprendimiento;
import com.informatorio.startupweb.entity.Tag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

    HashSet<Tag> findByNombreTag(String nombreTag);


    
    //Tag findByNombre(String nombre);

}
