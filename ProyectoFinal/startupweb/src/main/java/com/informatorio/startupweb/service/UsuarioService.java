package com.informatorio.startupweb.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.informatorio.startupweb.entity.Usuario;
import com.informatorio.startupweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    //GET ALL/BY ID
    public ArrayList<Usuario> obtenerTodosLosUsuarios(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public ArrayList<Usuario> obtenerPorTipoDeUsuario(String tipoDeUsuario){
        return usuarioRepository.findByTipoDeUsuario(tipoDeUsuario);
    }

    public Optional<Usuario> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

    //ALTA, BAJA y MODIFICACION
    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public Usuario actualizarUsuario(Long id, Usuario usuario) {
        Usuario usuarioActualizado = usuarioRepository.getById(id);
        if(usuario.getNombre() != null){
            usuarioActualizado.setNombre(usuario.getNombre());
        }
        if(usuario.getApellido() != null){
            usuarioActualizado.setApellido(usuario.getApellido());
        }
        if(usuario.getEmail() != null) {
            usuarioActualizado.setEmail(usuario.getEmail());
        }
        if(usuario.getCiudad() != null) {
            usuarioActualizado.setCiudad(usuario.getCiudad());
        }
        if(usuario.getProvincia() != null) {
            usuarioActualizado.setProvincia(usuario.getProvincia());
        }
        if(usuario.getPais() != null) {
            usuarioActualizado.setPais(usuario.getPais());
        }
        if(usuario.getTipoDeUsuario() != null) {
            usuarioActualizado.setTipoDeUsuario(usuario.getTipoDeUsuario());
        }
        return usuarioRepository.save(usuarioActualizado);
    }    

    // OBTENER USUARIOS POR CIUDAD
    public List<Usuario> obtenerUsuariosPorCiudad(String ciudad) throws Exception{
        try {
            List<Usuario> usuarios = usuarioRepository.findByCiudad(ciudad);
            return usuarios;            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } 
    }

    // OBTENER USUARIOS POSTERIORES A X FECHA DE CREACION 
    public List<Usuario> obtenerUsuariosPorFecha(LocalDate fecha){
        List<Usuario> usuarios = usuarioRepository.findByFechaDeAlta(fecha)
                                .stream().filter(p -> fecha.compareTo(
                                p.getFechaDeAlta()) <= 0).collect(Collectors.toList());
        return usuarios;        
    }
}
