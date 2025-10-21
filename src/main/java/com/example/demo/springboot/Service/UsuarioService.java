package com.example.demo.springboot.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.springboot.Model.Entity.Usuario;
import com.example.demo.springboot.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepo;

    public UsuarioService(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public List<Usuario> listar() {
        return usuarioRepo.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
}
