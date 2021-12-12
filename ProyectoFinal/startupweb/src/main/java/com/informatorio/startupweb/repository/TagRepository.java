package com.informatorio.startupweb.repository;

import com.informatorio.startupweb.entity.Tag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

    //HashSet<Tag> findByNombreTag(String nombreTag);


    
    //Tag findByNombre(String nombre);

}
