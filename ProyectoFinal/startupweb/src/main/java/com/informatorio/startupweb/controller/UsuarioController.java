package com.informatorio.startupweb.controller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import com.informatorio.startupweb.entity.Usuario;
import com.informatorio.startupweb.repository.UsuarioRepository;
import com.informatorio.startupweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioRepository usuarioRepository;

    //OBTENER TODOS LOS USUARIOS
    @GetMapping("/usuarios_lista")
    public ArrayList<Usuario> obtenerTodosLosUsuarios(){
        return usuarioService.obtenerTodosLosUsuarios();
    }

    //OBTENER POR ID
    @GetMapping(path = "/{id}")
    public Optional<Usuario> obtenerPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }

    //ALTA, BAJA y MODIFICACION
    @PostMapping("/nuevo_usuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.crearUsuario(usuario);
    }

    @DeleteMapping(path = "{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Se eliminó el usuario con el id " + id;            
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }
    
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return this.usuarioService.actualizarUsuario(id, usuario);
    }

    //OBTENER USUARIOS POR CIUDAD
    @GetMapping("/busqueda")
    public ResponseEntity<?> busqueda(@RequestParam String ciudad){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                usuarioService.obtenerUsuariosPorCiudad(ciudad));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                ("{/error\": \""+e.getMessage()+"\"}"));
        }
    }

    //OBTENER USUARIOS POR FECHA DE CREACION
    @GetMapping(value="/busqueda_fecha")
    public ResponseEntity<?> busqueda_fecha(@DateTimeFormat (iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate fecha){
        return new ResponseEntity<>(usuarioService.obtenerUsuariosPorFecha(fecha), HttpStatus.OK);            
    }    
}
