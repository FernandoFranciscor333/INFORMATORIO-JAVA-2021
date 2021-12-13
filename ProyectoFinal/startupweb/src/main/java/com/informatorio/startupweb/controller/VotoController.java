package com.informatorio.startupweb.controller;

import java.util.List;

import javax.validation.Valid;

import com.informatorio.startupweb.dto.VotoDto;
import com.informatorio.startupweb.entity.Usuario;
import com.informatorio.startupweb.entity.Voto;
import com.informatorio.startupweb.repository.VotoRepository;
import com.informatorio.startupweb.service.VotoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/voto")
public class VotoController {

    @Autowired
    VotoService votoService;

    @PostMapping
    public ResponseEntity<?> votar(@Valid @RequestBody VotoDto votoDto){
        return new ResponseEntity<>(votoService.generarVoto(votoDto), HttpStatus.CREATED);
    }

    @GetMapping("/usuario")
    public ResponseEntity<?> votosDeusuario(@RequestParam(name = "usuarioId") Long usuarioId){
        return new ResponseEntity<>(votoService.buscarVotoUsuario(usuarioId), HttpStatus.ACCEPTED);
    }
    
}
