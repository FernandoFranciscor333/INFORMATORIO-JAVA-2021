package com.informatorio.startupweb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.informatorio.startupweb.dto.EventoDto;
import com.informatorio.startupweb.entity.Evento;
import com.informatorio.startupweb.repository.EventoRepository;
import com.informatorio.startupweb.service.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    //OBTENER TODOS LOS EVENTOS
    @GetMapping
    public List<Evento> obtenerTodosLosEventos(){
        return eventoService.obtenerTodosLosEventos();
    }
    
    //OBTENER EVENTO POR ID
    @GetMapping(path = "/{id}")
    public Evento obtenerEventoPorId(@PathVariable("id") Long id){
        return this.eventoService.obtenerPorId(id);
    }


    //ALTA, BAJA Y MODIFICACION
    @PostMapping
    public ResponseEntity<?> crearEvento(@Valid @RequestBody Evento evento){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                eventoService.crearEvento(evento));        
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarEvento(@PathVariable("id") Long id){
        boolean ok = this.eventoService.eliminarEvento(id);
        if(ok){
            return "Se eliminó el Evento con el id " + id;            
        }else{
            return "No se pudo eliminar el Evento con id " + id;
        }
    }

    @PutMapping("/{id}")
    public Evento actualizarEvento(@PathVariable Long id, @RequestBody Evento evento){
        return this.eventoService.actualizarEvento(id, evento);
    }

    /*@GetMapping(value = "/{id}/ranking")
    public ResponseEntity<?> rankingDelEvento(@PathVariable("id") Long id) {
        return new ResponseEntity<>(eventoService.rankear(id), HttpStatus.OK);
    }*/


    //SUSCRIBIR EMPRENDIMIENTO
    @PostMapping("/suscribir")
    public ResponseEntity<?> suscribirEmprendimiento(@Valid @RequestBody EventoDto eventoDto){
        return new ResponseEntity<>(eventoService.suscribirEmprendimiento(eventoDto), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}/ranking")
    public ResponseEntity<?> rankingDelEvento(@PathVariable("id") Long id) {
        return new ResponseEntity<>(eventoService.rankearEmprendimientos(id), HttpStatus.OK);
    }
    
}
