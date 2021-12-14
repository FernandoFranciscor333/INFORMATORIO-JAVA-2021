package com.informatorio.startupweb.service;

import java.util.ArrayList;

import java.util.List;


import javax.persistence.EntityNotFoundException;


import com.informatorio.startupweb.dto.EmprendimientoDto;
import com.informatorio.startupweb.entity.Emprendimiento;

import com.informatorio.startupweb.entity.Usuario;
import com.informatorio.startupweb.repository.EmprendimientoRepository;
import com.informatorio.startupweb.repository.TagRepository;
import com.informatorio.startupweb.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprendimientoService {

    private final EmprendimientoRepository emprendimientoRepository;
    private final UsuarioRepository usuarioRepository;
    private final TagRepository tagRepository;

    @Autowired
    public EmprendimientoService(EmprendimientoRepository emprendimientoRepository,
                                 UsuarioRepository usuarioRepository,
                                 TagRepository tagRepository) {
        this.emprendimientoRepository = emprendimientoRepository;
        this.usuarioRepository = usuarioRepository;
        this.tagRepository = tagRepository;
    }


    public ArrayList<Emprendimiento> obtenerTodosLosEmprendimientos() {
        return (ArrayList<Emprendimiento>)emprendimientoRepository.findAll();
    }

    public Emprendimiento obtenerPorId(Long id){
        return emprendimientoRepository.getById(id);
    }

    //ALTA, BAJA Y MODIFICACIÓN
    public Emprendimiento crearEmprendimiento(EmprendimientoDto emprendimientoDto) {
        Usuario usuario = usuarioRepository.findById(emprendimientoDto.getIdUsuario())
            .orElseThrow(() -> new EntityNotFoundException("Usuario inexistente"));        
        Emprendimiento emprendimiento = new Emprendimiento();
        emprendimiento.setCreador(usuario);
        emprendimiento.setNombre(emprendimientoDto.getNombre());
        emprendimiento.setDescripcion(emprendimientoDto.getDescripcion());        
        emprendimiento.setContenido(emprendimientoDto.getContenido());
        emprendimiento.setObjetivo(emprendimientoDto.getObjetivo());
        emprendimiento.setPublicado(emprendimientoDto.getPublicado());
        emprendimiento.setUrl(emprendimientoDto.getUrl());
        emprendimiento.setTags(emprendimientoDto.getTags());

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

    public Emprendimiento actualizarEmprendimiento(Long id, Emprendimiento emprendimiento) {
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

    //EMPRENDIMIENTOS SIN PUBLICAR
    public ArrayList<Emprendimiento> obtenerTodosLosEmprendimientosSinPublicar() {
        return (ArrayList<Emprendimiento>)emprendimientoRepository.findByNoPublicado();
    }

    //EMPRENDIMIENTOS POR TAG
    public List<Emprendimiento> obtenerEmprendimientoPorTag(String nombreTag) throws Exception{
        try {
            List<Emprendimiento> emprendimientosTags = emprendimientoRepository.findByNombreTag(nombreTag);
            return emprendimientosTags;            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }        
    }    


         
}
