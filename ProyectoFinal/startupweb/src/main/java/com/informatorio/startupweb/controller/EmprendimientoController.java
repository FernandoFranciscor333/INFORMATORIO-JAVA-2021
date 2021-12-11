package com.informatorio.startupweb.controller;

import java.util.ArrayList;

import com.informatorio.startupweb.entity.Emprendimiento;
import com.informatorio.startupweb.repository.EmprendimientoRepository;
import com.informatorio.startupweb.repository.TagRepository;
import com.informatorio.startupweb.service.EmprendimientoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/emprendimiento")
public class EmprendimientoController {

    
    @Autowired
    EmprendimientoRepository emprendimientoRepository;
    @Autowired
    EmprendimientoService emprendimientoService;
    @Autowired
    TagRepository tagRepository;

    //OBTENER TODOS LOS EMPRENDIMIENTOS
    @GetMapping("/emprendimientos_lista")
    public ArrayList<Emprendimiento> obtenerTodosLosEmprendimientos(){
        return emprendimientoService.obtenerTodosLosEmprendimientos();
    }

    //OBTENER EMPRENDIMIENTO POR ID
    @GetMapping(path = "/{id}")
    public Emprendimiento obtenerEmprendimientoPorId(@PathVariable("id") Long id){
        return this.emprendimientoService.obtenerPorId(id);
    }

    //ALTA, BAJA Y MODIFICACION
    @PostMapping("/nuevo_emprendimiento")
    public Emprendimiento crearEmprendimiento(@RequestBody Emprendimiento emprendimiento){
        return this.emprendimientoService.crearEmprendimiento(emprendimiento);
    }

    @DeleteMapping(path = "{id}")
    public String eliminarEmprendimientoPorId(@PathVariable("id") Long id){
        boolean ok = this.emprendimientoService.eliminarEmprendimiento(id);
        if(ok){
            return "Se eliminó el Emprendimiento con el id " + id;            
        }else{
            return "No se pudo eliminar el Emprendimiento con id " + id;
        }
    }

    @PutMapping("/{id}")
    public Emprendimiento actualizarEmprendimiento(@PathVariable Long id, @RequestBody Emprendimiento emprendimiento){
        return this.emprendimientoService.actualizarUsuario(id, emprendimiento);
    }

    //OBTENER EMPRENDIMIENTOS SIN PUBLICADOS
    @GetMapping("/emprendimientos_sin_publicar")
    public ArrayList<Emprendimiento> obtenerTodosLosEmprendimientosSinPublicar(){
        return emprendimientoService.obtenerTodosLosEmprendimientosSinPublicar();
    }

    //BUSCAR EMPRENDIMIENTOS POR TAG
    @GetMapping("/busqueda_tag")
    public ResponseEntity<?> busquedaTag(@RequestParam(name = "tag")String tag){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                emprendimientoService.obtenerEmprendimientoPorTag(tag));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                ("{/error\": \""+e.getMessage()+"\"}"));
        }
    }


    /*@GetMapping("/busqueda_por_tag")
    public ResponseEntity<?> busqueda(@RequestParam String tag){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                emprendimientoService.obtenerEmprendimientosPorTag(tag));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                ("{/error\": \""+e.getMessage()+"\"}"));
        }
    }*/



    
}
