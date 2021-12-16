package com.informatorio.startupweb.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import com.informatorio.startupweb.dto.VotoDto;
import com.informatorio.startupweb.entity.Emprendimiento;
import com.informatorio.startupweb.entity.Usuario;
import com.informatorio.startupweb.entity.Voto;
import com.informatorio.startupweb.repository.EmprendimientoRepository;
import com.informatorio.startupweb.repository.UsuarioRepository;
import com.informatorio.startupweb.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EmprendimientoRepository emprendimientoRepository;

    //GENERAR VOTO
    public Object generarVoto(@Valid VotoDto votoDto) {
        Usuario usuario = usuarioRepository.findById(votoDto.getUsuarioId())
            .orElseThrow(() -> new EntityNotFoundException("Usuario inexistente"));
        Emprendimiento emprendimiento = emprendimientoRepository.findById(votoDto.getEmprendimientoId())
            .orElseThrow(() -> new EntityNotFoundException("Emprendimiento inexistente"));

        if(emprendimiento.getPublicado()){
            emprendimiento.setContadorDeVotos(emprendimiento.getContadorDeVotos()+1);
            emprendimientoRepository.save(emprendimiento);
            Voto votoUsuario = new Voto();
            votoUsuario.setEmprendimiento(emprendimiento);
            votoUsuario.setUsuario(usuario);
            votoUsuario.setGeneradoPor(votoDto.getGeneradoPor()); 

            return votoRepository.save(votoUsuario);
        } else {
            return "El emprendimiento no existe o no está aún publicado";
        }        
    }

    //BUSCAR VOTOS DE USUARIO
    public List<Voto> buscarVotoUsuario(Long usuarioId) {
        return votoRepository.findByUsuarioId(usuarioId);
    }
}
