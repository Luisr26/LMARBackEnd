package com.example.demo.springboot.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.springboot.Model.Entity.Usuario;
import com.example.demo.springboot.Service.UsuarioService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:8080")
public class UsuarioController {
    private final UsuarioService servicio;

    public UsuarioController(UsuarioService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return servicio.listar();
    }

    @PostMapping(value = "", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario){
        Usuario nuevo = servicio.guardar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @PutMapping("path/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        return entity;
    }

}
