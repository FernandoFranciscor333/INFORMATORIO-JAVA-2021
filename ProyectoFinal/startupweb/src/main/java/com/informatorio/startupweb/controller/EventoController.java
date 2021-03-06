package com.informatorio.startupweb.controller;
import java.util.List;
import javax.validation.Valid;
import com.informatorio.startupweb.dto.EventoDto;
import com.informatorio.startupweb.entity.Evento;
import com.informatorio.startupweb.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            return "Se eliminĂ³ el Evento con el id " + id;            
        }else{
            return "No se pudo eliminar el Evento con id " + id;
        }
    }

    @PutMapping("/{id}")
    public Evento actualizarEvento(@PathVariable Long id, @RequestBody Evento evento){
        return this.eventoService.actualizarEvento(id, evento);
    }

    //SUSCRIBIR EMPRENDIMIENTO
    @PostMapping("/suscribir")
    public ResponseEntity<?> suscribirEmprendimiento(@Valid @RequestBody EventoDto eventoDto){
        return new ResponseEntity<>(eventoService.suscribirEmprendimiento(eventoDto), HttpStatus.CREATED);
    }

    //OBTENER RANKING
    @GetMapping(value = "/{id}/ranking")
    public ResponseEntity<?> rankingDelEvento(@PathVariable("id") Long id) {
        return new ResponseEntity<>(eventoService.rankearEmprendimientos(id), HttpStatus.OK);
    }
    
}
