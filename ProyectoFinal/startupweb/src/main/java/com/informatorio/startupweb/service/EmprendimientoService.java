package com.informatorio.startupweb.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.informatorio.startupweb.entity.Emprendimiento;
import com.informatorio.startupweb.entity.Tag;
import com.informatorio.startupweb.repository.EmprendimientoRepository;
import com.informatorio.startupweb.repository.TagRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprendimientoService {

    @Autowired
    EmprendimientoRepository emprendimientoRepository;

    @Autowired
    TagRepository tagRepository;

    public ArrayList<Emprendimiento> obtenerTodosLosEmprendimientos() {
        return (ArrayList<Emprendimiento>)emprendimientoRepository.findAll();
    }

    public Emprendimiento obtenerPorId(Long id){
        return emprendimientoRepository.getById(id);
    }

    public Emprendimiento crearEmprendimiento(Emprendimiento emprendimiento) {
        return emprendimientoRepository.save(emprendimiento);
    }

    public boolean eliminarEmprendimiento(Long id) {
        try{
            emprendimientoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public Emprendimiento actualizarUsuario(Long id, Emprendimiento emprendimiento) {
        Emprendimiento emprendimientoActualizado = emprendimientoRepository.getById(id);
        if(emprendimiento.getNombre() != null){
            emprendimientoActualizado.setNombre(emprendimiento.getNombre());
        }
        if(emprendimiento.getDescripcion() != null){
            emprendimientoActualizado.setDescripcion(emprendimiento.getDescripcion());
        }
        if(emprendimiento.getContenido() != null) {
            emprendimientoActualizado.setContenido(emprendimiento.getContenido());
        }
        if(emprendimiento.getObjetivo() != null) {
            emprendimientoActualizado.setObjetivo(emprendimiento.getObjetivo());
        }
        if(emprendimiento.getPublicado() != null) {
            emprendimientoActualizado.setPublicado(emprendimiento.getPublicado());
        }
        if(emprendimiento.getUrl() != null) {
            emprendimientoActualizado.setUrl(emprendimiento.getUrl());
        }
        return emprendimientoRepository.save(emprendimientoActualizado);
    }

    public ArrayList<Emprendimiento> obtenerTodosLosEmprendimientosSinPublicar() {
        return (ArrayList<Emprendimiento>)emprendimientoRepository.findByNoPublicado();
    }

    public List<Emprendimiento> obtenerEmprendimientoPorTag(String nombreTag) throws Exception{
        try {
            List<Emprendimiento> emprendimientosTags = emprendimientoRepository.findByNombreTag(nombreTag);
            return emprendimientosTags;            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }        
    }    


         
}
