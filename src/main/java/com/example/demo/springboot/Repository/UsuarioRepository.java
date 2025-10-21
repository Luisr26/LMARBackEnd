package com.example.demo.springboot.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.springboot.Model.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
