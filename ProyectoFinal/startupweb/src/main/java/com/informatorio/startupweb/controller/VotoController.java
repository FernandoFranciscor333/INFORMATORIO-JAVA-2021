package com.informatorio.startupweb.controller;
import javax.validation.Valid;
import com.informatorio.startupweb.dto.VotoDto;
import com.informatorio.startupweb.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/voto")
public class VotoController {

    @Autowired
    VotoService votoService;

    //GENERAR VOTO
    @PostMapping
    public ResponseEntity<?> votar(@Valid @RequestBody VotoDto votoDto){
        return new ResponseEntity<>(votoService.generarVoto(votoDto), HttpStatus.CREATED);
    }

    //OBTENER VOTOS DE USUARIO
    @GetMapping("/usuario")
    public ResponseEntity<?> votosDeusuario(@RequestParam(name = "usuarioId") Long usuarioId){
        return new ResponseEntity<>(votoService.buscarVotoUsuario(usuarioId), HttpStatus.ACCEPTED);
    }    
}
