package com.informatorio.startupweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import com.informatorio.startupweb.dto.EventoDto;
import com.informatorio.startupweb.entity.Emprendimiento;
import com.informatorio.startupweb.entity.EstadoEvento;
import com.informatorio.startupweb.entity.Evento;
import com.informatorio.startupweb.repository.EmprendimientoRepository;
import com.informatorio.startupweb.repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private EmprendimientoRepository emprendimientoRepository;

    public List<Evento> obtenerTodosLosEventos() {
        return (List<Evento>)eventoRepository.findAll();
    }

    public Evento obtenerPorId(Long id) {
        return eventoRepository.getById(id);
    }


    //ALTA, BAJA Y MODIFICACION
    public Evento crearEvento(@Valid Evento evento) {
        return eventoRepository.save(evento);
    }

    public boolean eliminarEvento(Long eventoId) {
        try {
            eventoRepository.deleteById(eventoId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Evento actualizarEvento(Long id, Evento evento) {
        Evento eventoActualizado = eventoRepository.getById(id);
        if(evento.getNombreEvento() !=null){
            eventoActualizado.setNombreEvento(evento.getNombreEvento());
        }
        if(evento.getDetalles() !=null){
            eventoActualizado.setDetalles(evento.getDetalles());
        }
        if(evento.getNombreEvento() !=null){
            eventoActualizado.setFechaDeCierre(evento.getFechaDeCierre());
        }
        if(evento.getNombreEvento() !=null){
            eventoActualizado.setEstado(evento.getEstado());
        }
        if(evento.getPremio() !=null){
            eventoActualizado.setPremio(evento.getPremio());
        }
        return eventoRepository.save(eventoActualizado);
    }

    public Emprendimiento registrar(Long emprendimientoId, Long eventoId, EventoDto eventoDto) {
        Emprendimiento emprendimientoRegistrado = emprendimientoRepository.getById(emprendimientoId);
        Evento eventoRegistrado = eventoRepository.getById(eventoId);
        if (eventoRegistrado.getEstado() == EstadoEvento.ABIERTO) { emprendimientoRegistrado.addEvento(eventoRegistrado);
            System.out.println("Suscripcion correcta");
        } else if (eventoRegistrado.getEstado() == EstadoEvento.EN_CURSO) { 
            System.out.println("Tiempo de suscripcion finalizado");
        } else { System.out.println("Evento finalizado."); }
        return emprendimientoRepository.save(emprendimientoRegistrado);
    }

    public Optional<Evento> rankear(Long id) {
        return eventoRepository.findById(id);
    }


    /*public Evento suscribirEmprendimiento(@Valid EventoDto eventoDto) {
        Emprendimiento emprendimiento = emprendimientoRepository.findById(eventoDto.getEmprendimientoId())
            .orElseThrow(() -> new EntityNotFoundException("Emprendimiento inexistente"));
        Evento eventoSuscripcion = eventoRepository.findById(eventoDto.getEventoId())
            .orElseThrow(() -> new EntityNotFoundException("Evento inexistente"));
        eventoSuscripcion.setEmprendimientos(emprendimiento);

        return eventoRepository.save(eventoSuscripcion);

    }*/

    
}
